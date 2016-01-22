// Test dependencies (Unexported)
val mockitoCoreVersion  = "1.10.19"

val common_settings = Seq(
  resolvers ++= Seq("softprops-maven" at "http://dl.bintray.com/content/softprops/maven"),
  autoScalaLibrary := false,
  organization := "com.magine",
  libraryDependencies ++= Seq(
    "org.mockito"              %  "mockito-core"       % mockitoCoreVersion   % "test"
  )
)

lazy val framework =
  Project("curator-framework", file("curator-framework"))
    .settings(common_settings:_*)

