package webdriver;

import dataProvider.FileReaderManager;
import listener.EventListener;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class FireFoxDriverManger extends DriverManager {
    @Override
    protected void createLocalDriver() {
        System.setProperty("webdriver.gecko.driver", FileReaderManager.getInstance().getConfigReader().getDriverPath() + "geckodriver");
        driver = new EventFiringWebDriver(new FirefoxDriver());
        driver.register(new EventListener());
    }

    @Override
    protected void createRemoteDriver() {


    }
}
