package zeab.kafkaconsumerutility

//Imports
import com.typesafe.config.{Config, ConfigFactory}

trait AppConf {
  val appConf: Config = ConfigFactory.load()
}

object AppConf extends AppConf {
  //Kafka
  val kafkaHost: String = appConf.getString("kafka.host")
  val kafkaPort: Int = appConf.getInt("kafka.port")
  val kafkaSSLPort: Int = appConf.getInt("kafka.sslPort")
  val isSSLEnabled: Boolean = appConf.getBoolean("kafka.ssl")
}