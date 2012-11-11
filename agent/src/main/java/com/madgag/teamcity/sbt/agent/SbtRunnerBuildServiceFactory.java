package com.madgag.teamcity.sbt.agent;

import com.madgag.teamcity.sbt.common.SbtRunnerConstants;
import jetbrains.buildServer.agent.AgentBuildRunnerInfo;
import jetbrains.buildServer.agent.BuildAgentConfiguration;
import jetbrains.buildServer.agent.runner.CommandLineBuildService;
import jetbrains.buildServer.agent.runner.CommandLineBuildServiceFactory;

public class SbtRunnerBuildServiceFactory implements CommandLineBuildServiceFactory {

    public CommandLineBuildService createService() {
        return new SbtRunnerBuildService();
    }

    public AgentBuildRunnerInfo getBuildRunnerInfo() {
        return new AgentBuildRunnerInfo() {
            public String getType() {
                return SbtRunnerConstants.RUNNER_TYPE;
            }

            public boolean canRun(BuildAgentConfiguration agentConfiguration) {
                return true;
            }
        };
    }
}
