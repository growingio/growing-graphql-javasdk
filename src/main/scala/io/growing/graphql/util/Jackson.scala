package io.growing.graphql.util

import com.fasterxml.jackson.annotation.JsonInclude.Include
import com.fasterxml.jackson.databind.{ DeserializationFeature, ObjectMapper }
import com.fasterxml.jackson.datatype.jdk8.Jdk8Module
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule
import com.fasterxml.jackson.module.paramnames.ParameterNamesModule
import com.fasterxml.jackson.module.scala.{ DefaultScalaModule, ScalaObjectMapper }

protected[graphql] object Jackson {

  lazy val mapper: ObjectMapper with ScalaObjectMapper = {
    val mapper = new ObjectMapper() with ScalaObjectMapper
    mapper.setSerializationInclusion(Include.NON_NULL)
    mapper.setSerializationInclusion(Include.NON_ABSENT)
    mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
    mapper.registerModule(DefaultScalaModule)
    mapper.registerModule(new ParameterNamesModule())
    mapper.registerModule(new Jdk8Module())
    mapper.registerModule(new JavaTimeModule())
    mapper
  }

}
