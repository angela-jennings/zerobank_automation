package com.zerobank.step_definitions;

import com.zerobank.pages.BasePage;
import com.zerobank.pages.SignInPage;
import com.zerobank.pages.ZeroBankHomePage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginStepDefinitions {
ZeroBankHomePage zeroBankHomePage = new ZeroBankHomePage();
SignInPage signInPage = new SignInPage();
WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
BasePage basePage = new BasePage();

    @Given("user is on home page and clicks to sign in button")
    public void userIsOnHomePageAndClicksToSignInButton() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        wait.until(ExpectedConditions.visibilityOf(zeroBankHomePage.homePageSignInButton));
        zeroBankHomePage.homePageSignInButton.click();
    }

    @When("user clicks login button")
    public void user_clicks_login_button() {
        signInPage.signInButton.click();
    }

    @Then("user should see {string} error message")
    public void user_should_see_error_message(String errorMessage) {

        Assert.assertEquals(errorMessage, signInPage.loginErrorMessage.getText());
    }

    @When("user enters username {string} and password {string}")
    public void userEntersValidAndValid(String username, String password) {
        signInPage.usernameInputField.sendKeys(username);
        signInPage.passwordInputField.sendKeys(password);
    }

    @Then("user should see {string} page")
    public void userShouldSeePage(String pageName) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(pageName));
        String selectedTab = basePage.activeTab.getText();
        Assert.assertEquals(pageName, selectedTab);

    }
}
