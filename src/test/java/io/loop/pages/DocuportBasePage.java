package io.loop.pages;

import io.loop.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DocuportBasePage {


    @FindBy(xpath = "//span[.=' Log in ']")
    public WebElement loginButton;

    @FindBy(xpath = "//span[.='Home']")
    public WebElement homeIcon;

     public DocuportBasePage(){
         PageFactory.initElements(Driver.getDriver(),this);
     }
}
