package io.growing.graphql

import io.growing.graphql.util.Jackson
import org.json.{ JSONArray, JSONObject }

/**
 * 反序列化结果，这里没有使用graphql-java-codegen自带的Response来反序列
 *
 * @author liguobin@growingio.com
 * @version 1.0,2020/7/29
 */
trait ResponseDeserializer {

  /**
   * if data is array, entityClazzName is a parameterized type.
   * because can not deserializer from Collection directly, generic type is lost
   *
   * @param data            resolver method response
   * @param entityClazzName resolver method response type
   */
  def deserialize(data: Any, entityClazzName: String): Any = {
    val targetReturnClazz = Class.forName(entityClazzName)
    data match {
      case array: JSONArray if array.isEmpty => java.util.Collections.emptyList()
      case array: JSONArray =>
        val result = new java.util.ArrayList[Any]()
        for (i <- 0 until array.length()) {
          val e = Jackson.mapper.readValue(array.get(i).asInstanceOf[JSONObject].toString, targetReturnClazz)
          result.add(e)
        }
        result
      case JSONObject.NULL => null
      case jsonObject: JSONObject => Jackson.mapper.readValue(jsonObject.toString, targetReturnClazz)
      case any: Any => any
    }
  }

}
