package io.loop.step_definitions;

import io.cucumber.java.en.*;
import io.loop.pages.DocuportBasePage;
import io.loop.pages.DocuportLoginPage;
import io.loop.utilities.ConfigurationReader;
import io.loop.utilities.Driver;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class DocuportStepsDef  {
    DocuportLoginPage docuportLoginPage = new DocuportLoginPage();


    @Given("User is on Docuport login page")
    public void user_is_on_docuport_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));

    }
    @When("user enters {string} and {string} for credentials for each user")
    public void user_enters_and_for_credentials_for_each_user(String username, String password) {
        docuportLoginPage.loginInput.sendKeys(username);
        docuportLoginPage.passwordInput.sendKeys(password);



    }
    @When("user enter login button")
    public void user_enter_login_button() {
        docuportLoginPage.loginButton.click();

    }
    @When("user should see home page")
    public void user_should_see_home_page() {
        docuportLoginPage.homeIcon.isDisplayed();

    }
    @Then("validate left navigate items of docuport for each user")
    public void validate_left_navigate_items_of_docuport_for_each_user(List<Map<String,String>> leftItems) {

        for(Map<String,String> leftItem:leftItems){
            Assert.assertEquals(leftItem.get("Client"),docuportLoginPage.getLeftElement(leftItem.get("Client")));


        }







    }

}
