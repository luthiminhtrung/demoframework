package webdriver;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class FireFoxDriverManger extends DriverManager {
    @Override
    protected void createLocalDriver() {
//        driver = new EventFiringWebDriver(FireFox());
//
//        FirefoxOptions options = new FirefoxOptions()
//                .setProfile(new FirefoxProfile());
//        WebDriver driver = new FirefoxDriver(options);
        // System Property for Gecko Driver
//        System.setProperty("webdriver.gecko.driver","D:\\GeckoDriver\\geckodriver.exe" );
//
//        // Initialize Gecko Driver using Desired Capabilities Class
//        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
//        capabilities.setCapability("marionette",true);
//        driver= new FirefoxDriver(capabilities);
    }

    @Override
    protected void createRemoteDriver() {


    }
}
