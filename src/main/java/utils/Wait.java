package utils;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import dataProvider.FileReaderManager;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Wait {

    public static void untilJqueryIsDone(WebDriver driver){
        untilJqueryIsDone(driver, FileReaderManager.getInstance().getConfigReader().getImplicitlyWait());
    }

    public static void untilJqueryIsDone(WebDriver driver, Long timeoutInSeconds){
        until(driver, (d) ->
        {
            Boolean isJqueryCallDone = (Boolean)((JavascriptExecutor) driver).executeScript("return jQuery.active==0");
            if (!isJqueryCallDone) System.out.println("JQuery call is in Progress");
            return isJqueryCallDone;
        }, timeoutInSeconds);
    }

    public static void untilPageLoadComplete(WebDriver driver) {
        untilPageLoadComplete(driver, FileReaderManager.getInstance().getConfigReader().getImplicitlyWait());
    }

    public static void untilPageLoadComplete(WebDriver driver, Long timeoutInSeconds){
        until(driver, (d) ->
        {
            Boolean isPageLoaded = (Boolean)((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");
            if (!isPageLoaded) System.out.println("Document is loading");
            return isPageLoaded;
        }, timeoutInSeconds);
    }

    public static void until(WebDriver driver, Function<WebDriver, Boolean> waitCondition){
        until(driver, waitCondition, FileReaderManager.getInstance().getConfigReader().getImplicitlyWait());
    }


    private static void until(WebDriver driver, Function<WebDriver, Boolean> waitCondition, Long timeoutInSeconds){
        WebDriverWait webDriverWait = new WebDriverWait(driver, timeoutInSeconds);
        try{
            webDriverWait.until(waitCondition);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void untilStaleElementDone(WebDriver driver, Long timeoutInSeconds, By by) {
        until(driver, (d) ->
        {
            try {
                driver.findElement(by);
                return true;
            } catch (StaleElementReferenceException e) {
                return false;
            }

        }, timeoutInSeconds);
    }


    public static void untilStaleElementDone(WebDriver driver, By by){
        untilStaleElementDone(driver,FileReaderManager.getInstance().getConfigReader().getImplicitlyWait(),by);
    }

    public static void waitForElementToAppear(WebDriver driver, By by) {
      until(driver,(Function)ExpectedConditions.visibilityOfElementLocated(by));
    }

    public static void waitForElementToAppear(WebDriver driver, WebElement element) {
        until(driver,(Function)ExpectedConditions.visibilityOf(element));
    }

    public static void waitForElementToDisappear(WebDriver driver, By locator) {
        until(driver,(Function)ExpectedConditions.invisibilityOfElementLocated(locator));
    }

    public static void waitForElementToDisappear(WebDriver driver, WebElement element) {
        until(driver,(Function)ExpectedConditions.invisibilityOf(element));
    }

    public static void waitForText(WebDriver driver, By by, String text) {
        until(driver,(Function)ExpectedConditions.textToBePresentInElementLocated(by, text));
    }

    public static void waitForText(WebDriver driver, WebElement element, String text) {
        until(driver,(Function)ExpectedConditions.textToBePresentInElement(element,text));
    }
};
