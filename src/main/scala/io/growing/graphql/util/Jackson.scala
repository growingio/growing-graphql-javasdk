package io.growing.graphql.util

import com.fasterxml.jackson.annotation.JsonInclude.Include
import com.fasterxml.jackson.databind.{ DeserializationFeature, ObjectMapper, SerializationFeature }
import com.fasterxml.jackson.datatype.jdk8.Jdk8Module
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule
import com.fasterxml.jackson.module.paramnames.ParameterNamesModule

/**
 * json
 *
 * @author liguobin@growingio.com
 * @version 1.0,2020/9/1
 */
object Jackson {

  lazy val mapper: ObjectMapper = {
    val mapper = new ObjectMapper()
    mapper.setSerializationInclusion(Include.NON_NULL)
    mapper.setSerializationInclusion(Include.NON_ABSENT)
    mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
    mapper.registerModules(new ParameterNamesModule(), new Jdk8Module(), new JavaTimeModule())
    //disable, writeValueAsString will serialize like "2020-09-01T16:13:34.646+08:00"
    mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false)
  }

}
