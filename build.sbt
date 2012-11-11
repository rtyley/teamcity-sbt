// appName := "sbt-runner"

autoScalaLibrary in ThisBuild := false

resolvers in ThisBuild ++= Seq(
  "Guardian Github Releases" at "http://guardian.github.com/maven/repo-releases"
)

// libraryDependencies += "com.gu" % "gu-deploy-libs" % "1.70" % "dist"