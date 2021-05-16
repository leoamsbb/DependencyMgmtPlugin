import sbt._

trait LoggingDependencies {
  private val log4jOverSlf4jVersion = "1.7.25"
  private val logstashLogbackEncoderVersion = "4.10"
  private val logbackClassicVersion = "1.2.3"

  val log4jOverSlf4j = "org.slf4j" % "log4j-over-slf4j" % log4jOverSlf4jVersion
  val logstashLogbackEncoder = "net.logstash.logback" % "logstash-logback-encoder" % logstashLogbackEncoderVersion
  val logbackClassic = "ch.qos.logback" % "logback-classic" % logbackClassicVersion
}
