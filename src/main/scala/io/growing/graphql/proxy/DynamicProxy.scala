package io.growing.graphql.proxy

import java.lang.reflect.{ InvocationHandler, Method, ParameterizedType }

import com.kobylynskyi.graphql.codegen.model.graphql.{ GraphQLOperationRequest, GraphQLResponseProjection }
import io.growing.graphql.GrowingIOGraphQLConfig

/**
 *
 * @author liguobin@growingio.com
 * @version 1.0,2020/8/28
 */
class DynamicProxy(
  projection: GraphQLResponseProjection,
  request: GraphQLOperationRequest,
  growingIOGraphQLConfig: GrowingIOGraphQLConfig) extends InvocationHandler with ExecutionGraphQL {

  @throws[Throwable]
  override def invoke(proxy: Any, method: Method, args: Array[AnyRef]): AnyRef = {
    if (classOf[Any] == method.getDeclaringClass) {
      try {
        method.invoke(this, args)
      } catch {
        case t: Throwable =>
          t.printStackTrace()
          null
      }
    } else proxyInvoke(method, args).asInstanceOf[AnyRef]
  }

  /**
   * execute graphql request that need jvm compile parameter `-parameters` and Java8 or above
   * you should clean class, and build again after set -parameters
   * in sbt like this: javacOptions += "-parameters"
   * <p>
   * TODO for compatiblity with java8 or below, need use annotation or asm to replace javac compile option `-parameters`.
   *
   * @param method
   * @param args
   * @return
   */
  private def proxyInvoke(method: Method, args: Array[AnyRef]): Any = {
    var i = 0
    //handle List
    val `type` = method.getGenericReturnType
    val entityClazzName = `type` match {
      case parameterizedType1: ParameterizedType =>
        val parameterizedType = parameterizedType1.getActualTypeArguments
        parameterizedType(0).getTypeName
      case _ =>
        `type`.getTypeName
    }
    val parameters = method.getParameters.toSeq
    if (parameters.nonEmpty) {
      for (parameter <- parameters) {
        val argsCopy = args(i)
        i += 1
        request.getInput.put(parameter.getName, argsCopy)
      }
    }
    execute(entityClazzName, request, projection, growingIOGraphQLConfig)
  }

}
