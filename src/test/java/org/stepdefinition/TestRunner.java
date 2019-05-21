package org.stepdefinition;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\UsersLakshmi\\CloneTry\\eclipse-workspace\\cucumber\\src\\test\\resources\\feature\\pay.feature",dryRun=false,glue= {"org.stepdefinition"}, plugin= {"html:target2"})
public class TestRunner {

}
