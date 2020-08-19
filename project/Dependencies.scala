import sbt._
import sbt.Keys._

object Dependencies {

  object Versions {
    val log4j = "2.8.2"
    val log4jApiScala = "11.0"
    val okhttp = "4.7.2"
    val jackson = "2.11.1"
    val commonsLang = "3.10"
    val guava = "29.0-jre"
    val json = "20190722"
    val config = "1.4.0"
    val scalaTest = "3.2.0"
  }

  object Compiles {

    val log4j = Seq(
      "org.apache.logging.log4j" %% "log4j-api-scala" % Versions.log4jApiScala,
      "org.apache.logging.log4j" % "log4j-api" % Versions.log4j,
      "org.apache.logging.log4j" % "log4j-core" % Versions.log4j,
      "org.apache.logging.log4j" % "log4j-slf4j-impl" % Versions.log4j
    )

    val jackson = Seq(
      "com.fasterxml.jackson.module" %% "jackson-module-scala" % Versions.jackson,
      "com.fasterxml.jackson.core" % "jackson-databind" % Versions.jackson,
      "com.fasterxml.jackson.datatype" % "jackson-datatype-jsr310" % Versions.jackson,
      "com.fasterxml.jackson.datatype" % "jackson-datatype-jdk8" % Versions.jackson,
      "com.fasterxml.jackson.module" % "jackson-module-parameter-names" % Versions.jackson
    )

    val commonLang = "org.apache.commons" % "commons-lang3" % Versions.commonsLang
    val guava = "com.google.guava" % "guava" % Versions.guava
    val json = "org.json" % "json" % Versions.json
    val config = "com.typesafe" % "config" % Versions.config
    val okhttp = "com.squareup.okhttp3" % "okhttp" % Versions.okhttp
    val scalaTest = "org.scalatest" %% "scalatest" % Versions.scalaTest % "test"

  }

  import Compiles._

  lazy val l = libraryDependencies

  lazy val javaClient = l ++= Seq(okhttp, commonLang, guava, json, config, scalaTest) ++ log4j ++ jackson

}
