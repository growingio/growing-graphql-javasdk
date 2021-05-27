import sbt._
import sbt.Keys._

object Dependencies {

  object Versions {
    val scalaVersion212 = "2.12.12"
    val scalaVersion211 = "2.11.11"
    val scalaVersion213 = "2.13.3"
    val commonsLang = "3.10"
    val guava = "29.0-jre"
    val scalaTest = "3.2.0"
    val javaxAnnotation = "1.3.2"
  }

  object Compiles {

    val javaxAnnotation = "javax.annotation" % "javax.annotation-api" % Versions.javaxAnnotation

    //schema处理和测试不进行打包，减少依赖
    val scalaTest = "org.scalatest" %% "scalatest" % Versions.scalaTest % "test"
    val commonLang = "org.apache.commons" % "commons-lang3" % Versions.commonsLang % "test"
    val guava = "com.google.guava" % "guava" % Versions.guava % "test"
  }

  import Compiles._

  lazy val l = libraryDependencies

  lazy val javaClient = l ++= Seq(commonLang, guava, javaxAnnotation, scalaTest)

}
