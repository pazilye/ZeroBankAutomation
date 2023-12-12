package com.zerobank.stepdefinitions;

import com.zerobank.pages.PayBillsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AddNewPayeeStepDef {

    PayBillsPage payBillsPage = new PayBillsPage();

    @When("user clicks on the Add New Payee Tab to add new payment")
    public void user_clicks_on_the_add_new_payee_tab_to_add_new_payment() {
        payBillsPage.addNewPayeeTab.click();

    }



    @Then("the user should see the success message")
    public void the_user_should_see_the_success_message() {
        Assert.assertTrue(payBillsPage.paymentAddedSuccessMsg.isDisplayed());

    }


    @And("user enters new payee in the {string} input")
    public void userEntersNewPayeeInTheInput(String payeeName) {
        payBillsPage.payeeNameInput.sendKeys(payeeName);
    }

    @And("user enters address in the {string} input")
    public void userEntersAddressInTheInput(String payeeAddress) {
        payBillsPage.payeeAddressInput.sendKeys(payeeAddress);
    }

    @And("user enters account type in the {string} input")
    public void userEntersAccountTypeInTheInput(String account) {
        payBillsPage.accountInput.sendKeys(account);
    }

    @And("user enters the details in the {string} input")
    public void userEntersTheDetailsInTheInput(String payeeDetails) {
        payBillsPage.payeeDetailsInput.sendKeys(payeeDetails);
    }

    @When("user clicks on Add button")
    public void userClicksOnAddButton() {
        payBillsPage.addBtn.click();
    }
}
