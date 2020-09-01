package io.growing.graphql.test

import java.time.ZonedDateTime

import io.growing.graphql.util.Jackson

/**
 *
 * @author liguobin@growingio.com
 * @version 1.0,2020/9/1
 */
object TimeSpec extends App {

  val now = ZonedDateTime.now()
  println(now)

  val nowStr = Jackson.mapper.writeValueAsString(now)
  println(nowStr)

}
