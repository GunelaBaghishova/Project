package io.loop.utilities;

import io.cucumber.java.Scenario;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;



public class BrowserUtils {

    public static void switchWindowAndValidate(WebDriver driver, String expectedUrl, String expectedTitle) {
        /**
         *
         */

        expectedUrl = expectedUrl.toLowerCase();
        expectedTitle = expectedTitle.toLowerCase();
        Set<String> windowHandles = driver.getWindowHandles();
        for (String each : windowHandles) {
            driver.switchTo().window(each);
            if (driver.getCurrentUrl().toLowerCase().contains(expectedUrl)) {
                break;
            }
        }
        Assert.assertTrue(driver.getTitle().toLowerCase().contains(expectedTitle));
    }

    /**
     * switches to a new window by the axact title
     * return to origin title if window with given title not found
     */
    public static void switchToWindow(WebDriver driver, String targetTitle) {
        String origin = driver.getWindowHandle();
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
            if (driver.getTitle().contains(targetTitle)) {
                return;
            }
        }
        driver.switchTo().window(origin);
    }

    /**
     * @param driver
     * @param expectedTitle return void, assertion is implemented
     */
    public static void validateTitle(WebDriver driver, String expectedTitle) {
        Assert.assertTrue(driver.getTitle().contains(expectedTitle));
    }


    /**
     * click any link from loop practice
     *
     * @param nameOfthePage
     * @author G.B.
     */
    public static void loopLinkClick(String nameOfthePage) {
        WebElement element = Driver.getDriver().findElement(By.xpath("//a[.='" + nameOfthePage + "']"));
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }

    /**
     * method that will hover over
     *
     * @param element
     */
    public static void hoverOver(WebElement element) {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(element).perform();
    }

    /**
     * method which scrolls to the given element
     * param element
     */
    public static void scrollToElement(WebElement element) {
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    /**
     * method which scrolls to element and click
     *
     * @param element
     */
    public static void scrollAndClick(WebElement element) {
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].click;", element);
    }

    /**
     * this method will double click any given element
     *
     * @param element
     */
    public static void doubleClick(WebElement element) {
        new Actions(Driver.getDriver()).doubleClick().perform();
    }

    /**
     * This method waits for the provided element to be visible
     *
     * @param element
     * @param timeToWaitInSec return element
     * @athour G.B
     */
    public static WebElement waitForVisibility(WebElement element, int timeToWaitInSec) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(timeToWaitInSec));
        return wait.until(ExpectedConditions.visibilityOf(element));
    }

    /**
     * This method waits for the provided element to be not visible
     * * @param element
     * * @param timeToWait
     * *
     * * @athour G.B
     */
    public static void waitForInvisibility(WebElement element, int timeToWaitInSec) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(timeToWaitInSec));
        wait.until(ExpectedConditions.invisibilityOf(element));
    }

    /**
     * This method that will wait until the element is clickable
     *
     * @param element
     * @param timeOut
     * @author G.B
     */
    public static WebElement waitForClickable(WebElement element, int timeOut) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(timeOut));
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }

/**
 * this method performs a pause
 * @param seconds
 */
public static void justWait(int seconds)  {
       try {
           Thread.sleep(seconds*1000);
       }catch(InterruptedException e){
           e.printStackTrace();
       }
}

    /**
     * Clicks on an element using JavaScript
     * @param element
     * @author nsh
     */
    public static void clickWithJS(WebElement element) {
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].click();", element);
    }

    public static Scenario myScenario;

    public static void takeScreenshot(){
        try {
            myScenario.log("Current url is: " + Driver.getDriver().getCurrentUrl());
            final byte[] screenshot = ((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            myScenario.attach(screenshot, "image/png", myScenario.getName());
        } catch (WebDriverException wbd){
            wbd.getMessage();
        } catch (ClassCastException cce){
            cce.getMessage();
        }
    }

    /**
     *
     * @param elements
     * @return
     */

    public static List<String> getElementsText(List<WebElement> elements){
        List <String> elementsText = new ArrayList<>();
        for (WebElement element : elements){
            elementsText.add(element.getText());
        }
        return elementsText;
    }

    public static List<String> getElementsTextWithStream (List<WebElement> elements){
        return elements.stream()
                .map(x->x.getText())
                .collect(Collectors.toList());
    }

    public static List<String> getElementsTextWithStream2 (List<WebElement> elements){
        return elements.stream()
                .map(WebElement::getText)
                .collect(Collectors.toList());
    }








}