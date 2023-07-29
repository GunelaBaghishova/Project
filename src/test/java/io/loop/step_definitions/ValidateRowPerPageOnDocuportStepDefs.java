package io.loop.step_definitions;
import io.cucumber.java.en.*;
import io.loop.pages.LoginPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import static org.junit.Assert.*;
import java.util.Map;
public class ValidateRowPerPageOnDocuportStepDefs {
  LoginPage loginPage= new LoginPage();
  private static final Logger LOG = LogManager.getLogger();
  @When("User enters credential as adviser")
    public void user_enters_credential_as_adviser(Map<String,String> credentials) {
     loginPage.loginDocuport(credentials.get("username"),credentials.get("password"));
    }

  @When("User clicks {string} button for {string}")
  public void user_clicks_button_for(String button, String username) {
        if(username.equals("b1g2_employee@gmail.com")){
            loginPage.leftItem("Users");
        }else{
            loginPage.leftItem("Leads");
            loginPage.leftItem("Users");
        }
  }
//    @When("User clicks {string} button")
//    public void user_clicks_button(String items) {
//      loginPage.leftItem(items);
//      LOG.info("User click "+items+ " button successfully");
//
//
//  }
    @Then("Validate that Rows Per Page shows by default {int}")
    public void validate_that_rows_per_page_shows_by_default(Integer int1) {
      assertEquals(int1.toString(), loginPage.ten.getText());
      LOG.info("User validates that rows per page by default is 10");
    }
    @Then("Change Rows Per Page to {int}")
    public void change_rows_per_page_to(Integer int2) {
      loginPage.ten.click();
      loginPage.selectRowNum(int2);
      LOG.info("User changed row per page to "+int2);
    }
    @Then("Validate that after changing it is showing {int}")
    public void validate_that_after_changing_it_is_showing(Integer int2) {
      assertEquals(int2.toString(), loginPage.afterFive.getText());
      LOG.info("User validates that after changing it is showing "+int2);

    }



}
