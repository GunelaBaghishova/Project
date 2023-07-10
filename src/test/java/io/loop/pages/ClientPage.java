package io.loop.pages;

import io.loop.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClientPage {



    @FindBy(xpath = "//h3[.='Choose account']")
    public WebElement chooseAccount;

    @FindBy(xpath = "//span[contains(normalize-space(),'Continue')]")
    public WebElement continueButton;





    public ClientPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
