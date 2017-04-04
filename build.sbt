name := """play-scala-seed"""
organization := "com.example"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.8"

libraryDependencies += filters
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "2.0.0" % Test

// ElasticSearch related ---------------------------------------------------------------------------------------------

lazy val elastic4s                = "com.sksamuel.elastic4s"       %% "elastic4s-core"                % "5.2.11"
lazy val elastic4s_http           = "com.sksamuel.elastic4s"       %% "elastic4s-http"                % "5.2.11"
lazy val elastic4s_play_json      = "com.sksamuel.elastic4s"       %% "elastic4s-play-json"           % "5.2.11"
lazy val jackson_core             = "com.fasterxml.jackson.core"    % "jackson-core"                  % "2.8.7"
lazy val jackson_databind         = "com.fasterxml.jackson.core"    % "jackson-databind"              % "2.8.7"
lazy val jackson_scala            = "com.fasterxml.jackson.module" %% "jackson-module-scala"          % "2.8.7"
lazy val es = Seq(elastic4s, elastic4s_http, elastic4s_play_json, jackson_core, jackson_databind, jackson_scala)

libraryDependencies ++= es

// Adds additional packages into Twirl
//TwirlKeys.templateImports += "com.example.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "com.example.binders._"
