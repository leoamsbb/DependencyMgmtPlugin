name := "DependencyMgmtPlugin"

organization := "org.sntps"

sbtPlugin := true

version := "0.1-SNAPSHOT"

lazy val root = (project in file("."))
  .enablePlugins(SbtPlugin)
  .settings(
    scriptedLaunchOpts := { scriptedLaunchOpts.value ++
      Seq("-Xmx1024M", "-Dplugin.version=" + version.value)
    },
    scriptedBufferLog := false
  )