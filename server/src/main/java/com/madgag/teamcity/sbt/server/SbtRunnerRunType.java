package com.madgag.teamcity.sbt.server;

import java.util.*;

import com.madgag.teamcity.sbt.common.SbtRunnerConstants;
import jetbrains.buildServer.requirements.Requirement;
import jetbrains.buildServer.serverSide.InvalidProperty;
import jetbrains.buildServer.serverSide.PropertiesProcessor;
import jetbrains.buildServer.serverSide.RunType;
import jetbrains.buildServer.serverSide.RunTypeRegistry;
import jetbrains.buildServer.web.openapi.PluginDescriptor;

public class SbtRunnerRunType extends RunType {
  private PluginDescriptor myPluginDescriptor;

  public SbtRunnerRunType(final RunTypeRegistry runTypeRegistry, final PluginDescriptor pluginDescriptor) {
    myPluginDescriptor = pluginDescriptor;
    runTypeRegistry.registerRunType(this);
  }

  @Override
  public PropertiesProcessor getRunnerPropertiesProcessor() {
    return new PropertiesProcessor() {

        public Collection<InvalidProperty> process(Map<String, String> properties) {
            return Collections.emptyList();
        }
    };
  }

  @Override
  public String getDescription() {
    return SbtRunnerConstants.RUNNER_DESCRIPTION;
  }

  @Override
  public String getEditRunnerParamsJspFilePath() {
    return myPluginDescriptor.getPluginResourcesPath("editFxCopRunParams.jsp");
  }

  @Override
  public String getViewRunnerParamsJspFilePath() {
    return myPluginDescriptor.getPluginResourcesPath("viewSbtRunParams.jsp");
  }

  @Override
  public Map<String, String> getDefaultRunnerProperties() {
      return new HashMap<String, String>();
  }

  @Override
  
  public String getType() {
    return SbtRunnerConstants.RUNNER_TYPE;
  }

  @Override
  public String getDisplayName() {
    return "RUNNER_DISPLAY_NAME";
  }

  
  @Override
  public String describeParameters( final Map<String, String> parameters) {
    return "";
  }

  @Override
  public List<Requirement> getRunnerSpecificRequirements( final Map<String, String> runParameters) {
    return Collections.emptyList();
  }
}
