package io.loop.pages;

import io.loop.utilities.BrowserUtils;
import io.loop.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public  class DocuportBasePage {


    public void leftItem(String item){
        Driver.getDriver().findElement(By.xpath("//span[.='"+item+"']")).click();
    }

    public void validateButton(String button){
        Driver.getDriver().findElement(By.xpath("//span[contains(text(),'"+button+"')]")).isDisplayed();
    }
    public void validateHeader(String header){
        Driver.getDriver().findElement(By.xpath("//h1[contains(text(),'"+header+"')]")).isDisplayed();
    }

    public void selectRowNum(Integer number){
        Driver.getDriver().findElement(By.xpath("//div[text()='"+number+"']"))
                .click();
    }

    public void clickButton(String button){
        switch (button.toLowerCase()){
            case "received docs":
                leftItem(button);
                break;
            case "my uploads":
                leftItem(button);
                break;
            case "1099 form":
                leftItem(button);
                break;
            case "reconciliations":
                leftItem(button);
                break;
            case "continue":
                continueButton .click();
               BrowserUtils.waitForVisibility(receivedDocs,20);

                break;

        }

    }

    @FindBy(xpath = "//span[.=' Log in ']")
    public WebElement loginButton;

    @FindBy(xpath = "//span[.='Home']")
    public WebElement homeIcon;

    @FindBy(xpath = "//span[.='Received docs']")
    public WebElement receivedDocs;

    @FindBy(xpath = "//h1[.='Received docs']")
    public WebElement receivedDocsHeader;

    @FindBy(xpath = "//span[contains(text(),'Download')]")
    public WebElement downloadButton;

    @FindBy(xpath = "//span[contains(text(),'Search')]")
   public WebElement searchButton;


    @FindBy(xpath = "//span[.='My uploads']")
    public WebElement myUploadButton;


    @FindBy(xpath = "//h1[.='My uploads']")
    public WebElement myUploadsHeader;
    @FindBy(xpath = "//span[contains(normalize-space(),'Continue')]")
    public WebElement continueButton;

    @FindBy (xpath = "//div[text()='10']")
    public WebElement ten;

//    @FindBy(xpath = "//div[@id='list-item-149-0']/div/div")
//    public WebElement five;
@FindBy(xpath = "(//div[text()='5'])[1]")
public WebElement afterFive;


     public DocuportBasePage(){
         PageFactory.initElements(Driver.getDriver(),this);
     }
}
