package com.zerobank.utilities;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class BrowserUtils {
    public static void sleep(int second) {
        second*=1000;
        try {
            Thread.sleep(second);
        } catch (InterruptedException e) {
            System.out.println("something happened in the sleep method");
        }
    }

    public static void assertTitle (String expected){
        String expectedTitle = expected;
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(expectedTitle, actualTitle);
    }

    public static List<String> getElementsText(List<WebElement> webElementList){
        //Create placeholder List<String>
        List<String> actualAsString = new ArrayList<>();
        for (WebElement each : webElementList) {
            actualAsString.add(each.getText());
        }
        return actualAsString;
    }
}
