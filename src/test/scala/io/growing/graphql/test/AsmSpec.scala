package io.growing.graphql.test

import io.growing.graphql.model.SubmitAnalysisExportJobMutationRequest
import io.growing.graphql.util.AsmUtils

/**
 *
 * @author liguobin@growingio.com
 * @version 1.0,2020/9/1
 */
object AsmSpec extends App {

  //annother way, obtain request inner class `builder`' fields
  val ret3 = AsmUtils.getRequestBuilderFields(classOf[SubmitAnalysisExportJobMutationRequest])
  println(ret3) //ListBuffer(id, param, charset)

}
