package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.bouncycastle.jcajce.provider.asymmetric.X509;
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














}
