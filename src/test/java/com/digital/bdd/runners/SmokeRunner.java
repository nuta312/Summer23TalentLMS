package com.digital.bdd.runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/feature",
        glue = "com.digital.bdd.step_defs",
        tags = "@table",
        monochrome = true,
        dryRun = false,
        plugin  ={
                "pretty",
                "html:target/default-cucumber-reports",
                "json:target/cucumber.json"},
        publish = true
)

public class SmokeRunner {


}
