package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Wait;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class BasePage {
    private static final int TIMEOUT = 5;
    private static final int POLLING = 100;

    protected EventFiringWebDriver driver;
    private HomePage homePage;
    private LoginPage loginPage;
    private SecureAreaPage secureAreaPage;


    public BasePage(EventFiringWebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public HomePage getHomePage(){
        return (homePage == null) ? homePage = new HomePage(driver) : homePage;
    }

    public void clickLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }


    /**
     * Use this function to click on the element in case we meet the error StaleElementReferenceException when clicking an element. If we reference to a object in old page,
     * we will meet this error when the page has been refreshed
     * @param by
     */
    public void clickElement(By by){
        try{
            driver.findElement(by).click();
        }
        catch (StaleElementReferenceException e) {
            Wait.untilStaleElementDone(driver,by);
        }
    }

    public LoginPage getLoginPage() {
        return (loginPage==null) ? loginPage = new LoginPage(driver) : loginPage;
    }

    public SecureAreaPage getSecureAreaPage() {
        return (secureAreaPage==null) ? secureAreaPage = new SecureAreaPage(driver) : secureAreaPage;
    }
}
