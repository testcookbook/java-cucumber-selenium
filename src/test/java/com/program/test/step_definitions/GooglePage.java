package step_definitions;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


public class GooglePage {
  public WebDriver driver;

  public GooglePage() {

    driver = Hooks.driver;
  }

  @Given("^I visit Google$")
    public void i_visit_Google() throws Throwable {
      driver.get("http://www.google.com");
    }

  @Then("^I see title Google$")
    public void i_see_title_Google() throws Throwable {
      assertTrue(driver.getTitle().contains("Google"));
    }


}
