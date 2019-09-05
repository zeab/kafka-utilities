
//Imports
import Settings._
import Dependencies._
import Docker._
import ModuleNames._

//Sbt Log Level
logLevel := Level.Info

//Add all the command alias's
CommandAlias.allCommandAlias

lazy val kafkaproducerutility = (project in file(kafkaProducerKey))
  .settings(kafkaProducerSettings: _*)
  .settings(libraryDependencies ++= commonDependencies)
  .settings(kafkaProducerSettings)
  .enablePlugins(AshScriptPlugin)
  .enablePlugins(AssemblyPlugin)

lazy val kafkaconsumerutility = (project in file(kafkaConsumerKey))
  .settings(kafkaConsumerSettings: _*)
  .settings(libraryDependencies ++= commonDependencies)
  .settings(kafkaConsumerDockerSettings)
  .enablePlugins(AshScriptPlugin)
  .enablePlugins(AssemblyPlugin)
