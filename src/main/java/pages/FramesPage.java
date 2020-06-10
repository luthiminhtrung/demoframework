package pages;

import dataProvider.FileReaderManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class FramesPage extends BasePage {
    public FramesPage(EventFiringWebDriver driver) {
        super(driver);
    }

    public void clickNestedFrame() {
        clickLink("Nested Frame");
    }

    public IFrame clickiFrame() {
        clickLink("iFrame");
        return this.getIFramesPage();
    }


}