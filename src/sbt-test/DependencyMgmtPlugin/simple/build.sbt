import FirstProject._

name := "DependencyMgmtPlugin-simple"

libraryDependencies ++= Seq(
  akka_stream_kafka,
  postgres
)