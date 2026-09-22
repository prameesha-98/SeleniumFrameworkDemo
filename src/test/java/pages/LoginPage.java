package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;

    // Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    By usernameBox = By.id("user-name");
    By passwordBox = By.id("password");
    By loginBtn = By.id("login-button");

    // Actions
    public void enterUsername(String user) {
        driver.findElement(usernameBox).sendKeys(user);
    }

    public void enterPassword(String pass) {
        driver.findElement(passwordBox).sendKeys(pass);
    }

    public void clickLogin() {
        driver.findElement(loginBtn).click();
    }
}