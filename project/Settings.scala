
//Imports
import Common.seqBaseProjectTemplate
import Versions._
import sbt.Def

//Settings
object Settings {
  val kafkaProducerSettings: Seq[Def.Setting[_]] = seqBaseProjectTemplate(kafkaProducerVersion)
  val kafkaConsumerSettings: Seq[Def.Setting[_]] = seqBaseProjectTemplate(kafkaConsumerVersion)
}
