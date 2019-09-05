
//Imports
import Common._
import Versions._
import com.typesafe.sbt.packager.docker.DockerPlugin.autoImport._
import sbt.Def
import ModuleNames._

object Docker {

  val repo: Option[String] = Some("zeab")

  //Image List
  val I = new {
    val openjdk8Alpine: String = "openjdk:8-jdk-alpine"
    val openjdk8Slim: String = "openjdk:8-jdk-slim"
  }
  
  val kafkaProducerDockerSettings: Seq[Def.Setting[_]] = Seq(
    dockerBaseImage := I.openjdk8Alpine,
    dockerRepository := repo,
    dockerLabels := mapDockerLabels(kafkaProducerKey, kafkaProducerVersion, buildTime),
    dockerUpdateLatest := true
  )

  val kafkaConsumerDockerSettings: Seq[Def.Setting[_]] = Seq(
    dockerBaseImage := I.openjdk8Alpine,
    dockerRepository := repo,
    dockerLabels := mapDockerLabels(kafkaConsumerKey, kafkaConsumerVersion, buildTime),
    dockerUpdateLatest := true
  )

}
