package com.zerobank.pages;
import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    public HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//div[@id='settingsBox']/ul/li[2]/a/i")
    public WebElement SettingsButton;

    @FindBy(xpath = "//li[@id='homeMenu']")
    public WebElement homeButton;

    @FindBy(xpath = "//li[@id='onlineBankingMenu']")
    public WebElement OnlineBankingButton;

    @FindBy(xpath = "//span[@id='account_summary_link']")
    public WebElement AccountSummaryOption;


    @FindBy(xpath = "//span[@id='account_activity_link']")
    public WebElement AccountActivityOption;

    @FindBy(xpath = "//span[@id='pay_bills_link']")
    public WebElement PayBillsOption;




















}
