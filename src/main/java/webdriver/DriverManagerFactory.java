package webdriver;


import dataProvider.FileReaderManager;
import enums.DriverType;
import enums.EnvironmentType;
import org.openqa.selenium.WebDriver;


public class DriverManagerFactory {
    protected WebDriver driver;
    protected static DriverType driverType;
    protected static EnvironmentType environmentType;
    protected static final String CHROME_DRIVER_PROPERTY = "webdriver.chrome.driver";

    public DriverManagerFactory() {
        driverType = FileReaderManager.getInstance().getConfigReader().getBrowser();
        System.out.println("driverType=: " + this.driverType);
        environmentType = FileReaderManager.getInstance().getConfigReader().getEnvironment();
    }

    public static DriverManager getDriverManger(){
         DriverManager driverManager;
        System.out.println(FileReaderManager.getInstance().getConfigReader().getBrowser());
         switch (driverType) {
            case CHROME:
                driverManager = new ChromeDriverManger();
                break;

            default:
                driverManager = new FireFoxDriverManger();
                break;
        }
         return driverManager;
     }
}
