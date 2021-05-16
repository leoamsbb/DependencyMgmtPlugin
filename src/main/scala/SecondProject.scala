import sbt._

object SecondProject extends AutoPlugin with LoggingDependencies {
  private val h2_db_version = "1.4.192"

    val h2_db = "com.h2database" % "h2" % h2_db_version
}
