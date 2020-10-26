package io.growing.graphql.api

import java.util
import java.util.Collections

import com.kobylynskyi.graphql.codegen.extension.GrowingIOConfig
import io.growing.graphql.model._
import io.growing.graphql.resolver.impl._

/**
 * @author liguobin@growingio.com
 * @version 1.0,2020/10/23
 */
class GrowingioApi(url: String) { //构造函数1，仅url，无鉴权

  private var headers: util.Map[String, String] = _

  /**
   * 构造函数2，只有url和token
   * graphql-java-codegen底层也是把 authKey -> aValue 放到HTTP的请求头中，这里与下面分开仅是为了方便调用
   *
   * @param url
   * @param authKey
   * @param authValue
   */
  def this(url: String, authKey: String, authValue: String) {
    this(url)
    headers = Collections.singletonMap(authKey, authValue)
  }

  /**
   * 构造函数3，通用的headers，token也放在headers中
   *
   * @param url
   * @param headers
   */
  def this(url: String, headers: util.Map[String, String]) {
    this(url)
    this.headers = headers
  }

  private lazy val conf: GrowingIOConfig = new GrowingIOConfig(url, headers)

  def submitTagUserExportJob(tagId: String, properties: util.List[String], charset: String, detailExport: Boolean): TagUserExportJobDto = {
    val resolver = new DefaultSubmitTagUserExportJobMutationResolver(conf)
    resolver.submitTagUserExportJob(tagId, properties, charset, detailExport)
  }

  def submitSegmentUserExportJob(segmentId: String, tags: util.List[String], properties: util.List[String], charset: String): SegmentUserExportJobDto = {
    val resolver = new DefaultSubmitSegmentUserExportJobMutationResolver(conf)
    resolver.submitSegmentUserExportJob(segmentId, tags, properties, charset)
  }

  def jobResult(id: String): JobResultDto = {
    val resolver = new DefaultJobResultQueryResolver(conf)
    resolver.jobResult(id)
  }

  def userProfile(userId: String, tags: util.List[String], properties: util.List[String]): UserProfileDto = {
    val resolver = new DefaultUserProfileQueryResolver(conf)
    resolver.userProfile(userId, tags, properties)
  }

  def tags(): util.List[TagDto] = {
    val resolver = new DefaultTagsQueryResolver(conf)
    resolver.tags()
  }

  def segments(): util.List[SegmentDto] = {
    val resolver = new DefaultSegmentsQueryResolver(conf)
    resolver.segments()

  }

}
