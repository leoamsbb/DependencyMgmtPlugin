sys.props.get("plugin.version") match {
  case Some(pluginVersion) => addSbtPlugin("org.sntps" % "dependencymgmtplugin" % pluginVersion)
  case _ => sys.error(
    """The system property plugin.version is not defined.
      |Specify this property using the scriptedLaunchOpts -D""".stripMargin)
}
