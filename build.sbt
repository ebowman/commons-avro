name := "commons-avro"

organization := "com.gilt"

scalaVersion := "2.10.4"

// Can remove when we stop  building 2.10.x
// http://docs.scala-lang.org/overviews/reflection/thread-safety.html
parallelExecution in Test := false

libraryDependencies ++= Seq(
  "org.apache.avro" % "avro" % "1.7.6",
  "org.scala-lang" %% "scala-pickling" % "0.8.0",
  "org.scalatest" %% "scalatest" % "2.1.3" % "test",
  "org.scalacheck" %% "scalacheck" % "1.11.3" % "test"
)

publishMavenStyle := true

publishTo := {
  val nexus = "https://oss.sonatype.org/"
  if (isSnapshot.value)
    Some("snapshots" at nexus + "content/repositories/snapshots")
  else
    Some("releases"  at nexus + "service/local/staging/deploy/maven2")
}

publishArtifact in Test := false

pomIncludeRepository := { _ => false }

licenses := Seq("Apache-style" -> url("https://raw.githubusercontent.com/gilt/commons-avro/master/LICENSE"))

homepage := Some(url("https://github.com/gilt/commons-avro"))

pomExtra := (
  <scm>
    <url>https://github.com/gilt/commons-avro.git</url>
    <connection>scm:git:git@github.com:gilt/commons-avro.git</connection>
  </scm>
  <developers>
    <developer>
      <id>pbarron</id>
      <name>Peter Barron</name>
      <url>https://github.com/pbarron</url>
    </developer>
    <developer>
      <id>ebowman</id>
      <name>Eric Bowman</name>
      <url>https://github.com/ebowman</url>
    </developer>
  </developers>
)

