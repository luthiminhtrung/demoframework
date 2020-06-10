package base;

import com.google.common.io.Files;
import dataProvider.FileReaderManager;
import listener.EventListener;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;
import pages.BasePage;
import pages.HomePage;
import webdriver.DriverManager;
import webdriver.DriverManagerFactory;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class BaseTest {

    public EventFiringWebDriver driver;
    public DriverManager driverManager;
    public BasePage basePage;
    public Map scenarioContext;
    public BaseTest baseTest;


    @BeforeTest
    public void setUp(){
        driverManager = (new DriverManagerFactory()).getDriverManger();
        driver = driverManager.getDriver();
        driver.register(new EventListener());
        basePage = new BasePage(driver);
        scenarioContext = new HashMap();
        driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl());
    }

    @BeforeMethod
    public void setUpBeforeMethod(){
        basePage.getHomePage().goToHomePage();
    }

    public EventFiringWebDriver getDriver(){
        return driver;
    }



    @AfterTest
    public void TearDown(){
        if (driver !=null){
            driver.quit();
        }

    }

//    @AfterMethod
//    public void recordFailure(ITestResult result) {
//        if (ITestResult.FAILURE == result.getStatus()) {
//            var camera = (TakesScreenshot) driver;
//            File screenshot = camera.getScreenshotAs(OutputType.FILE);
//            try {
//                Files.move(screenshot, new File("resources/screenshots/" + result.getName() + ".png"));
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//    }

    public void setContext (String key, Object object){
        scenarioContext.put(key,object);
    }


    public Object getContext (String key){
        return scenarioContext.get(key);
    }
}
