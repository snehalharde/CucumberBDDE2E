package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        plugin = {"pretty",
        "html:target/Cucumber-reports/cucumber-report.html"},
        features={"src/test/resources/Features/ChallengingDom.feature"},
        glue = {"StepDefinitions"},
        monochrome = true
)
public class ChallengingDomTest extends AbstractTestNGCucumberTests {
}
