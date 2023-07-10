package io.loop.step_definitions;

import io.loop.pages.ClientPage;
import io.cucumber.java.en.*;
import io.loop.utilities.BrowserUtils;
import org.apache.logging.log4j.*;
import org.assertj.core.api.SoftAssertions;

import static org.junit.Assert.*;

import static org.junit.Assert.assertTrue;


public class ClientStepDefs {
    private Logger LOG = LogManager.getLogger();
    private SoftAssertions softAssertions = new SoftAssertions();
    ClientPage clientPage = new ClientPage();

    @When("user validates choose account pop up is visible")
    public void user_validates_choose_account_pop_up_is_visible() {
        BrowserUtils.waitForVisibility(clientPage.chooseAccount,5);
//        assertTrue(clientPage.chooseAccountText.isDisplayed());
//        assertTrue(clientPage.chooseAccountText.getText().equals("Choose account"));
//        assert (clientPage.chooseAccountText.getText().equals("Choose account"));
        softAssertions.assertThat(clientPage.chooseAccount.getText().equals("Choose account")).isTrue();
        LOG.info("Account text is visible");
    }


    @When("user chooses account from drop down")
    public void user_chooses_account_from_drop_down() {
        //    assertTrue(clientPage.continueButton.isDisplayed());
        softAssertions.assertThat(clientPage.continueButton.isDisplayed()).isTrue();
        clientPage.continueButton.click();
        LOG.info("User chooses an account");
        softAssertions.assertAll();

    }
}
