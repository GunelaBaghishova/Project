package io.loop.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/html-report/cucumber-reports.html",
        "json:target/json-reports/json_report",
        "rerun:target/rerun.txt"},
              //  "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        features = "src/test/resources/features",
        glue = "io/loop/step_definitions",
        dryRun = false,
     tags = "@NC",
        monochrome = true,
        publish = false
)
public class CukesRunner {


}
