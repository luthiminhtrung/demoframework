package webdriver;

import dataProvider.FileReaderManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class ChromeDriverManger extends DriverManager {

    @Override
    protected void createLocalDriver() {
        System.setProperty("webdriver.chrome.driver", FileReaderManager.getInstance().getConfigReader().getDriverPath() + "chromedriver");
        driver = new EventFiringWebDriver(new ChromeDriver(getChromeOptions()));
    }
    @Override
    protected void createRemoteDriver() {
        throw new RuntimeException("RemoteWebDriver is not yet implemented");
    }

    public ChromeOptions getChromeOptions() {
        ChromeOptions options = new ChromeOptions();
        ///set attribute for browser here if needed
        return options;
    }

    public void setChromeOptions() {
        ChromeOptions options = new ChromeOptions();
        ///set attribute for browser here if needed
    }
}
