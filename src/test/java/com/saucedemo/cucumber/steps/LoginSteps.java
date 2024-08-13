package com.saucedemo.cucumber.steps;

import com.saucedemo.pages.LoginPage;
import com.saucedemo.pages.ProductsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

/**
 * Created by Hiral Yagnik
 * Project Name: Saucedemo
 */
public class LoginSteps {
    @Given("I am on Homepage")
    public void iAmOnHomepage() {
        System.out.println("Given condition - I am on Homepage");

    }
    @And("I enter password{string}")
    public void iEnterPassword(String arg0, String arg1) {
    }

    @And("I click on Login button")
    public void iClickOnLoginButton() {
        new LoginPage().clickOnLoginButton();
    }

    @Then("Verify the text {string}")
    public void verifyTheText(String expectedTitle) {
    Assert.assertEquals(expectedTitle,new ProductsPage().getPageHeading());
    }

    @And("{string} are displayed on page")
    public void areDisplayedOnPage(String expectedNumberOfProducts) {
        Assert.assertEquals(expectedNumberOfProducts,new ProductsPage().getProductsPerPage());
    }


    @When("I enter username {string}")
    public void iEnterUsername(String username) {
    new LoginPage().enterUsername(username);
    }

    @And("I enter password {string}")
    public void iEnterPassword(String password) {
        new LoginPage().enterPassword(password);
    }
}
