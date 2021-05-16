import SecondProject._
import FirstProject._

name := "DependencyMgmtPlugin-multiple"

libraryDependencies ++= Seq(
  log4jOverSlf4j,
  logstashLogbackEncoder,
  h2_db,
  akka_stream_kafka
)