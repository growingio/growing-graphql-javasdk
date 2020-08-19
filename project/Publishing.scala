import sbt.Keys._
import sbt._

object Publishing extends AutoPlugin {

  override def trigger: PluginTrigger = allRequirements

  override def projectSettings: Seq[_root_.sbt.Def.Setting[_]] = Seq(
    credentials += Credentials(Path.userHome / ".ivy2" / ".credentials"),
    publishMavenStyle := true,
    publishTo := {
      val nexus = "https://nexus.growingio.com"
      if (isSnapshot.value) {
        Some("snapshots" at nexus + "/repository/maven-snapshots/")
      } else {
        Some("releases" at nexus + "/repository/maven-releases/")
      }
    },
    pomExtra :=
      <url>https://codes.growingio.com/diffusion/211/</url>
      <scm>
        <url>ssh://vcs-user@codes.growingio.com/diffusion/211/growing-events.git</url>
        <connection>scm:git:ssh://vcs-user@codes.growingio.com/diffusion/211/growing-events.git</connection>
      </scm>
      <developers>
        <developer>
          <id>yanbo.ai</id>
          <name>Andy Ai</name>
          <url>http://aiyanbo.github.io/</url>
        </developer>
      </developers>)

}

object DontPublish extends AutoPlugin {

  override def requires: Plugins = plugins.IvyPlugin

  override def projectSettings: Seq[_root_.sbt.Def.Setting[_]] = Seq(
    publishArtifact := false,
    publish := Unit,
    publishLocal := Unit)

}
