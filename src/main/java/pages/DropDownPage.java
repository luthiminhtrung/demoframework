package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class DropDownPage extends BasePage{

    @FindBy(id="dropdown")
    public WebElement dropDownElement;

    public DropDownPage(EventFiringWebDriver driver) {
        super(driver);
    }

}
