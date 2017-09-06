
organization := "com.kjetland"
organizationName := "mbknor"
name := "mbknor-jackson-jsonSchema"

scalaVersion := "2.12.3"

publishMavenStyle := true
publishArtifact in Test := false

javacOptions ++= Seq("-source", "1.8", "-target", "1.8")
scalacOptions ++= Seq("-unchecked", "-deprecation")

val jacksonVersion = "2.8.7"

libraryDependencies ++= Seq(
  "com.fasterxml.jackson.core" % "jackson-databind" % jacksonVersion,
  "javax.validation" % "validation-api" % "1.1.0.Final",
  "org.slf4j" % "slf4j-api" % "1.7.7",
  "io.github.lukehutch" % "fast-classpath-scanner" % "2.0.20",

  "org.scalatest" %% "scalatest" % "3.0.0" % "test",
  "ch.qos.logback" % "logback-classic" % "1.1.3" % "test",
  "com.github.fge" % "json-schema-validator" % "2.2.6" % "test",
  "com.fasterxml.jackson.module" %% "jackson-module-scala" % "2.8.7" % "test",
  "com.fasterxml.jackson.datatype" % "jackson-datatype-jdk8" % jacksonVersion % "test",
  "com.fasterxml.jackson.datatype" % "jackson-datatype-jsr310" % jacksonVersion % "test"
)
