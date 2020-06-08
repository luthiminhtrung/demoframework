package cucumber.stepsDefinition;//import cucumber.base.BaseTest;
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


import cucumber.base.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.Assert;
import pages.HomePage;
import pages.LoginPage;
import pages.SecureAreaPage;

//import static org.junit.Assert.assertTrue;

public class LoginPageSteps {
	private BaseTest baseTest;
	EventFiringWebDriver driver;
	LoginPage loginPage;


	public LoginPageSteps(BaseTest base) {
		this.baseTest = base;
		loginPage = baseTest.getBasePage().getLoginPage();

	}

	@When("I enter valid {string} and {string}")
	public void i_enter_valid_credentials_(String username, String password) {
		loginPage.setEmail(username);
		loginPage.setPassword(password);
		loginPage.clickLoginButton();

		///example for getting the test context (the data from previous steps)
		System.out.print("The value of set variable name productID is: "+ baseTest.getContext("productID").toString());

	}
}