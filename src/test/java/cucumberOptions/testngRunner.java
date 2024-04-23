package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/featues",glue="stepDefinitions",monochrome = true,plugin = {"pretty","html:target/cucumberReport.html"},dryRun =false)
public class testngRunner extends AbstractTestNGCucumberTests {

}
