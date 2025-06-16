package stepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:/Users/Admin/git/MyWorkSpace/MyWorkSpace/src/test/resources/Features",
				glue= {"stepDefinitions"},
				monochrome=true,
				plugin= {"pretty","html:target/HtmlReports/report.html"})
public class TestRunner {

}
