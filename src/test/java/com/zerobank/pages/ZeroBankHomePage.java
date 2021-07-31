package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZeroBankHomePage {
    public ZeroBankHomePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "//button[@id='signin_button']")
    public WebElement homePageSignInButton;
}
