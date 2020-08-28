package io.growing.graphql.test

import io.growing.graphql.proxy.GrowingIOGraphQLClient
import io.growing.graphql.proxy.GrowingIOGraphQLClient.GrowingIOGraphQLClientBuilder
import io.growing.graphql.resolver.JobFilesQueryResolver
import org.scalatest.flatspec.AnyFlatSpec

/**
 * 测试序列化
 *
 * @author liguobin@growingio.com
 * @version 1.0,2020/8/12
 */
class ProxySpec extends AnyFlatSpec {

  protected val jobQueryHelper: GrowingIOGraphQLClientBuilder = GrowingIOGraphQLClient.GrowingIOGraphQLClientBuilder.newBuilder()

  "ResolverImplClient instance" should "true" in {
    val jobFilesQueryResolver = jobQueryHelper.build(classOf[JobFilesQueryResolver])
    jobFilesQueryResolver.isInstanceOf[JobFilesQueryResolver]
  }

  "ResolverImplClient class and method" should "true" in {
    val jobFilesQueryResolver = jobQueryHelper.build(classOf[JobFilesQueryResolver])
    jobFilesQueryResolver.getClass.getInterfaces.foreach(x => println(x))

    jobFilesQueryResolver.toString.startsWith("io.growing.graphql.proxy.DynamicProxy") &&
      jobFilesQueryResolver.getClass.getMethods.exists(_.getName == "jobFiles") &&
      jobFilesQueryResolver.getClass.getInterfaces.exists(_.getName == "JobFilesQueryResolver")
  }
}
