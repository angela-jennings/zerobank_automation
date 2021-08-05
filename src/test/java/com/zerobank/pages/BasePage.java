package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    public BasePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = ".active")
    public WebElement activeTab;

    public void getTab (String tabName){
        String tabLocator = "//a[.='"+tabName+"']";
        Driver.getDriver().findElement(By.xpath(tabLocator)).click();
        BrowserUtils.sleep(1);
    }
}
