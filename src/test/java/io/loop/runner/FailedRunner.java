package io.loop.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/html-report/cucumber-reports.html",
                "json:target/json-reports/json_report"},
        features = "@target/rerun.txt",
        glue = "io/loop/step_definitions",
        monochrome = true
)

public class FailedRunner {
}
