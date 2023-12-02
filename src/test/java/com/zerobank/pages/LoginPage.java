package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage (){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "user_login")
    public WebElement LoginInput;

    @FindBy(id = "user_password")
    public WebElement PasswordInput;

    @FindBy(xpath = "//input[@name='submit']")
    public WebElement SigninButton;

    @FindBy(xpath = "//form[@id='login_form']/div[1]")
    public WebElement ErrorMsg;

    public void login(){
        Driver.getDriver().get(ConfigurationReader.getProperty("loginPage"));
        this.LoginInput.sendKeys(ConfigurationReader.getProperty("UserName"));
        this.PasswordInput.sendKeys(ConfigurationReader.getProperty("Password"));
        this.SigninButton.click();
        BrowserUtils.waitFor(2);
        Driver.getDriver().navigate().back();

    }





}
