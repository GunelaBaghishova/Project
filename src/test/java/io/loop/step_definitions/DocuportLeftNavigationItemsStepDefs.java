package io.loop.step_definitions;

import io.cucumber.java.en.*;
import io.loop.pages.DocuportBasePage;
import io.loop.pages.DocuportLoginPage;
import io.loop.utilities.BrowserUtils;
import io.loop.utilities.ConfigurationReader;
import io.loop.utilities.Driver;

public class DocuportLeftNavigationItemsStepDefs  {

    DocuportLoginPage docuportLoginPage= new DocuportLoginPage();
    DocuportBasePage docuportBasePage = new DocuportBasePage();



    @Given("User login  home page on Docuport")
    public void user_login_home_page_on_docuport() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
    }
    @When("User enters credential each  {string} and {string}")
    public void user_enters_credential_each_and(String username, String password) {
        docuportLoginPage.loginInput.sendKeys(username);
        docuportLoginPage.passwordInput.sendKeys(password);
        docuportLoginPage.loginButton.click();

        if(username.equals("b1g2_client@gmail.com")){
            docuportLoginPage.clickButton("continue");
  BrowserUtils.waitForVisibility(docuportLoginPage.receivedDocs,15);
        }
    }
    @When("User click on  {string} item")
    public void user_click_on_item(String item) {
        BrowserUtils.waitForVisibility(docuportBasePage.receivedDocs,15);
       docuportBasePage.clickButton(item);

    }
    @Then("Validate {string} button is displayed")
    public void validate_button_is_displayed(String button) {
       docuportBasePage.validateButton(button);

    }
    @Then("Validate {string} header is displayed")
    public void validate_header_is_displayed(String header) {
        docuportBasePage.validateHeader(header);

    }
    @When("User clicks on {string} item")
    public void user_clicks_on_item(String item) {
        docuportBasePage.clickButton(item);

    }









}
