package com.corentrols.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
        "html:target/cucumber-reports.html",
        "json:target/json-report.json",
        "me.jvt.cucumber.report.PrettyReports:target/cucumber",
        "rerun:target/rerun.txt"}, // Plugins for reporting

        features = "src/test/resources/features", // Path to your feature files
        glue = "com/corentrols/step_defs", // Package name where your step definitions are located
        tags = "@menu",
        dryRun = false// Tags to specify which scenarios to run, you can remove this if you want to run all scenarios

)
public class CukesRunner {
        // This class doesn't need any code in it. It's just a runner class.
}


