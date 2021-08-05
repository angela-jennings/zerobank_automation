package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {
    public SignInPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@id='user_login']")
    public WebElement usernameInputField;

    @FindBy(xpath = "//input[@id='user_password']")
    public WebElement passwordInputField;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement signInButton;

    @FindBy(xpath = "//div[@class='alert alert-error']")
    public WebElement loginErrorMessage;
}
