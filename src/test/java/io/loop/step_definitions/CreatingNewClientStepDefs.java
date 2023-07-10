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
    public void user_create_a_new_client() {

        docuportLoginPage.Client.click();
        docuportLoginPage.new_client.click();
        docuportLoginPage.personal.click();
        docuportLoginPage.newClientFirstName.sendKeys("Gunel");
        docuportLoginPage.newClientLastName.sendKeys("Java");
        docuportLoginPage.creatNewClientCheckBok.click();
        docuportLoginPage.newClientEmail.sendKeys("747Java474@gmail.com");
        docuportLoginPage.adviserDropdown.click();
        docuportLoginPage.Group2.click();
        docuportLoginPage.phoneNumber.sendKeys("7777777777");
        docuportLoginPage.password.sendKeys("77Java");
        docuportLoginPage.confirmPassword.sendKeys("77Java");
        docuportLoginPage.saveButton.click();
        docuportLoginPage.datelabel.click();
        BrowserUtils.clickWithJS(docuportLoginPage.BOD);
        docuportLoginPage.phoneNumber.sendKeys("7777777777");
        docuportLoginPage.advisor.click();
        docuportLoginPage.Group2.click();
       // docuportLoginPage.service.sendKeys("java");
     //   docuportLoginPage.collabrator.click();


       docuportLoginPage.addressLine1.sendKeys("3 Hepworth Cres");
        docuportLoginPage.addressLine2.sendKeys("31 Capstone Lane");
        docuportLoginPage.city.sendKeys("Ancaster");
        docuportLoginPage.state.click();
        docuportLoginPage.selectState.click();
        docuportLoginPage.zipcode.sendKeys("45678");
        docuportLoginPage.SaveFinish.click();

    }
    @Then("Validate that new client created")
    public void validate_that_new_client_created() {
      //  Assert.assertEquals("77Java474@gmail.com",docuportLoginPage..getText());

    }
    @Then("Log out as an advisor")
    public void log_out_as_an_advisor() {
       docuportLoginPage.batch.click();
        docuportLoginPage.logOut.click();


    }
    @Then("Log as a new client")
    public void log_as_a_new_client() {

        docuportLoginPage.loginInput.sendKeys("747Java474@gmail.com");
       docuportLoginPage.passwordInput.sendKeys("77Java");
        docuportLoginPage.loginButton.click();

    }


}
