package com.zerobank.stepdefinitions;

import com.zerobank.pages.HomePage;
import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginPageStepDef {

    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("loginPage"));
    }
    @When("user enters username and password")
    public void user_enters_username_and_password() {
        loginPage.LoginInput.sendKeys(ConfigurationReader.getProperty("UserName"));
        loginPage.PasswordInput.sendKeys(ConfigurationReader.getProperty("Password"));
    }


    @Then("user should see Settings button on the top right corner")
    public void userShouldSeeSettingsButtonOnTheTopRightCorner() {


        Assert.assertTrue(homePage.SettingsButton.isDisplayed());
        Driver.closeDriver();
    }

    @When("user enters invalid credentials {string} and {string}")
    public void user_enters_invalid_credentials_and(String Username, String Password) {
        loginPage.LoginInput.sendKeys(Username);
        loginPage.PasswordInput.sendKeys(Password);
        BrowserUtils.waitFor(3);


    }
    @Then("user should see error message {string}")
    public void user_should_see_error_message(String message) {
        String expectedMsg = loginPage.ErrorMsg.getText();
        String actualMsg =  message;
        Assert.assertEquals(expectedMsg,actualMsg);
        Driver.closeDriver();


    }

    @And("user clicks on sign in button")
    public void userClicksOnSignInButton() {
        loginPage.SigninButton.click();
        BrowserUtils.waitFor(3);
        Driver.getDriver().navigate().back();

    }


    @When("user is on the home page")
    public void userIsOnTheHomePage() {
        homePage.homeButton.isDisplayed();



    }
}

