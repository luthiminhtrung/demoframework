package base;

import com.google.common.io.Files;
import dataProvider.FileReaderManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import listener.EventListener;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import pages.BasePage;
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

    public void BaseTest(){
        driverManager = (new DriverManagerFactory()).getDriverManger();
        driver = driverManager.getDriver();
        driver.register(new EventListener());
        basePage = new BasePage(driver);
        scenarioContext = new HashMap();
    }


    @Before
    @BeforeSuite
    public void setUp(){
        driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl());
    }

    public EventFiringWebDriver getDriver(){
        return driver;
    }

    public BasePage getBasePage(){
        return basePage;
    }


    @AfterTest
    @After
    public void TearDown(){
        driver.close();
        driver.quit();
    }

    @AfterMethod
    public void recordFailure(ITestResult result) {
        if (ITestResult.FAILURE == result.getStatus()) {
            var camera = (TakesScreenshot) driver;
            File screenshot = camera.getScreenshotAs(OutputType.FILE);
            try {
                Files.move(screenshot, new File("resources/screenshots/" + result.getName() + ".png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void setContext (String key, Object object){
        scenarioContext.put(key,object);
    }


    public Object getContext (String key){
        return scenarioContext.get(key);
    }
}
