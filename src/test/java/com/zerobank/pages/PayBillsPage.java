package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PayBillsPage {
    public PayBillsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//select[@id='sp_payee']")
    public WebElement payeeDropDown;

    @FindBy(xpath = "//select[@id='sp_account']")
    public WebElement accountDropDown;

    @FindBy(xpath = "//input[@id='sp_amount']")
    public WebElement AmountInput;

    @FindBy(xpath = "//input[@id='sp_date']")
    public WebElement DateInput;

    @FindBy(xpath = "//input[@id='sp_description']")
    public WebElement DescriptionInput;

    @FindBy(xpath = "//input[@id='pay_saved_payees']")
    public WebElement PayBtn;

    @FindBy(xpath = "//div[@id='alert_content']/span")
    public WebElement SuccessMsg;

    @FindBy(xpath = "//div[@id='tabs']/ul//li[2]/a")
    public WebElement addNewPayeeTab;

    @FindBy(xpath = "//input[@id='np_new_payee_name']")
    public WebElement payeeNameInput;

    @FindBy(xpath = "//textarea[@id='np_new_payee_address']")
    public WebElement payeeAddressInput;

    @FindBy(xpath = "//input[@id='np_new_payee_account']")
    public WebElement accountInput;

    @FindBy(xpath = "//input[@id='np_new_payee_details']")
    public WebElement payeeDetailsInput;

    @FindBy(xpath = "(//div[@class='pull-right'])[2]/input")
    public WebElement addBtn;

    @FindBy(xpath = "//div[@id='alert_content']")
    public WebElement paymentAddedSuccessMsg;

    @FindBy(xpath = "//div[@id='tabs']/ul/li[3]/a")
    public WebElement purchaseForeignCurrency;

    @FindBy(xpath = "//select[@id='pc_currency']")
    public WebElement currencyDropdown;

    @FindBy(xpath = "//input[@id='pc_calculate_costs']")
    public WebElement calculateCostsBtn;
































}
