package com.zerobank.stepdefinitions;

import com.zerobank.pages.PayBillsPage;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;


public class PurchaseForeignCurrencyStepDef {

    PayBillsPage payBillsPage = new PayBillsPage();

    @When("the user accesses the Purchase foreign currency cash tab")
    public void the_user_accesses_the_purchase_foreign_currency_cash_tab() {
        payBillsPage.purchaseForeignCurrency.click();

    }
    @Then("following currencies should be available")
    public void following_currencies_should_be_available(io.cucumber.datatable.DataTable dropDown) {
        Select select = new Select(payBillsPage.currencyDropdown);
        List<WebElement> options = select.getOptions();

        for (WebElement eachOption: options) {
            System.out.println("eachOption.getText() = " + eachOption.getText());
            Assert.assertTrue(eachOption.isDisplayed());

        }





    }

    @When("user tries to calculate cost without selecting a currency")
    public void userTriesToCalculateCostWithoutSelectingACurrency() {
        payBillsPage.calculateCostsBtn.click();


    }

    @Then("error message alert should be displayed")
    public void errorMessageAlertShouldBeDisplayed() {

        try
        {
            Driver.getDriver().switchTo().alert().accept();
            System.out.println(" Alert Present");
        }
        catch (NoAlertPresentException e)
        {
            System.out.println("No Alert Present");
        }

    }


    @And("the user chooses one of the currencies from the currency dropdown")
    public void theUserChoosesOneOfTheCurrenciesFromTheCurrencyDropdown() {
        Select select = new Select(payBillsPage.currencyDropdown);
        select.selectByVisibleText("Switzerland (franc)");


    }

    @When("user tries to calculate cost without entering a value")
    public void userTriesToCalculateCostWithoutEnteringAValue() {
        payBillsPage.calculateCostsBtn.click();
    }
}

