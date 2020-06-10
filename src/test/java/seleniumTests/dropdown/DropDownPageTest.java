package seleniumTests.dropdown;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.DropDownPage;
import pages.HomePage;

public class DropDownPageTest extends BaseTest {

    String valueDropDown="Option 1";
    @Test
    public void selectDropdown(){
        HomePage homePage = basePage.getHomePage();
        DropDownPage dropDownPage = homePage.clickDropDownLink();
        dropDownPage.selectDropDownByVisibleText(dropDownPage.dropDownElement,valueDropDown);

    }
}
