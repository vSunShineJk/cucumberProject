package com.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "html:target/cucumber-report.html",
                "rerun:target/rerun.txt",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber",
                "json:target/cucumber/cucumber.json",
                "junit:target/junit/junit-report.xml"
        },
        features = "src/test/resources/Features", // features mean -> location of 'Features' folder
        glue = "com/step_definition", // glue means ->step definitions
        dryRun = false,
        tags = "@regression",
        publish = true
)

public class CukesRunner {

}
