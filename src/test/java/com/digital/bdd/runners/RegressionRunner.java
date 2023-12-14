package com.digital.bdd.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/feature",
        glue = "com.digital.bdd.step_defs",
        tags = "@table", // в зависимости от того, что прописано в файлах runners
        monochrome = true,
        dryRun = false, // менять при запусках позитив и негатив
        plugin = {
                "pretty",
                "html:target/default-cucumber-reports",
                "json:target/cucumber.json"},
        publish = true

)
public class RegressionRunner {

}
