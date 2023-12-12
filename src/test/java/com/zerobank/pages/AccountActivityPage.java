package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
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

    @FindBy(xpath = "//select[@id='aa_accountId']")
    public WebElement AccountActivityPageAccountDropdown;

    @FindBy(xpath = "//div[@id='tabs']/ul/li[2]/a")
    public WebElement FindTransactionsTab;

    @FindBy(xpath = "//input[@id='aa_description']")
    public WebElement descriptionInput;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement findBtn;

    @FindBy(xpath = "//div[@id='filtered_transactions_for_account']/table/tbody/tr")
    public WebElement tableBodyRowONLINE;

    @FindBy(xpath = "//div[@id=\"filtered_transactions_for_account\"]/table/tbody/tr/td[2]")
    public WebElement tableBodyRowOFFICE;

    @FindBy(xpath = "//div[@id='filtered_transactions_for_account']/div")
    public WebElement noResultsMsg;

    @FindBy(xpath = "//div[@id='filtered_transactions_for_account']/table//tr//td[3]")
    public WebElement depositColumn;

    @FindBy(xpath = "//div[@id=\"filtered_transactions_for_account\"]/table/tbody/tr[2]/td[4]")
    public WebElement withdrawalColumn;

    @FindBy(xpath = "//select[@id='aa_type']")
    public WebElement typeDropdown;

































}
