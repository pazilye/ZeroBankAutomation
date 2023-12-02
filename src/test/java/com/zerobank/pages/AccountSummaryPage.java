package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountSummaryPage {

    public AccountSummaryPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[normalize-space()='Account Summary']")
    public WebElement AccountSummaryTab;

    @FindBy(className = "board-header")
    public WebElement ListOfAccounts;

    @FindBy(xpath = "(//table[@class='table'])[3]/thead/tr/th")
    public WebElement ColumnNames;




}
