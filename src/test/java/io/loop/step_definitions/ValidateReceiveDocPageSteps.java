package io.loop.step_definitions;
import io.cucumber.java.en.*;
import io.loop.pages.ClientPage;
import io.loop.pages.DocuportBasePage;
import io.loop.pages.DocuportLoginPage;
import io.loop.utilities.BrowserUtils;
import io.loop.utilities.ConfigurationReader;
import io.loop.utilities.Driver;
import java.util.List;
public class ValidateReceiveDocPageSteps  extends DocuportBasePage{
    DocuportLoginPage docuportLoginPage= new DocuportLoginPage();
   // DocuportBasePage docuportBasePage= new DocuportBasePage();
   @Given("User login  home page each  {string} and {string}")
    public void user_login_home_page_each_and(String username, String password) {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        docuportLoginPage.loginInput.sendKeys(username);
        docuportLoginPage.passwordInput.sendKeys(password);
        loginButton.click();
    }
    @When("User click on  received documents each {string}")
    public void user_click_on_received_documents_each(String username) {
        if (username.equals("b1g2_client@gmail.com")) {
            docuportLoginPage.continueButton.click();
            BrowserUtils.waitForVisibility(receivedDocs, 15);
            receivedDocs.click();
        } else {
            receivedDocs.click();
        }
    }
    @Then("Validate search,download,Received  button is displayed")
    public void validate_search_download_received_button_is_displayed(List<String> elements) {
        for (String element : elements) {
            if(element.equals(receivedDocsHeader.getText())){
                receivedDocsHeader.isDisplayed();
            }else if(element.equals(downloadButton.getText())){
                downloadButton.isDisplayed();
            }else if(element.equals(searchButton.getText())){
                searchButton.isDisplayed();
            }
    }
    }
    @When("User clicks on my upload button")
    public void user_clicks_on_my_upload_button() {
        docuportLoginPage.myUploadButton.click();

    }
    @Then("User validate search,download,MyUpload is displayed")
    public void user_validate_search_download_my_upload_is_displayed(List<String> elements) {
        for (String element : elements) {
            if (element.equals(myUploadsHeader.getText())) {
                myUploadsHeader.isDisplayed();
            } else if (element.equals(downloadButton.getText())) {
                downloadButton.isDisplayed();
            } else if (element.equals(searchButton.getText())) {
               searchButton.isDisplayed();
            }
        }
    }
}
