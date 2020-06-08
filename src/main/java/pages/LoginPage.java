package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class LoginPage extends BasePage {
    public LoginPage(EventFiringWebDriver driver) {
        super(driver);
    }

    @FindBy(id="username")
    WebElement emailField;

    @FindBy(id="password")
    WebElement passwordField;

    @FindBy(css="#login button")
    WebElement loginButton;


    public void setEmail(String username){
        emailField.sendKeys(username);
    }


    public void setPassword(String password){
        passwordField.sendKeys(password);
    }

    public void clickLoginButton(){
        loginButton.click();
    }

    public void inputCriteria(String username, String password){
        emailField.sendKeys(username);
        passwordField.sendKeys(password);
        loginButton.click();
    }

}
