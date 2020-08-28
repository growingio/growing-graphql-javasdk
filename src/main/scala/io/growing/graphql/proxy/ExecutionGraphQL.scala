package io.growing.graphql.proxy

import java.util.concurrent.TimeUnit

import com.kobylynskyi.graphql.codegen.model.graphql.{ GraphQLOperationRequest, GraphQLRequest, GraphQLResponseProjection }
import io.growing.graphql.GrowingIOGraphQLConfig
import io.growing.graphql.util.OkHttp

import scala.concurrent.Await
import scala.concurrent.duration.Duration

/**
 *
 * @author liguobin@growingio.com
 * @version 1.0,2020/8/28
 */
trait ExecutionGraphQL {

  def execute(entityClazzName: String, request: GraphQLOperationRequest, projection: GraphQLResponseProjection, growingIOGraphQLConfig: GrowingIOGraphQLConfig): Any = {
    val graphQLRequest = new GraphQLRequest(request, projection)
    try {
      val retFuture = OkHttp.createExecuteRequest(graphQLRequest, entityClazzName, growingIOGraphQLConfig)
      return Await.result(retFuture, Duration.create(growingIOGraphQLConfig.getTimeOut.intValue(), TimeUnit.MINUTES))
    } catch {
      case e: Exception =>
        System.err.println(e.getLocalizedMessage)
    }
    null
  }
}
