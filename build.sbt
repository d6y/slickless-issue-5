scalaVersion := "2.11.7"

resolvers += "Underscore Bintray" at "https://dl.bintray.com/underscoreio/libraries"

libraryDependencies ++= Seq(
  "com.typesafe.slick" %% "slick"     % "3.0.0",
  "com.chuusai"        %% "shapeless" % "2.2.5",
  "io.underscore"      %% "slickless" % "0.1.1"
)

