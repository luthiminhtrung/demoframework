package cucumber.stepsDefinition;//import base.BaseTest;
//import io.cucumber.datatable.DataTable;
//import io.cucumber.java.After;
//import io.cucumber.java.Before;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import listener.EventListener;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.events.EventFiringWebDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.Assert;
//import pages.HomePage;
//import pages.LoginPage;
//import pages.SecureAreaPage;


import base.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import pages.HomePage;
import pages.LoginPage;
import pages.SecureAreaPage;

//import static org.junit.Assert.assertTrue;

public class HomePageSteps {
    private BaseTest baseTest;
    EventFiringWebDriver driver;
    HomePage homePage;
    LoginPage loginPage;
    SecureAreaPage secureAreaPage;


    public HomePageSteps (BaseTest base){
    	this.baseTest = base;
    	homePage=baseTest.getBasePage().getHomePage();
    	loginPage=baseTest.getBasePage().getLoginPage();
    	secureAreaPage=baseTest.getBasePage().getSecureAreaPage();

	}

	@Given("I am in the login page")
	@Given("I am in the login page of the Para Bank Application")
	public void i_am_in_the_login_page_of_the_Para_Bank_Application() {
		System.out.println("I am home page");
		baseTest.setContext("productID", "123");

	}




	@Then("I should be taken to the Overview page. {string}")
	public void i_should_be_taken_to_the_Overview_page(String userName) throws Exception {
    	System.out.println("Alert text: " + secureAreaPage.getAlertText());
    	//Assert.assertEquals(secureAreaPage.getAlertText(),userName);
	}





	@And("I click on Authenticate link")
	public void iClickOnAuthenticateLink() {
    	homePage.clickFormAuthentication();
	}
}
