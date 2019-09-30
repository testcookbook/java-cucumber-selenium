package StepDefinitions;

import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
  features = "classpath:features",
  plugin = {"pretty", "html:target/cucumber-html-report"},
  tags = {}
)

public class RunCukesTest {
}

