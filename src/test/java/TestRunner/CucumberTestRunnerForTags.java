package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags="@smoke and @regression not @perf", 
features= {"src/test/resources/FeaturesWithTags"},
glue= {"StepDefinations"},
plugin= {"pretty","html:target/htmlreport.html"})


public class CucumberTestRunnerForTags extends AbstractTestNGCucumberTests
{

}
