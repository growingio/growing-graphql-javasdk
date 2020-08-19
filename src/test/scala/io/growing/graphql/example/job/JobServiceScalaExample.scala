package io.growing.graphql.example.job

import java.util.Collections

import io.growing.graphql.api.JobService
import io.growing.graphql.model._
import io.growing.graphql.util.Jackson

/**
 * 需要服务端才能完成整个链路的测试
 *
 * @author liguobin@growingio.com
 * @version 1.0,2020/8/10
 */
object JobServiceScalaExample extends App {

  def printlnResult(ret: Any): Unit = {
    println(Jackson.mapper.writeValueAsString(ret))
  }

  val jobService = new JobService()

  println("========================eventImportJobs============================")
  val eijd = jobService.eventImportJobs()
  printlnResult(eijd)

  println("========================jobLogs============================")
  val jl = jobService.jobLogs("WlGk4Daj")
  printlnResult(jl)

  println("========================jobFiles============================")
  val jf = jobService.jobFiles("WlGk4Daj")
  printlnResult(jf)

  println("========================submitAnalysisExportJob============================")
  val aejd = jobService.submitAnalysisExportJob(
    "meQ8REGn",
    AnalysisExportJobParamDto.builder().setAnalysisType(AnalysisResourceTypeDto.CHARTS).build(), charset = "UTF-16LE")
  //{ id: "Q0hBUlRTOmU1NTE1MzFkMzA4Yjg4NGU3NDU0NDA3YWQ1ZDgxNzkz", stage: RUNNING, error: { code: "", message: "" } }
  printlnResult(aejd)
  println("========================submitAnalysisExportJob jobResult============================")
  val jrd = jobService.jobResult(aejd.getId)
  //{ id: "J1GlEDjl", stage: FINISH, uris: [ "/jobs-results/downloads/20200803-20200809_72017577_0630-下载-1.csv" ] }
  printlnResult(jrd)

  println("========================submitSegmentUserExportJob============================")
  //Collections.emptyList[String]()
  val suejd = jobService.submitSegmentUserExportJob("J1GlNzQj", Collections.emptyList(), Collections.emptyList(), charset = "UTF-16LE")
  printlnResult(suejd)
  println("========================submitSegmentUserExportJob jobResult============================")
  val suejdjrd = jobService.jobResult(suejd.getId)
  printlnResult(suejdjrd)

  println("========================submitTagUserExportJob============================")
  val tuejd = jobService.submitTagUserExportJob("rRGoVRpm", Collections.emptyList(), charset = "UTF-16LE")
  printlnResult(tuejd)
  println("========================submitTagUserExportJob jobResult============================")
  val tuejdjrd = jobService.jobResult(tuejd.getId)
  printlnResult(tuejdjrd)

  //依赖于job执行状态
  //  println("========================executeJob============================")
  //  val ejb = jobService.executeJob("KnGnmjpR")
  //  printlnResult(ejb)
  //  println("========================executeJob jobResult============================")
  //  val ejbjrd = jobService.jobResult(ejb.getId)
  //  printlnResult(ejbjrd)
  //
  //  println("========================createEventImportJob============================")
  //  val ceijb = jobService.createEventImportJob("86706ba129aabcbe", "abs:1577808000000,1579622399999")
  //  printlnResult(ceijb)
  //  println("========================createEventImportJob jobResult============================")
  //  val ceijbjrd = jobService.jobResult(ceijb.getId)
  //  printlnResult(ceijbjrd)

}
