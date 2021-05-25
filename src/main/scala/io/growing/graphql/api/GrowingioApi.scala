package io.growing.graphql.api

import java.util

import com.kobylynskyi.graphql.codegen.extension.GrowingIOConfig
import io.growing.graphql.model._
import io.growing.graphql.resolver.impl._

import scala.collection.JavaConverters._

/**
 * @author liguobin@growingio.com
 * @version 1.0,2020/10/23
 */
class GrowingioApi(url: String, headers: Map[String, String]) {

  // 只有url和token
  // graphql-java-codegen底层也是把 authKey -> aValue 放到HTTP的请求头中，这里与下面分开仅是为了方便调用

  private lazy val conf: GrowingIOConfig = new GrowingIOConfig(url, headers.asJava)

  def submitTagUserExportJob(tagId: String, properties: util.List[String], charset: String, detailExport: Boolean): TagUserExportJobDto = {
    val resolver = new $SubmitTagUserExportJobMutationResolver(conf)
    resolver.submitTagUserExportJob(tagId, properties, charset, detailExport)
  }

  def submitAnalysisDownloadJob(projectId: String, id: String, param: AnalysisExportJobParamDto, charset: String): AnalysisExportJobDto = {
    val resolver = new $SubmitAnalysisExportJobMutationResolver(conf)
    resolver.submitAnalysisExportJob(projectId,id,param,charset)
  }

  def submitSegmentUserExportJob(projectId: String, segmentId: String, tags: util.List[String], properties: util.List[String], charset: String): SegmentUserExportJobDto = {
    val resolver = new $SubmitSegmentUserExportJobMutationResolver(conf)
    resolver.submitSegmentUserExportJob(projectId, segmentId, tags, properties, charset)
  }

  def jobResult(id: String): JobResultDto = {
    val resolver = new $JobResultQueryResolver(conf)
    resolver.jobResult(id)
  }

  def userProfile(projectId: String, userId: String, tags: util.List[String], properties: util.List[String]): UserProfileDto = {
    val resolver = new $UserProfileQueryResolver(conf)
    resolver.userProfile(projectId, userId, tags, properties)
  }

  def tags(projectId: String): util.List[TagDto] = {
    val resolver = new $TagsQueryResolver(conf)
    resolver.tags(projectId)
  }

  def segments(projectId: String): util.List[SegmentDto] = {
    val resolver = new $SegmentsQueryResolver(conf)
    resolver.segments(projectId)

  }
}

object GrowingioApi {
  def apply(url: String): GrowingioApi = new GrowingioApi(url, Map.empty)

  def apply(url: String, authKey: String, authValue: String): GrowingioApi = new GrowingioApi(url, Map(authKey -> authValue))

  def apply(url: String, headers: Map[String, String]): GrowingioApi = new GrowingioApi(url, headers)

  def apply(url: String, headers: util.Map[String, String]): GrowingioApi = new GrowingioApi(url, headers.asScala.toMap)
}
