package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.Select;
import utils.Wait;

public class BasePage {
    private static final int TIMEOUT = 5;
    private static final int POLLING = 100;

    protected EventFiringWebDriver driver;
    private HomePage homePage;
    private LoginPage loginPage;
    private SecureAreaPage secureAreaPage;
    private FramesPage framesPage;
    private IFrame iFrame;
    private DropDownPage dropDownPage;



    public BasePage(EventFiringWebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public FramesPage getFramesPage() {
        return (framesPage==null) ? framesPage = new FramesPage(driver) : framesPage;

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

    public IFrame getIFramesPage() {
        return (iFrame==null) ? iFrame = new IFrame(driver) : iFrame;

    }
    public void switchTo(WebElement element){
        driver.switchTo().frame(element);

    }

    public void setText(WebElement element, String text){
        element.sendKeys(text);
    }

    public void clearText(WebElement element){
        element.clear();
    }

    protected DropDownPage getDropDownPage() {
        return (dropDownPage==null) ? dropDownPage = new DropDownPage(driver) : dropDownPage;
    }

    public void selectDropDown(WebElement element, String value){
        element.click();
        getSelectObject(element).selectByValue(value);


    }

    public void selectDropDown(WebElement element, int index){
        element.click();
        getSelectObject(element).selectByIndex(index);


    }

    public void selectDropDownByVisibleText(WebElement element, String text){
        element.click();
        getSelectObject(element).selectByVisibleText(text);


    }

    public Select getSelectObject(WebElement element){
        return new Select(element);
    }
}
