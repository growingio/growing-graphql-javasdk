import sbt._
import sbt.Keys._
import xerial.sbt.Sonatype.autoImport.sonatypeProfileName

object Publishing {

  //publish by sbt publishSigned
  lazy val publishSettings = Seq(
    credentials += Credentials(Path.userHome / ".ivy2" / ".sonatype_credentials_gio"),
    publishTo := {
      val nexus = "https://oss.sonatype.org/"
      if (isSnapshot.value)
        Some("snapshots" at nexus + "content/repositories/snapshots")
      else
        Some("releases" at nexus + "service/local/staging/deploy/maven2")
    },
    licenses := Seq("MIT" -> url("https://opensource.org/licenses/MIT")),
    publishMavenStyle := true,
    publishArtifact in Test := false,
    pomIncludeRepository := { _ => false },
    developers := List(
      Developer(
        id = "LiGuoBin",
        name = "LiGuoBin",
        email = "liguobin@growingio.com",
        url = url("https://www.growingio.com")
      )),
    sonatypeProfileName := organization.value,
    isSnapshot := version.value endsWith "SNAPSHOT",
    homepage := Some(url("https://www.growingio.com")),
    scmInfo := Some(
      ScmInfo(
        url("https://github.com/growingio/growing-graphql-javasdk"),
        "scm:git@github.com:growingio/growing-graphql-javasdk.git"
      ))
  )
}