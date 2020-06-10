package webdriver;

import dataProvider.FileReaderManager;
import listener.EventListener;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class SafariDriverManger extends DriverManager {
    @Override
    protected void createLocalDriver() {
        driver = new EventFiringWebDriver(new SafariDriver());
        driver.register(new EventListener());
    }

    @Override
    protected void createRemoteDriver() {


    }
}
