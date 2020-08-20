package io.growing.graphql.test

import io.growing.graphql.util.Jackson
import io.growing.graphql.ResponseDeserializer
import org.json.{ JSONArray, JSONObject }
import org.scalatest.flatspec.AnyFlatSpec

/**
 * 测试序列化
 *
 * @author liguobin@growingio.com
 * @version 1.0,2020/8/12
 */
class ResponseDeserializerSpec extends AnyFlatSpec with ResponseDeserializer {

  "ResponseDeserializer entity" should "true" in {
    val entity = deserialize(
      new JSONObject("{ id: \"J1GlEDjl\", stage: RUNNING, uris: [ \"\" ] }"),
      "io.growing.graphql.model.JobResultDto")
    println(entity)
    Jackson.mapper.writeValueAsString(entity) == "{ id: \"J1GlEDjl\", stage: RUNNING, uris: [ \"\" ] }"
  }

  "ResponseDeserializer List entity" should "true" in {
    val entity = deserialize(new JSONArray(
      """
        |[{"operation":"CREATE","message":"创建了任务","operatorId":"WlGk4Daj","timestamp":1584425187.317000000,"operator":"GIODemo"},{"operation":"EXECUTE","message":"执行任务","operatorId":"WlGk4Daj","timestamp":1589437639.598000000,"operator":"GIODemo"},{"operation":"EXECUTE","message":"执行任务","operatorId":"system","timestamp":1597056062.640000000,"operator":"System"}]
        |""".stripMargin), "io.growing.graphql.model.LogEntryDto")
    println(entity)
    Jackson.mapper.writeValueAsString(entity) ==
      """
        |[{"operation":"CREATE","message":"创建了任务","operatorId":"WlGk4Daj","timestamp":1584425187.317000000,"operator":"GIODemo"},{"operation":"EXECUTE","message":"执行任务","operatorId":"WlGk4Daj","timestamp":1589437639.598000000,"operator":"GIODemo"},{"operation":"EXECUTE","message":"执行任务","operatorId":"system","timestamp":1597056062.640000000,"operator":"System"}]
        |""".stripMargin
  }

  "ResponseDeserializer Boolean" should "true" in {
    val entity = deserialize(Boolean.box(true), "scala.Boolean")
    println(entity)
    entity
  }

  "ResponseDeserializer Integer" should "true" in {
    val entity = deserialize(new Integer(1), "scala.Int")
    println(entity)
    entity == 1
  }

  "ResponseDeserializer Float" should "true" in {
    val entity = deserialize(1.1F, "scala.Float")
    println(entity)
    entity.asInstanceOf[Float] > 1
  }

  "ResponseDeserializer Empty Array" should "true" in {
    val entity = deserialize(new JSONArray(), "java.util.List")
    println(entity)
    entity.isInstanceOf[java.util.List[Any]] && entity.asInstanceOf[java.util.List[Any]].isEmpty
  }

  "ResponseDeserializer Empty" should "true" in {
    val entity = deserialize(JSONObject.NULL, "io.growing.graphql.model.JobResultDto")
    println(entity)
    entity == null
  }
}
