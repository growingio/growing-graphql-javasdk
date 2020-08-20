package io.growing.graphql.api

import java.util

import io.growing.graphql.model._
import io.growing.graphql.proxy.ResolverImplClient
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

  protected val jobHelper: ResolverImplClient.ResolverImplClientBuilder = ResolverImplClient.ResolverImplClientBuilder.newBuilder()

  //query
  override def jobFiles(id: String): util.List[FileDescriptorDto] = {
    jobHelper.setProjection(new FileDescriptorResponseProjection).
      setRequest(new JobFilesQueryRequest).build(classOf[JobFilesQueryResolver]).jobFiles(id)
  }

  override def jobLogs(id: String): util.List[LogEntryDto] = {
    jobHelper.setProjection(new LogEntryResponseProjection).
      setRequest(new JobLogsQueryRequest).build(classOf[JobLogsQueryResolver]).jobLogs(id)
  }

  override def jobResult(id: String): JobResultDto = {
    jobHelper.setProjection(new JobResultResponseProjection).
      setRequest(new JobResultQueryRequest).build(classOf[JobResultQueryResolver]).jobResult(id)
  }

  override def eventImportJobs(): util.List[EventImportJobDto] = {
    jobHelper.setProjection(new EventImportJobResponseProjection).
      setRequest(new EventImportJobsQueryRequest).build(classOf[EventImportJobsQueryResolver]).eventImportJobs()
  }


  //mutation
  override def createEventImportJob(tunnelId: String, timeRange: String): EventImportJobDto = {
    jobHelper.setProjection(new EventImportJobResponseProjection).
      setRequest(new CreateEventImportJobMutationRequest).
      build(classOf[CreateEventImportJobMutationResolver]).createEventImportJob(tunnelId, timeRange)
  }

  override def executeJob(id: String): JobResultDto = {
    jobHelper.setProjection(new JobResultResponseProjection).
      setRequest(new ExecuteJobMutationRequest).
      build(classOf[ExecuteJobMutationResolver]).executeJob(id)
  }

  override def submitAnalysisExportJob(id: String, param: AnalysisExportJobParamDto, charset: String): AnalysisExportJobDto = {
    jobHelper.setProjection(new AnalysisExportJobResponseProjection).
      setRequest(new SubmitAnalysisExportJobMutationRequest).
      build(classOf[SubmitAnalysisExportJobMutationResolver]).submitAnalysisExportJob(id, param, charset)
  }

  override def submitSegmentUserExportJob(segmentId: String, tags: util.List[String], properties: util.List[String], charset: String): SegmentUserExportJobDto = {
    jobHelper.setProjection(new SegmentUserExportJobResponseProjection).
      setRequest(new SubmitSegmentUserExportJobMutationRequest).
      build(classOf[SubmitSegmentUserExportJobMutationResolver]).submitSegmentUserExportJob(segmentId, tags, properties, charset)
  }

  override def submitTagUserExportJob(tagId: String, properties: util.List[String], charset: String): TagUserExportJobDto = {
    jobHelper.setProjection(new TagUserExportJobResponseProjection).
      setRequest(new SubmitTagUserExportJobMutationRequest).
      build(classOf[SubmitTagUserExportJobMutationResolver]).submitTagUserExportJob(tagId, properties, charset)
  }

}
