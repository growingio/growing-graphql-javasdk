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
  growingIOGraphQLConfig: GrowingIOGraphQLConfig) extends InvocationHandler with ExecutionGraphQL
  with OperationRequestSupport {

  override val graphQLOperationRequest: GraphQLOperationRequest = request

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
   *
   * @param method
   * @param args
   * @return
   */
  private def proxyInvoke(method: Method, args: Array[AnyRef]): Any = {
    //get generic type from List
    val `type` = method.getGenericReturnType
    val entityClazzName = `type` match {
      case parameterizedType1: ParameterizedType =>
        val parameterizedType = parameterizedType1.getActualTypeArguments
        parameterizedType(0).getTypeName
      case _ =>
        `type`.getTypeName
    }
    val requestWithParams = withParamsByReflect(method, args)
    execute(entityClazzName, requestWithParams, projection, growingIOGraphQLConfig)
  }

}
