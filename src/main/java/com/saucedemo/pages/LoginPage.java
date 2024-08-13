package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Hiral Yagnik
 * Project Name: Saucedemo
 */
public class LoginPage extends Utility {
@FindBy(xpath = "//input[@id='user-name']")
WebElement username;
@FindBy(xpath = "//input[@id='password']")
    WebElement password;
@FindBy(xpath = "//input[@id ='login-button']")
    WebElement loginButton;

    private static final Logger log = LogManager.getLogger(LoginPage.class);

    public void enterUsername(String email) {
        log.info("Enter email " + email + " to email field " + username.toString());
        sendTextToElement(username, email);
    }
    public void enterPassword(String pass) {
        log.info(("Enter password " + pass + " to password field " + password.toString()));
        sendTextToElement(password, pass);
    }
    public void clickOnLoginButton() {
        log.info("Click on login button " + loginButton.toString());
        clickOnElement(loginButton);
    }
}
