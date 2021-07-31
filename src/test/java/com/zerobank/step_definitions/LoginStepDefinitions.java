package com.zerobank.step_definitions;

import com.zerobank.pages.SignInPage;
import com.zerobank.pages.ZeroBankHomePage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.ro.Si;
import org.junit.Assert;

import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginStepDefinitions {
ZeroBankHomePage zeroBankHomePage = new ZeroBankHomePage();
SignInPage signInPage = new SignInPage();
WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

    @Given("user is on home page and clicks to sign in button")
    public void userIsOnHomePageAndClicksToSignInButton() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        wait.until(ExpectedConditions.visibilityOf(zeroBankHomePage.homePageSignInButton));
        zeroBankHomePage.homePageSignInButton.click();
    }

    @When("user enters valid username")
    public void user_enters_valid_username() {
        signInPage.usernameInputField.sendKeys(ConfigurationReader.getProperty("username"));
    }
    @When("user enters valid password")
    public void user_enters_valid_password() {
        signInPage.passwordInputField.sendKeys(ConfigurationReader.getProperty("password"));
    }
    @When("user clicks login button")
    public void user_clicks_login_button() {
        signInPage.signInButton.click();
        signInPage.advancedButton.click();
        signInPage.proceedToSiteLink.click();
    }
    @Then("user should see account summary page")
    public void user_should_see_account_summary_page() {
        BrowserUtils.assertTitle("Zero - Account Summary");
    }
    @When("user enters invalid username or invalid password")
    public void user_enters_invalid_username_or_invalid_password() {
        signInPage.usernameInputField.sendKeys("wrongUsername");
        signInPage.passwordInputField.sendKeys("wrongPassword");
    }
    @Then("user should see error message")
    public void user_should_see_error_message() {
        String expErrorMessage = "Login and/or password are wrong.";
        Assert.assertEquals(expErrorMessage, signInPage.loginErrorMessage.getText());
    }


}
