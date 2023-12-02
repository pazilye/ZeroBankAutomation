package com.zerobank.stepdefinitions;

import com.zerobank.pages.AccountSummaryPage;
import com.zerobank.pages.HomePage;
import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AccountSumStepDef {
    HomePage homePage = new HomePage();
    AccountSummaryPage accountSummaryPage = new AccountSummaryPage();
    LoginPage loginPage= new LoginPage();

    @When("user clicks on the Online Banking option")
    public void user_clicks_on_the_online_banking_option() {
        homePage.OnlineBankingButton.click();


    }
    @When("user clicks on the Account Summary")
    public void user_clicks_on_the_account_summary() {
        homePage.AccountSummaryOption.click();



    }
    @When("user is on the Account Summary page")
    public void user_is_on_the_account_summary_page() {
        Assert.assertTrue(accountSummaryPage.AccountSummaryTab.isDisplayed());

    }
    @Then("user should see the following list of Accounts")
    public void user_should_see_the_following_list_of_accounts(io.cucumber.datatable.DataTable listOfAccounts) {

        Assert.assertTrue(accountSummaryPage.ListOfAccounts.isDisplayed());


    }

    @And("user should see the following columns under the Credit Accounts")
    public void user_should_see_the_following_columns_under_the_credit_accounts(io.cucumber.datatable.DataTable columns) {
        Assert.assertTrue(accountSummaryPage.ColumnNames.isDisplayed());
        Driver.getDriver().close();


    }


}
