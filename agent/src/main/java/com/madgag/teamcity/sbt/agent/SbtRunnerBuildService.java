package com.madgag.teamcity.sbt.agent;

import jetbrains.buildServer.RunBuildException;
import jetbrains.buildServer.agent.runner.BuildServiceAdapter;
import jetbrains.buildServer.agent.runner.ProgramCommandLine;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.Arrays.asList;

public class SbtRunnerBuildService extends BuildServiceAdapter {

    @Override
    public ProgramCommandLine makeProgramCommandLine() throws RunBuildException {

        // use jetbrains.buildServer.agent.runner.JavaCommandLineBuilder instead?
        // see TeamCity/buildAgent/lib/agent.jar


        return new ProgramCommandLine() {
            public String getExecutablePath() throws RunBuildException {
                return "/usr/bin/java";
            }

            public String getWorkingDirectory() throws RunBuildException {
                return "/home/roberto/scala-coursera/funsets";
            }

            public List<String> getArguments() throws RunBuildException {
                return asList("-XX:+CMSClassUnloadingEnabled -Xms1536m -Xmx1536m -XX:MaxPermSize=384m -XX:ReservedCodeCacheSize=192m -Dfile.encoding=UTF8 -jar /home/roberto/.sbt/.lib/0.11.3-2/sbt-launch.jar".split(" "));
            }

            public Map<String, String> getEnvironment() throws RunBuildException {
                return new HashMap<String, String>();
            }
        };
    }
}
