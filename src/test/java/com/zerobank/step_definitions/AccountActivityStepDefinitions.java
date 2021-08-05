package com.zerobank.step_definitions;

import com.zerobank.pages.BasePage;
import io.cucumber.java.en.When;

public class AccountActivityStepDefinitions {
    BasePage basePage = new BasePage();
    @When("the user navigates to {string} tab")
    public void the_user_navigates_to_tab(String tabName) {
        basePage.getTab(tabName);
    }

}
