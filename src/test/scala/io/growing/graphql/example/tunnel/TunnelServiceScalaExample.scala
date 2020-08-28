package io.growing.graphql.example.tunnel

import io.growing.graphql.model.{ TunnelResponseProjection, TunnelsQueryRequest }
import io.growing.graphql.proxy.GrowingIOGraphQLClient
import io.growing.graphql.proxy.GrowingIOGraphQLClient.GrowingIOGraphQLClientBuilder
import io.growing.graphql.resolver.TunnelsQueryResolver

/**
 *
 * @author liguobin@growingio.com
 * @version 1.0,2020/8/18
 */
object TunnelServiceScalaExample extends App {

  protected val tunnelHelper: GrowingIOGraphQLClientBuilder = GrowingIOGraphQLClient.GrowingIOGraphQLClientBuilder.newBuilder()

  println("=====tunnels=====")
  val tunnels = tunnelHelper.setProjection(new TunnelResponseProjection().all$()).
    setRequest(new TunnelsQueryRequest).build(classOf[TunnelsQueryResolver]).tunnels()
  println(tunnels)


}
