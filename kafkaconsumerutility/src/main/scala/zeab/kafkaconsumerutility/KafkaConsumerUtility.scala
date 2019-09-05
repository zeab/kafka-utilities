package zeab.kafkaconsumerutility

//Imports
import java.time.Duration
import java.util.Properties
//Kafka
import org.apache.kafka.clients.consumer.KafkaConsumer

object KafkaConsumerUtility extends App {

  val props: Properties = new Properties()
  props.put("key.deserializer", "org.apache.kafka.common.serialization.StringDeserializer")
  props.put("value.deserializer", "org.apache.kafka.common.serialization.StringDeserializer")
  props.put("group.id", "something")

  if (AppConf.isSSLEnabled){
    props.put("bootstrap.servers", s"SSL://${AppConf.kafkaHost}:${AppConf.kafkaSSLPort}")
    props.put("security.protocol","SSL")
  }
  else{
    props.put("bootstrap.servers", s"${AppConf.kafkaHost}:${AppConf.kafkaPort}")
  }



  val consumer = new KafkaConsumer[String, String](props)

  val topics = consumer.listTopics(Duration.ofSeconds(60))

  while(true){}

}


//https://gist.github.com/fancellu/f78e11b1808db2727d76