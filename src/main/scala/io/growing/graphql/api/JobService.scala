package io.growing.graphql.api

import java.{ lang, util }

import io.growing.graphql.model._
import io.growing.graphql.proxy.GrowingIOGraphQLClient
import io.growing.graphql.resolver._

/**
 *
 * 仅封装job的相关的服务。此实现是一个示例（仅实现了job相关的resolver接口），后续想要封装可以参考这个类。
 *
 * 与实现GrowingIOQueryResolver和GrowingIOMutationResolver具有相同功能，
 * 但是实现GrowingIOQueryResolver和GrowingIOMutationResolver需要实现所有接口。
 *
 * @author liguobin@growingio.com
 * @version 1.0,2020/8/10
 */
class JobService extends JobResultQueryResolver with JobFilesQueryResolver with JobLogsQueryResolver with EventImportJobsQueryResolver
  with ExecuteJobMutationResolver with SubmitAnalysisExportJobMutationResolver with CreateEventImportJobMutationResolver
  with SubmitSegmentUserExportJobMutationResolver with SubmitTagUserExportJobMutationResolver {

  override def jobFiles(id: String): util.List[FileDescriptorDto] = {
    GrowingIOGraphQLClient.graphQLClient().setProjection(new FileDescriptorResponseProjection().all$()).
      setRequest(new JobFilesQueryRequest).build(classOf[JobFilesQueryResolver]).jobFiles(id)
  }

  override def jobLogs(id: String): util.List[LogEntryDto] = {
    GrowingIOGraphQLClient.graphQLClient().setProjection(new LogEntryResponseProjection().all$()).
      setRequest(new JobLogsQueryRequest).build(classOf[JobLogsQueryResolver]).jobLogs(id)
  }

  override def jobResult(id: String): JobResultDto = {
    GrowingIOGraphQLClient.graphQLClient().setProjection(new JobResultResponseProjection().all$()).
      setRequest(new JobResultQueryRequest).build(classOf[JobResultQueryResolver]).jobResult(id)
  }

  override def eventImportJobs(): util.List[EventImportJobDto] = {
    GrowingIOGraphQLClient.graphQLClient().setProjection(new EventImportJobResponseProjection().all$()).
      setRequest(new EventImportJobsQueryRequest).build(classOf[EventImportJobsQueryResolver]).eventImportJobs()
  }


  //mutation
  override def createEventImportJob(tunnelId: String, timeRange: String): EventImportJobDto = {
    GrowingIOGraphQLClient.graphQLClient().setProjection(new EventImportJobResponseProjection().all$()).
      setRequest(new CreateEventImportJobMutationRequest).
      build(classOf[CreateEventImportJobMutationResolver]).createEventImportJob(tunnelId, timeRange)
  }

  override def executeJob(id: String): JobResultDto = {
    GrowingIOGraphQLClient.graphQLClient().setProjection(new JobResultResponseProjection().all$()).
      setRequest(new ExecuteJobMutationRequest).
      build(classOf[ExecuteJobMutationResolver]).executeJob(id)
  }

  override def submitAnalysisExportJob(id: String, param: AnalysisExportJobParamDto, charset: String): AnalysisExportJobDto = {
    GrowingIOGraphQLClient.graphQLClient().setProjection(new AnalysisExportJobResponseProjection().all$()).
      setRequest(new SubmitAnalysisExportJobMutationRequest).
      build(classOf[SubmitAnalysisExportJobMutationResolver]).submitAnalysisExportJob(id, param, charset)
  }

  override def submitSegmentUserExportJob(segmentId: String, tags: util.List[String], properties: util.List[String], charset: String): SegmentUserExportJobDto = {
    GrowingIOGraphQLClient.graphQLClient().setProjection(new SegmentUserExportJobResponseProjection().all$()).
      setRequest(new SubmitSegmentUserExportJobMutationRequest).
      build(classOf[SubmitSegmentUserExportJobMutationResolver]).submitSegmentUserExportJob(segmentId, tags, properties, charset)
  }

  override def submitTagUserExportJob(tagId: String, properties: util.List[String], charset: String, detailExport: lang.Boolean): TagUserExportJobDto = {
    GrowingIOGraphQLClient.graphQLClient().setProjection(new TagUserExportJobResponseProjection().all$()).
      setRequest(new SubmitTagUserExportJobMutationRequest).
      build(classOf[SubmitTagUserExportJobMutationResolver]).submitTagUserExportJob(tagId, properties, charset, detailExport)
  }

}
