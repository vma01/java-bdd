package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/resources/feature"},
        glue = {"CucumberFramework.steps"},
        monochrome = true,
        tags = {},
        plugin = {"pretty", "html:target/cucumber-html-report",
                "json:target/cucumber.json",
                "com.cucumber.listener.ExtentCucumberFormatter:output/report.html"}

)
public class MainRunner {
}
