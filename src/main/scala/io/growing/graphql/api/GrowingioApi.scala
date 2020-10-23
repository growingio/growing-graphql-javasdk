package io.growing.graphql.api

import java.util

import com.kobylynskyi.graphql.codegen.extension.GrowingIOConfig
import io.growing.graphql.model._
import io.growing.graphql.resolver.impl._

/**
 * @author liguobin@growingio.com
 * @version 1.0,2020/10/23
 */
class GrowingioApi(url: String) {

  var aKey: String = _
  var aValue: String = _

  def this(url: String, authKey: String, authValue: String) {
    this(url)
    this.aKey = authKey
    this.aValue = authValue
  }


  private lazy val conf = if (aKey != null && aValue != null) new GrowingIOConfig(url, aKey, aValue) else new GrowingIOConfig(url)

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
