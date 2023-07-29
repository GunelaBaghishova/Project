package io.loop.step_definitions;
import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import io.loop.pages.DocuportBasePage;
import io.loop.pages.DocuportLoginPage;
import io.loop.utilities.BrowserUtils;
import io.loop.utilities.ConfigurationReader;
import io.loop.utilities.DocuportUtils;
import io.loop.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.devtools.v110.dom.DOM;

public class CreatingNewClientStepDefs  {
    DocuportLoginPage docuportLoginPage= new DocuportLoginPage();
    @Given("User login as an advisor on Docuport")
    public void user_login_as_an_advisor_on_docuport() {
        DocuportUtils.login(Driver.getDriver(),"advisor");
    }
    @When("User create a new client")
    public void user_create_a_new_client()  {
        DocuportUtils.creatNewClient();
    }
    @Then("Validate that new client created")
    public void validate_that_new_client_created() {

        Assert.assertEquals("Gunel Java has been updated successfully", docuportLoginPage.successMsg.getText());
    }
    @Then("Log out as an advisor")
    public void log_out_as_an_advisor() {
       docuportLoginPage.batch.click();
        docuportLoginPage.logOut.click();}
    @Then("Log as a new client")
    public void log_as_a_new_client() {

        docuportLoginPage.loginInput.sendKeys(ConfigurationReader.getProperty("new.client.email"));
       docuportLoginPage.passwordInput.sendKeys("77Java");
        docuportLoginPage.loginButton.click();
    }
}
