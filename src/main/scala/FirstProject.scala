import sbt._

object FirstProject extends AutoPlugin {

  private val activitiVersion = "6.0.0"
  private val postgresVersion = "42.2.8"
  private val akkaStreamKafkaVersion = "0.22"
  private val opencsvVersion = "4.1"
  private val scalatagsVersion = "0.6.7"
  private val retryVersion = "0.3.0"
  private val mockitoCoreVersion = "2.15.0"
  private val scalatestplusPlay_version = "2.0.0"
  private val scalatestEmbeddedKafka_version = "1.0.0"
  private val akkaTestKit_version = "2.5.13"


//  val activiti5_compatibility = "org.activiti" % "activiti5-compatibility" % activitiVersion
  val activiti_engine = "org.activiti" % "activiti-engine" % activitiVersion
  val postgres = "org.postgresql" % "postgresql" % postgresVersion
  val akka_stream_kafka = "com.typesafe.akka" %% "akka-stream-kafka" % akkaStreamKafkaVersion
  val opencsv = "com.opencsv" % "opencsv" % opencsvVersion
  val scalatags = "com.lihaoyi" %% "scalatags" % scalatagsVersion
  val retry = "com.softwaremill.retry" %% "retry" % retryVersion
  val mockito_core = "org.mockito" % "mockito-core" % mockitoCoreVersion % Test
  val scalatestplus_play = "org.scalatestplus.play" %% "scalatestplus-play" % scalatestplusPlay_version % Test
  val scalatestEmbeddedKafka = "net.manub" %% "scalatest-embedded-kafka" % scalatestEmbeddedKafka_version % Test
  val akkaTestKit = "com.typesafe.akka" %% "akka-testkit" % akkaTestKit_version % Test
}
