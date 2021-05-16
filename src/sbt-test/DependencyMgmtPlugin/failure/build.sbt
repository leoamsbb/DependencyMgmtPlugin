import FirstProject._

name := "DependencyMgmtPlugin-failure"

libraryDependencies ++= Seq(
  akka_stream_kafka,
  activiti5_compatibility,
  postgres
)