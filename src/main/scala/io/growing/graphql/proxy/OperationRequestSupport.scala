package io.growing.graphql.proxy

import java.lang.reflect.Method

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest

/**
 * construct request
 *
 * @author liguobin@growingio.com
 * @version 1.0,2020/8/31
 */
trait OperationRequestSupport {

  val graphQLOperationRequest: GraphQLOperationRequest

  /**
   * `-parameters` must be supported and add while javac exec, java 1.8+
   *
   * @param method
   * @param args
   * @return
   */
  def withParamsByReflect(method: Method, args: Array[AnyRef]): GraphQLOperationRequest = {
    val parameters = method.getParameters.toSeq
    if (parameters.nonEmpty) {
      parameters.zip(args).zipWithIndex.foreach {
        case (parameterAndArgsValue, index) =>
          graphQLOperationRequest.getInput.put(parameterAndArgsValue._1.getName, args(index))
      }
    }
    graphQLOperationRequest
  }
}
