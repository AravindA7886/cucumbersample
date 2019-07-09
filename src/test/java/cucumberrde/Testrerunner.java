package cucumberrde;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="@src/test/resources/failed.txt",glue="cucumberr",plugin= {"html:target","json:target/report.json"})


public class Testrerunner {

}
