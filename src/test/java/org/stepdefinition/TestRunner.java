package org.stepdefinition;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\UsersLakshmi\\CloneTry\\eclipse-workspace\\cucumber\\src\\test\\resources\\feature\\pay.feature",dryRun=false,glue= {"org.stepdefinition"}, plugin= {"json:src/test/java/org.stepdefinition/report.json"})
public class TestRunner {

}
