package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class SecureAreaPage extends BasePage {

    private EventFiringWebDriver driver;
    public SecureAreaPage(EventFiringWebDriver driver) {
        super(driver);
        this.driver =driver;
    }


    @FindBy (id="flash")
    WebElement statusAlert;


    public String getAlertText(){
        return statusAlert.getText();
    }
}
