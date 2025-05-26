package stepDefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/Features/multiplelogin.feature",     // Path to feature files
    glue = {"stepDefinition"},                   // Path to step definitions
    tags= "@Regression",
    plugin = {
        "pretty",                                // Console output in readable format
        "html:target/cucumber-reports.html",     // HTML report
        "json:target/cucumber.json",             // JSON report
        "junit:target/cucumber.xml"              // JUnit XML report
    },
    monochrome = true,                            // Makes output readable in console
    dryRun = true
                
)
public class TestRunner {
}

