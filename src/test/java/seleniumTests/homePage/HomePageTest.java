package seleniumTests.homePage;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.SecureAreaPage;

public class HomePageTest extends BaseTest {
    HomePage homePage = basePage.getHomePage();
    LoginPage loginPage = basePage.getLoginPage();
    SecureAreaPage secureAreaPage = basePage.getSecureAreaPage();
    String userName = "tomsmith";
    String password ="SuperSecretPassword";
    String text = "You logged into a secure area!";

    @Test
    public void testFormAuthentication(){
        homePage.clickFormAuthentication();
        loginPage.inputCriteria(userName,password);
        Assert.assertEquals(secureAreaPage.getAlertText(),text);

    }

}
