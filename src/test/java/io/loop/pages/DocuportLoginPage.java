package io.loop.pages;

import io.cucumber.java.an.E;
import io.loop.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.XMLFormatter;

public class DocuportLoginPage extends DocuportBasePage {


    @FindBy(xpath = "//label[.='Username or email']/following-sibling::input")
    public WebElement loginInput;

    @FindBy(xpath = "//label[.='Password']/following-sibling::input")
    public WebElement passwordInput;


    public String getLeftElement(String leftIcon){
        String actual = Driver.getDriver()
                .findElement(By.xpath("//span[contains(text(), '"+leftIcon+"')]")).getText();
        return actual;
    }
    @FindBy(xpath = "//span[.='Clients']")
    public WebElement Client;
    @FindBy(xpath = "//span[contains(text(),'Create new client')]")
    public WebElement new_client;

    @FindBy(xpath = "//span[contains(text(),'Personal')]")
    public WebElement personal;
    @FindBy(xpath = "//label[.='First name']/following-sibling::input")
    public WebElement newClientFirstName;

    @FindBy(xpath = "//label[.='Last name']/following-sibling::input")
    public WebElement newClientLastName;



    @FindBy(xpath = "//div[@class='v-input--selection-controls__ripple']")
    public WebElement creatNewClientCheckBok;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement saveButton;

    @FindBy(xpath = "//label[.='Email address']/following-sibling::input")
    public WebElement newClientEmail;

    @FindBy(xpath = "(//input[@autocomplete='off'])[3]")
    public WebElement adviserDropdown;

    @FindBy(xpath = "//div[contains(text(),'Group2')]")
    public WebElement Group2;

    @FindBy(xpath = "//label[.='Phone number']/following-sibling::input")
    public  WebElement phoneNumber;

    @FindBy(xpath ="//label[.='Password']/following-sibling::input" )
    public WebElement password;

    @FindBy(xpath = "//label[.='Confirm password']/following-sibling::input")
    public WebElement confirmPassword;

    @FindBy(xpath = "//div[.='6']")
    public WebElement BOD;
    @FindBy(xpath = "//label[.='Date of birth']/following-sibling::input")
    public WebElement datelabel;

    @FindBy(xpath = "(//input[@autocomplete ='off'])[1]")
    public WebElement advisor;

    @FindBy(xpath = "(//input[@autocomplete ='off'])[2]")
    public WebElement service;

    @FindBy(xpath = "(//div[@class='v-list-item__action'])[1]")
    public WebElement bookkeeping;

    @FindBy(xpath = "//label[.='Collaborators']/following-sibling::input")
    public WebElement collabrator;

    @FindBy(xpath = "//label[.='Address line 1']/following-sibling::input")
    public WebElement addressLine1;

    @FindBy(xpath = "//label[.='Address line 2']/following-sibling::input")
    public WebElement addressLine2;

    @FindBy(xpath = "//label[.='Zip code']/following-sibling::input")
    public WebElement city;

    @FindBy(xpath = "(//input[@autocomplete ='off'])[5]")
    public WebElement state;
    @FindBy(xpath = "//div[.='California']/div/div")
    public WebElement selectState;
    @FindBy(xpath = "//label[.='Zip code']/following-sibling::input")
    public WebElement zipcode;

    @FindBy(xpath = "//span[.=' Save ']")
    public WebElement SaveFinish;

    @FindBy(xpath = "//span[.='Batch1 Group2']")
    public WebElement batch;

    @FindBy(xpath = "//span[.='Log out']")
    public WebElement logOut;








    public DocuportLoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);



    }
}
