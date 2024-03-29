import sbt._
import Keys._
import PlayProject._

object ApplicationBuild extends Build {

    val appName         = "helloworld"
    val appVersion      = "1.0-SNAPSHOT"

    val appDependencies = Seq(
      // Add your project dependencies here,
        	"org.mongodb" %% "casbah" % "2.5.0"
    )

    val main = PlayProject(appName, appVersion, appDependencies, mainLang = JAVA).settings(
      // Add your own project settings here      
    )

}
