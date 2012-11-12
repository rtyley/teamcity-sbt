import com.gu._
import AssemblyKeys._
import sbt.Keys._

assemblySettings

// artifact generation stuff
seq(SbtDistPlugin.distSettings :_*)

distPath <<= (target) { (target) => target / "dist" / (appName+"-agent.zip") }

// include the war itself (this is the location you want the war to save to)
distFiles <+= (outputPath in assembly) map { _ -> (appName+"/lib/"+appName+"-agent-assembly.jar") }

