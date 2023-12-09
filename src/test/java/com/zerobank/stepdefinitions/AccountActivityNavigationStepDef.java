package com.zerobank.stepdefinitions;

import com.zerobank.pages.AccountActivityPage;
import com.zerobank.pages.AccountSummaryPage;
import com.zerobank.pages.HomePage;
import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

public class AccountActivityNavigationStepDef {
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    AccountSummaryPage accountSummaryPage = new AccountSummaryPage();
    AccountActivityPage accountActivityPage = new AccountActivityPage();

    @Given("the user is logged in")
    public void the_user_is_logged_in() {
        loginPage.login();

    }
    @When("the user clicks on Savings link on the Account Summary page")
    public void the_user_clicks_on_savings_link_on_the_account_summary_page() {
        accountSummaryPage.SavingsBtn.click();

    }
    @Then("the Account Activity page should be displayed")
    public void the_account_activity_page_should_be_displayed() {
        accountActivityPage.accountActivityTab.isDisplayed();

    }
    @Then("Account drop down should have Savings selected")
    public void account_drop_down_should_have_savings_selected() {
        Select select = new Select(accountActivityPage.accountDropdown);

        String expectedOption = select.getFirstSelectedOption().getText();
        String actualOption = "Savings";
        Assert.assertEquals(expectedOption,actualOption);


    }


    @When("the user clicks on Brokerage link on the Account Summary page")
    public void theUserClicksOnBrokerageLinkOnTheAccountSummaryPage() {
        accountSummaryPage.BrokeageBtn.click();
    }

    @And("Account drop down should have Brokerage selected")
    public void accountDropDownShouldHaveBrokerageSelected() {
        Select select = new Select(accountActivityPage.AccountActivityPageAccountDropdown);

        String expectedOption = select.getFirstSelectedOption().getText();
        String actualOption = "Brokerage";
        Assert.assertEquals(expectedOption,actualOption);


    }

    @When("the user clicks on Checking link on the Account Summary page")
    public void theUserClicksOnCheckingLinkOnTheAccountSummaryPage() {
        accountSummaryPage.CheckingBtn.click();
    }

    @And("Account drop down should have Checking selected")
    public void accountDropDownShouldHaveCheckingSelected() {
        Select select = new Select(accountActivityPage.AccountActivityPageAccountDropdown);

        String expectedOption = select.getFirstSelectedOption().getText();
        String actualOption = "Checking";
        Assert.assertEquals(expectedOption,actualOption);


    }

    @When("the user clicks on Credit card link on the Account Summary page")
    public void theUserClicksOnCreditCardLinkOnTheAccountSummaryPage() {
        accountSummaryPage.CreditCardBtn.click();
    }

    @And("Account drop down should have Credit Card selected")
    public void accountDropDownShouldHaveCreditCardSelected() {
        Select select = new Select(accountActivityPage.AccountActivityPageAccountDropdown);

        String expectedOption = select.getFirstSelectedOption().getText();
        String actualOption = "Credit Card";
        Assert.assertEquals(expectedOption,actualOption);

    }

    @When("the user clicks on Loan link on the Account Summary page")
    public void theUserClicksOnLoanLinkOnTheAccountSummaryPage() {
        accountSummaryPage.LoanBtn.click();
    }

    @And("Account drop down should have Loan selected")
    public void accountDropDownShouldHaveLoanSelected() {
        Select select = new Select(accountActivityPage.AccountActivityPageAccountDropdown);

        String expectedOption = select.getFirstSelectedOption().getText();
        String actualOption = "Loan";
        Assert.assertEquals(expectedOption,actualOption);
        Driver.getDriver().close();
    }
}
