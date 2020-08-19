package io.growing.graphql.util

import com.typesafe.config.ConfigFactory

import scala.collection.JavaConverters._
import scala.util.Try

/**
 *
 * @author liguobin@growingio.com
 * @version 1.0,2020/8/10
 */
object Configs {

  lazy val customConfig = ConfigFactory.load()

  val serverHost = Try(customConfig.getString("graphql.server.host")).getOrElse("http://localhost:8080/graphql")

  val maxDepth = Try(customConfig.getInt("graphql.maxDepth")).getOrElse(3)

  val globalExcludeFields = Try(customConfig.getStringList("graphql.global-exclude-fields").asScala).getOrElse(Nil)

  private val excludeFieldsConfig = Try(customConfig.getConfigList("graphql.exclude-fields").asScala).getOrElse(Nil)

  val excludeFields = excludeFieldsConfig.flatMap {
    c => Map(c.getString("method") -> c.getStringList("fields").asScala)
  }.toMap

}
