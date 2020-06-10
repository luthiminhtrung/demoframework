package webdriver;

import org.openqa.selenium.support.events.EventFiringWebDriver;

import static webdriver.DriverManagerFactory.environmentType;

public abstract class DriverManager {
    protected EventFiringWebDriver driver;
    protected abstract void createLocalDriver();
    protected abstract void createRemoteDriver();

    public EventFiringWebDriver getDriver(){
        if (driver == null){
            createDriver();
        }
        return driver;
    }

    public void quitDriver(){
        if (driver != null){
            driver.quit();
            driver = null;
        }
    }

    public void createDriver() {
        switch (environmentType) {
            case LOCAL:
                createLocalDriver();
                break;
            case REMOTE :
                createRemoteDriver();
                break;
        }
        driver.manage().window().maximize();
    }
}
