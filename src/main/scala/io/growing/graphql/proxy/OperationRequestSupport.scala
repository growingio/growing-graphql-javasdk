package io.growing.graphql.proxy

import java.lang.reflect.Method

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest
import io.growing.graphql.proxy.cache.{ Cache, LruCache }
import io.growing.graphql.util.AsmUtils

import scala.collection.JavaConverters._

/**
 * construct request
 *
 * @author liguobin@growingio.com
 * @version 1.0,2020/8/31
 */
trait OperationRequestSupport {

  val graphQLOperationRequest: GraphQLOperationRequest

  val cacheSize: Int

  val cache: Cache[String, Seq[String]] = new LruCache(cacheSize)

  /**
   * `-parameters` must be supported and add while javac exec, java 1.8+
   *
   * default option
   *
   * @param method resolver method
   * @param args   resolver method parameter values
   * @return GraphQLOperationRequest
   */
  def withInputByReflectAndParameters(method: Method, args: Array[AnyRef]): GraphQLOperationRequest = {
    val parameters = method.getParameters.toSeq
    if (parameters.nonEmpty) {
      parameters.zip(args).zipWithIndex.foreach {
        case (parameterAndArgsValue, index) =>
          graphQLOperationRequest.getInput.put(parameterAndArgsValue._1.getName, args(index))
      }
    }
    graphQLOperationRequest
  }

  /**
   * do not need `-parameters`, but must use reflection.
   *
   * Methods that depend on the order of fields maybe be dangerous.
   *
   * if request can add field like `private List<String> fieldsInOrder = Arrays.asList("timeRange", "offset", "limit")`
   * then, can get fields name directly, and remove cache and asm/reflection
   *
   * @param args resolver method parameter values
   * @return GraphQLOperationRequest
   */
  def withInputByReflect(args: Array[AnyRef]): GraphQLOperationRequest = {
    if (args != null && args.nonEmpty) {
      val innerClass = graphQLOperationRequest.getClass.getDeclaredClasses.filter(_.getSimpleName == "Builder")
      if (innerClass.isEmpty) {
        throw new Exception("plugin option `generateBuilder` must be true")
      }
      val fieldAndArgs = getInputFieldAndArgs(graphQLOperationRequest.getClass.getName, args)(innerClass.head.getDeclaredFields.map(_.getName).toSeq)
      graphQLOperationRequest.getInput.putAll(fieldAndArgs.toMap.asJava)
    }
    graphQLOperationRequest
  }

  /**
   * do not need `-parameters`, but must use while plugin option `generateBuilder = true`(default is true).
   *
   * Methods that depend on the order of fields maybe be dangerous.
   *
   * if request can add field like `private List<String> fieldsInOrder = Arrays.asList("timeRange", "offset", "limit")`
   * then, can get fields name directly, and remove cache and asm/reflection
   *
   * @param args resolver method parameter values
   * @return GraphQLOperationRequest
   */
  def withInputByAsm(args: Array[AnyRef]): GraphQLOperationRequest = {
    if (args != null && args.nonEmpty) {
      val fieldAndArgs = getInputFieldAndArgs(graphQLOperationRequest.getClass.getName, args)(AsmUtils.getRequestBuilderFields(graphQLOperationRequest.getClass))
      graphQLOperationRequest.getInput.putAll(fieldAndArgs.toMap.asJava)
    }
    graphQLOperationRequest
  }

  private def getInputFieldAndArgs(clazzName: String, args: Array[AnyRef])(fun: => Seq[String]): Seq[(String, AnyRef)] = {
    cache.get(clazzName).fold {
      lazy val fields = fun
      // if field is java key worlds, plugin will make the first char capitalize.
      // so, while mapping params -> args, should uncapitalize.
      val fixJavaKw = fields.map(uncapitalize)
      cache.put(clazzName, fixJavaKw)
      fixJavaKw.zip(args)
    } {
      f => f.zip(args)
    }
  }

  /**
   * Uncapitalize a string. Make first letter as lowercase
   *
   * @param aString string to uncapitalize
   * @return uncapitalized string
   */
  private def uncapitalize(aString: String): String = {
    val chars = aString.toCharArray
    chars(0) = Character.toLowerCase(chars(0))
    new String(chars)
  }
}
