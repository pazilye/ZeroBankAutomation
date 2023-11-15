package com.zerobank.stepdefinitions;

import com.zerobank.pages.HomePage;
import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
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
    }
    @When("user enters clicks on sign in button")
    public void user_enters_clicks_on_sign_in_button() {
        loginPage.PasswordInput.sendKeys(ConfigurationReader.getProperty("Password"));
    }


    @Then("user should see Settings button on the top right corner")
    public void userShouldSeeSettingsButtonOnTheTopRightCorner() {
        loginPage.SigninButton.click();
        BrowserUtils.waitFor(3);
        Driver.getDriver().navigate().back();

        Assert.assertTrue(homePage.SettingsButton.isDisplayed());
        Driver.closeDriver();



    }
}

