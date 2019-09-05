//Imports
import sbt._

object Dependencies {

  //List of Versions
  val V = new {
    val kafka                       = "2.3.0"
    val akka                        = "2.5.22"
    val akkaHttp                    = "10.1.8"
    val akkaHttpCirce               = "1.25.2"
    val akkaKafka                   = "1.0.1"
    val circe                       = "0.11.1"
    val logbackJson                 = "5.2"
    val logback                     = "1.2.3"
    val scalaTest                   = "3.0.5"
    val scalaXML                    = "1.0.6"
    val datastax                    = "3.4.0"
    val zooKeeper                   = "3.4.14"
    val aenea                       = "1.0.0"
  }


  
  //List of Dependencies
  val D = new {
    //Kafka
    val kafka                       = "org.apache.kafka" % "kafka-clients" % V.kafka
    
    
    //Akka
    val akkaStream                  = "com.typesafe.akka" %% "akka-stream" % V.akka
    //Akka Http
    val akkaHttp                    = "com.typesafe.akka" %% "akka-http" % V.akkaHttp
    //Logging
    val akkaSlf4j                   = "com.typesafe.akka" %% "akka-slf4j" % V.akka
    val logback                     = "ch.qos.logback" % "logback-classic" % V.logback
    val logbackJson                 = "net.logstash.logback" % "logstash-logback-encoder" % V.logbackJson
    //Test
    val scalaTest                   = "org.scalatest" %% "scalatest" % V.scalaTest % "test"
    val akkaTestKit                 = "com.typesafe.akka" %% "akka-testkit" % V.akka % Test
  }

  val commonDependencies: Seq[ModuleID] = Seq(
    D.kafka,
    D.akkaStream,
    D.akkaHttp,
    D.akkaSlf4j,
    D.logback,
    D.logbackJson,
    D.scalaTest,
    D.akkaTestKit
  )

}
