package io.growing.graphql

import com.typesafe.config.ConfigFactory

import scala.collection.JavaConverters._
import scala.util.Try

/**
 *
 * @author liguobin@growingio.com
 * @version 1.0,2020/8/10
 */
object Configs {

  private lazy val customConfig = ConfigFactory.load()

  val serverHost = Try(customConfig.getString("graphql.server.host")).getOrElse("http://localhost:8080/graphql")

  val maxDepth = Try(customConfig.getInt("graphql.maxDepth")).getOrElse(3)

  val globalExcludeFields = Try(customConfig.getStringList("graphql.global-exclude-fields").asScala).getOrElse(Nil)

  private lazy val excludeFieldsConfig = Try(customConfig.getConfigList("graphql.exclude-fields").asScala).getOrElse(Nil)

  val excludeFields = excludeFieldsConfig.flatMap {
    c => Map(c.getString("method") -> c.getStringList("fields").asScala)
  }.toMap

  private lazy val authenticateConfig = customConfig.getConfig("graphql.authenticate")

  val auth = if (customConfig.hasPath("graphql.authenticate")) {
    Some(Authenticate(authenticateConfig.getString("key"), authenticateConfig.getString("value")))
  } else {
    None
  }

  val timeOut = Try(customConfig.getInt("graphql.timeout")).getOrElse(1)
}
