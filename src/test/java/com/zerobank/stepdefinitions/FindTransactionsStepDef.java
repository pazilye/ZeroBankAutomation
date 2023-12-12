package com.zerobank.stepdefinitions;

import com.zerobank.pages.AccountActivityPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;


public class FindTransactionsStepDef {

    AccountActivityPage accountActivityPage = new AccountActivityPage();


    @When("the user accesses the Find Transactions tab")
    public void the_user_accesses_the_find_transactions_tab() {
        accountActivityPage.FindTransactionsTab.click();

    }
    @When("clicks find")
    public void clicks_find() {
        accountActivityPage.findBtn.click();

    }


    @And("the user enters description as {string}")
    public void theUserEntersDescriptionAs(String ONLINE) {
        accountActivityPage.descriptionInput.sendKeys(ONLINE);

    }

    @Then("results table should only show descriptions containing {string}")
    public void resultsTableShouldOnlyShowDescriptionsContaining(String ONLINE) {
       String actualInput= accountActivityPage.tableBodyRowONLINE.getText();
        Assert.assertTrue(actualInput.contains(ONLINE));


    }

    @When("the user enters description {string}")
    public void theUserEntersDescription(String OFFICE) {
        accountActivityPage.descriptionInput.clear();
        accountActivityPage.descriptionInput.sendKeys(OFFICE);
        BrowserUtils.waitFor(2);
    }

    @Then("results table should only show descriptions containing input {string}")
    public void resultsTableShouldOnlyShowDescriptionsContainingInput(String OFFICE) {
        String actualInput = accountActivityPage.tableBodyRowOFFICE.getText();
        System.out.println(actualInput.contains(OFFICE));

    }

    @When("the user enters description in lower-case {string}")
    public void theUserEntersDescriptionInLowerCase(String online) {
        accountActivityPage.descriptionInput.clear();
        BrowserUtils.waitFor(2);
        accountActivityPage.descriptionInput.sendKeys(online);
    }

    @Then("results table should also show descriptions containing {string}")
    public void resultsTableShouldAlsoShowDescriptionsContaining(String ONLINE) {
        String expectedInputContained = ONLINE;
        String actualInputContained = accountActivityPage.noResultsMsg.getText();
        Assert.assertFalse(actualInputContained.contains(expectedInputContained));
        System.out.println("actualInputContained = " + actualInputContained);
        Driver.getDriver().close();

    }


    @Then("results table should show at least one result under Deposit")
    public void resultsTableShouldShowAtLeastOneResultUnderDeposit() {
        System.out.println("accountActivityPage.depositColumn.getText() = " + accountActivityPage.depositColumn.getText());
       Assert.assertTrue(accountActivityPage.depositColumn.isDisplayed());

    }

    @Then("results table should show at least one result under Withdrawal")
    public void results_table_should_show_at_least_one_result_under_withdrawal() {
        System.out.println("accountActivityPage.withdrawalColumn.getText() = " + accountActivityPage.withdrawalColumn.getText());
        Assert.assertTrue(accountActivityPage.withdrawalColumn.isDisplayed());


    }


    @Then("results table should show no result under Deposit")
    public void results_table_should_show_no_result_under_deposit() {
        Assert.assertTrue(accountActivityPage.depositColumn.isDisplayed());

    }



    @When("user selects type withdrawal {string}")
    public void userSelectsTypeWithdrawal(String Withdrawal) {
        Select select = new Select(accountActivityPage.typeDropdown);
        BrowserUtils.waitFor(2);
        select.selectByVisibleText(Withdrawal);
        accountActivityPage.findBtn.click();

    }

    @When("user selects type {string} and clicks find")
    public void userSelectsTypeAndClicksFind(String Deposit) {
        Select select = new Select(accountActivityPage.typeDropdown);
        select.selectByVisibleText(Deposit);
        accountActivityPage.findBtn.click();
    }
}
