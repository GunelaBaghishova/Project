package io.loop.pages;

import io.loop.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

@FindBy(xpath = "//input[@id='input-14']")
public WebElement loginInput;

    @FindBy(xpath = "//input[@id='input-15']")
    public WebElement passwordInput;

    @FindBy(xpath = "//span[.=' Log in ']")
    public WebElement loginButton;

    @FindBy(xpath = "//span[.='Home']")
    public WebElement homeIcon;



    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


}
