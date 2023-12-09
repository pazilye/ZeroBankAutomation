package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;

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

    @FindBy(xpath = "((//table[@class='table'])[1]/tbody/tr/td/a)[1]")
    public WebElement SavingsBtn;

    @FindBy(xpath = "(//table[@class='table'])[2]/tbody/tr/td/a")
    public WebElement BrokeageBtn;

    @FindBy(xpath = "((//table[@class='table'])[3]/tbody/tr/td)[1]/a")
    public WebElement CheckingBtn;

    @FindBy(xpath = "(//table)[3]/tbody/tr[2]/td[1]/a")
    public WebElement CreditCardBtn;

    @FindBy(xpath = "(//table[@class='table'])[4]/tbody/tr/td[1]/a")
    public WebElement LoanBtn;




















}
