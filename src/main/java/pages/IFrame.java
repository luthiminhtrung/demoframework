package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class IFrame extends BasePage{

    private EventFiringWebDriver driver;
    public IFrame(EventFiringWebDriver driver) {
        super(driver);
        this.driver=driver;
    }

    @FindBy(id="mce_0_ifr")
    public WebElement iframe;

    @FindBy(id="tinymce")
    public WebElement body;

    public void setTextToBody(String text){
        this.switchTo(iframe);
        this.clearText(body);
        body.sendKeys(text);
    }

}
