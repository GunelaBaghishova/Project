package io.loop.utilities;

import io.loop.pages.DocuportLoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.InputMismatchException;

public class DocuportUtils {
    /**
     * login to the docuport application
     * @param driver which initialized  in test base
     * @param role , comes from DocuportConstants
     */
    public static void login(WebDriver driver, String role) {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        WebElement username = Driver.getDriver().findElement(By.xpath("//label[.='Username or email']//following-sibling::input"));
        WebElement password = Driver.getDriver().findElement(By.xpath("//input[@type='password']"));
        WebElement loginButton = Driver.getDriver().findElement(By.xpath("//button[@type='submit']"));
        switch (role.toLowerCase()){
            case "client":
                username.sendKeys(ConfigurationReader.getProperty("client"));
                password.sendKeys(ConfigurationReader.getProperty("password"));
                break;
            case "supervisor":
                username.sendKeys(ConfigurationReader.getProperty("supervisor"));
                password.sendKeys(ConfigurationReader.getProperty("password"));
                break;
            case "advisor":
                username.sendKeys(ConfigurationReader.getProperty("advisor"));
                password.sendKeys(ConfigurationReader.getProperty("password"));
                break;
            case "employee":
                username.sendKeys(ConfigurationReader.getProperty("employee"));
                password.sendKeys(ConfigurationReader.getProperty("password"));
                break;
            default: throw new InputMismatchException("There is not suc a role: " + role);
        }
        loginButton.click();
    }

    /**
     * logsout from the application
     * @param driver
     * @author GunelB.
     */
    public static void logout(WebDriver driver){

        WebElement userIcon = Driver.getDriver().findElement(By.xpath("//div[@class='v-avatar primary']"));
        userIcon.click();
        WebElement logOut = Driver.getDriver().findElement(By.xpath("//span[contains(text(),'Log out')]"));
        logOut.click();

    }
    /**
     * This method creates new client
     * @author GunelB.
     */

    public static void creatNewClient()  {
        DocuportLoginPage docuportLoginPage= new DocuportLoginPage();
        docuportLoginPage.Client.click();
        docuportLoginPage.new_client.click();
        docuportLoginPage.personal.click();
        docuportLoginPage.newClientFirstName.sendKeys("Gunel");
        docuportLoginPage.newClientLastName.sendKeys("Java");
        docuportLoginPage.creatNewClientCheckBok.click();
        docuportLoginPage.newClientEmail.sendKeys( ConfigurationReader.getProperty("new.client.email"));
        docuportLoginPage.adviserDropdown.click();
        docuportLoginPage. Group2.click();
        docuportLoginPage. phoneNumber.sendKeys("5555555555");
        docuportLoginPage. password.sendKeys("77Java");
        docuportLoginPage. confirmPassword.sendKeys("77Java");
        docuportLoginPage. saveButton.click();
        docuportLoginPage.datelabel.click();
        BrowserUtils.clickWithJS( docuportLoginPage.BOD);
        docuportLoginPage. phoneNumber.sendKeys("5555555555");
        docuportLoginPage.advisor.click();
        docuportLoginPage.Group2.click();
        docuportLoginPage.service.click();
        docuportLoginPage. selectService.click();
        docuportLoginPage. addressLine1.sendKeys("3 Hepworth Cres");
        docuportLoginPage. addressLine2.sendKeys("31 Capstone lane");
        docuportLoginPage. city.sendKeys("Ancaster");
        docuportLoginPage. state.click();
        docuportLoginPage. selectState.click();
        docuportLoginPage. zipcode.sendKeys("45678");
        docuportLoginPage. SaveFinish.click();
        BrowserUtils.waitForVisibility( docuportLoginPage.successMsg,10);
    }


    }

