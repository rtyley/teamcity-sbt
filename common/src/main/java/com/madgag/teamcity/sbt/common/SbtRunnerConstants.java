package com.madgag.teamcity.sbt.common;

public interface SbtRunnerConstants {
  String FXCOP_ROOT_PROPERTY = "system.FxCopRoot";
  String FXCOPCMD_FILE_VERSION_PROPERTY = "system.FxCopCmdFileVersion";

  String RUNNER_TYPE = "FxCop";
  String FXCOPCMD_BINARY = "FxCopCmd.exe";

  String SETTINGS_FILES = "fxcop.files";
  String SETTINGS_FILES_EXCLUDE = "fxcop.files_exclude";
  String SETTINGS_PROJECT = "fxcop.project";
  String SETTINGS_ADDITIONAL_OPTIONS = "fxcop.addon_options";
  String SETTINGS_REPORT_XSLT = "fxcop.report_xslt";
  String SETTINGS_FXCOP_ROOT = "fxcop.root";
  String SETTINGS_FXCOP_VERSION = "fxcop.version";
  String SETTINGS_SEARCH_DIRS = "fxcop.search_in_dirs";
  String SETTINGS_SEARCH_IN_GAC = "fxcop.search_in_gac";
  String SETTINGS_IGNORE_GENERATED_CODE = "fxcop.ignore_generated_code";
  String SETTINGS_FAIL_ON_ANALYSIS_ERROR = "fxcop.fail_on_analysis_error";

  String SETTINGS_WHAT_TO_INSPECT = "fxcop.what";
  String WHAT_TO_INSPECT_FILES = "files";
  String WHAT_TO_INSPECT_PROJECT = "project";

  String RUNNER_DISPLAY_NAME = "SBT";
  String RUNNER_DESCRIPTION = "Simple Build Tool runner (Scala)";

  String REPORT_FILE = "fxcop-report.html";
  String OUTPUT_FILE = "fxcop-result.xml";
}
