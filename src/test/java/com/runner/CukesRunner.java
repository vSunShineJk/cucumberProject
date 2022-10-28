package com.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/Features", // features mean -> location of 'Features' folder
        glue = "com/step_definition", // glue means ->step definitions
        dryRun = false,
        tags = "@regression"
)

public class CokesRunner {

}
