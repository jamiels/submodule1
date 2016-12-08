name := """submodule1"""

version := "1.0-SNAPSHOT"

// Be sure to comment this out
//lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  javaJdbc,
  cache,
  javaWs
)

libraryDependencies += evolutions
libraryDependencies += filters
TwirlKeys.constructorAnnotations += "@javax.inject.Inject()"


// Load dependencies
// https://mvnrepository.com/artifact/org.yaml/snakeyaml - Play no longer supports Yaml natively
libraryDependencies += "org.yaml" % "snakeyaml" % "1.17"

// braintree payment service
libraryDependencies += "com.braintreepayments.gateway" % "braintree-java" % "2.66.0"

// twilio sms service
libraryDependencies += "com.twilio.sdk" % "twilio-java-sdk" % "6.3.0"
// needed by twilio
libraryDependencies += "org.apache.httpcomponents" % "httpcore" % "4.4.4"

// display unchecked and deprecated during compile
javacOptions ++= Seq("-Xlint:unchecked")
javacOptions ++= Seq("-Xlint:deprecation")



sources in (Compile, playEnhancerGenerateAccessors) := {
  ((javaSource in Compile).value / "models" ** "*.java").get
}

// skip javadocs in packaging
sources in (Compile, doc) := Seq.empty
publishArtifact in (Compile, packageDoc) := false
publishArtifact in (Compile, packageSrc) := false

// Play provides two styles of routers, one expects its actions to be injected, the
// other, legacy style, accesses its actions statically.
routesGenerator := InjectedRoutesGenerator

JsEngineKeys.engineType := JsEngineKeys.EngineType.Node
//fork in run := true

playEbeanModels in Compile := Seq("models.submodule1.*")
