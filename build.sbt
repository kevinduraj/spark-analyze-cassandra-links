name := "spark-engine"

version := "1.0"

val ScalaVersion := "2.10.5"

val SparkVersion = "1.5.0"

val SparkCassandraConnector = "1.4.4"

libraryDependencies += "org.apache.spark" %% "spark-core" % SparkVersion % "provided"

libraryDependencies += "org.apache.spark" %% "spark-sql" % SparkVersion % "provided"

libraryDependencies += "org.apache.spark" %% "spark-hive" % SparkVersion % "provided"

libraryDependencies += "com.datastax.spark" %% "spark-cassandra-connector" % SparkCassandraConnector % "provided"

resolvers += Resolver.sonatypeRepo("public")

logLevel := Level.Error

// We do this so that Spark Dependencies will not be bundled with our fat jar
// but will still be included on the classpath when we do a sbt/run
//run in Compile <<= Defaults.runTask(fullClasspath in Compile, mainClass in (Compile, run), runner in (Compile, run))

assemblySettings
