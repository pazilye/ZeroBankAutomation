package com.zerobank.stepdefinitions;

import com.github.javafaker.Faker;
import com.zerobank.pages.HomePage;
import com.zerobank.pages.LoginPage;
import com.zerobank.pages.PayBillsPage;
import com.zerobank.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

public class PayBillsStepDef {
    LoginPage  loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    PayBillsPage payBillsPage = new PayBillsPage();
    Faker faker = new Faker();

    @When("user clicks on the Pay Bills option")
    public void user_clicks_on_the_pay_bills_option() {
        homePage.PayBillsOption.click();

    }


    @Then("user should see the success message")
    public void userShouldSeeTheSuccessMessage() {
        payBillsPage.PayBtn.click();
        Assert.assertTrue(payBillsPage.SuccessMsg.isDisplayed());
    }

    @When("user enters chooses {string} from Payee dropdown")
    public void userEntersChoosesFromPayeeDropdown(String option) {

        Select select = new Select(payBillsPage.payeeDropDown);
        BrowserUtils.waitFor(3);
        select.selectByVisibleText(option);

    }

    @And("user chooses one {string} in the Account dropdown")
    public void userChoosesOneInTheAccountDropdown(String option) {
        Select select = new Select(payBillsPage.accountDropDown);
        BrowserUtils.waitFor(2);
        select.selectByVisibleText(option);
    }

    @And("user enters amount {string}")
    public void userEntersAmount(String amount) {
        payBillsPage.AmountInput.sendKeys(amount);
    }

    @And("user enters date {string}")
    public void userEntersDate(String date) {
        payBillsPage.DateInput.sendKeys(date);
    }

    @When("user fill out the Description input and clicks on the Pay button")
    public void userFillOutTheDescriptionInputAndClicksOnThePayButton() {
        payBillsPage.DescriptionInput.sendKeys(faker.lorem().sentence());

    }
}
