package io.loop.pages;

import io.loop.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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

    public DocuportLoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);



    }
}
