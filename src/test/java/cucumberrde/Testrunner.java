package cucumberrde;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\rgbvv\\eclipse-workspace\\cucumberr\\src\\test\\resources\\features\\onemap.feature",glue="cucumberrde",plugin= {"html:target","json:target/reprt.json","rerun:src/test/resources/failed.txt"})
public class Testrunner {

}
