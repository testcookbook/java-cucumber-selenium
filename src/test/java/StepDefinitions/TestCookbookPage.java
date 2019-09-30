package StepDefinitions;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


public class TestCookbookPage {
  public WebDriver driver;

  public TestCookbookPage() {
    driver = Hooks.driver;
  }

  @Given("^I visit Test Cookbook website$")
    public void i_visit_Test_Cookbook_website() throws Throwable {
      driver.get("http://www.testcookbook.com");
    }

  @Then("^I see title Test Cookbook$")
    public void i_see_title_Google() throws Throwable {
      assertTrue(driver.getTitle().contains("Test Cookbook"));
    }

}
