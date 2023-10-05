package stepDefination;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",
glue= {"basic.Ankita"}, monochrome=true, plugin= {"pretty","html:target/HTMLReport","json:target/JsonReport/report.json","junit:target/JunitReport/report.xml"})
public class TestRunner {

}
