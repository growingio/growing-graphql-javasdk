package io.growing.graphql.proxy

import java.lang.reflect.{ InvocationHandler, Method, ParameterizedType }

import com.kobylynskyi.graphql.codegen.model.graphql.{ GraphQLOperationRequest, GraphQLResponseProjection }
import io.growing.graphql.{ GrowingIOGraphQLConfig, ProxyException }

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

  override val cacheSize: Int = growingIOGraphQLConfig.getCacheSize()

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
    //has a cache, request class name -> fields when ASM_BY_FIELDS and REFLECT_BY_FIELDS
    val requestWithParams = growingIOGraphQLConfig.withInputParamsType() match {
      case GrowingIOGraphQLConfig.ASM_BY_FIELDS => withInputByAsm(args)
      case GrowingIOGraphQLConfig.REFLECT_BY_FIELDS => withInputByReflect(args)
      case GrowingIOGraphQLConfig.REFLECT_BY_PARAMETERS => withInputByReflectAndParameters(method, args)
      case _ => throw ProxyException("type not support")
    }
    execute(entityClazzName, requestWithParams, projection, growingIOGraphQLConfig)
  }
}
