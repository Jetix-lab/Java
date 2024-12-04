package org.omrbranch.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(dryRun = false, stepNotifications = true, tags = "@sanity",glue = "org.omrbranch.stepdef", snippets = SnippetType.CAMELCASE, features = "src\\test\\resources")
public class RunnerClass {
}
