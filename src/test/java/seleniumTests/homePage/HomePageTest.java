package seleniumTests.homePage;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class HomePageTest extends BaseTest {

    String userName = "tomsmith";
    String password = "SuperSecretPassword!";
    String text = "You logged into a secure area!\n" +
            "×";
    String textToSet="Trung test";

    @Test
    public void testFormAuthentication() {
        HomePage homePage = basePage.getHomePage();
        LoginPage loginPage = homePage.clickFormAuthentication();
        SecureAreaPage secureAreaPage = loginPage.inputCriteria(userName, password);
        Assert.assertEquals(secureAreaPage.getAlertText(), text);

    }


    @Test
    public void testFrames() {
        HomePage homePage = basePage.getHomePage();
        FramesPage framesPage = homePage.clickFrame();
        IFrame iFramesPage =framesPage.clickiFrame();
        iFramesPage.setTextToBody(textToSet);

    }
}
