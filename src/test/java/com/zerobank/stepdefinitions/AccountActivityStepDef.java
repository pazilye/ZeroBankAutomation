package com.zerobank.stepdefinitions;
import com.zerobank.pages.AccountActivityPage;
import com.zerobank.pages.HomePage;
import com.zerobank.pages.LoginPage;

import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;


public class AccountActivityStepDef {
    LoginPage loginPage= new LoginPage();
    HomePage homePage = new HomePage();
    AccountActivityPage accountActivityPage= new AccountActivityPage();




    @Given("user is logged in and on the home page")
    public void userIsLoggedInAndOnTheHomePage() {
        loginPage.login();
        BrowserUtils.waitFor(3);
    }

    @And("user clicks on the Account Activity")
    public void userClicksOnTheAccountActivity() {
        homePage.AccountActivityOption.click();

    }

    @Then("user should be on the Account Activity page")
    public void user_should_be_on_the_account_activity_page() {
        accountActivityPage.accountActivityTab.isDisplayed();


    }
    @Then("user should see {string} as a default option on account dropdown")
    public void user_should_see_as_a_default_option_on_account_dropdown(String Savings) {
        Select select = new Select(accountActivityPage.accountDropdown);

        String expectedOption = select.getFirstSelectedOption().getText();
        Assert.assertEquals(expectedOption,Savings);



    }

    @And("the dropdown should have all the options visible")
    public void theDropdownShouldHaveAllTheOptionsVisible() {
        Select select = new Select(accountActivityPage.accountDropdown);

        List<WebElement> options = select.getOptions();
        for (WebElement eachOption : options) {
            System.out.println(eachOption.getText());


        }
    }
    @Then("the transactions table should have column names as listed")
    public void the_transactions_table_should_have_column_names_as_listed(io.cucumber.datatable.DataTable ColumnNames) {
        Assert.assertTrue(accountActivityPage.accountTableColumnNames.isDisplayed());
        Driver.closeDriver();


    }



}
