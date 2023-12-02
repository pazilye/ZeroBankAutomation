package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountActivityPage {

    public AccountActivityPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[normalize-space()='Account Activity']")
    public WebElement accountActivityTab;

    @FindBy(xpath = "//select[contains(@id,'accountId')]")
    public WebElement accountDropdown;

    @FindBy(xpath = "//div[@id='all_transactions_for_account']/table//tr/th")
    public WebElement accountTableColumnNames;




}
