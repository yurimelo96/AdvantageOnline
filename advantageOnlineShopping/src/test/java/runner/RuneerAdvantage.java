package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Features/LoginSite.feature", glue = { "page", "core" }, tags = "not @skip")
public class RuneerAdvantage {

}