package com.zerobank.pages;

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





}
