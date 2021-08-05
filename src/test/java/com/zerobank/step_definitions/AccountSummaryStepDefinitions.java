package com.zerobank.step_definitions;

import com.zerobank.pages.AccountSummaryPage;
import com.zerobank.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AccountSummaryStepDefinitions {
    AccountSummaryPage accountSummaryPage = new AccountSummaryPage();
    @Then("Account Summary page should have the following account types")
    public void account_summary_page_should_have_the_following_account_types(List<String> expAccounts) {
        List<String> accountSummaryAccountText = BrowserUtils.getElementsText(accountSummaryPage.accountSummaryAccountTypes);
        Assert.assertEquals("Account types text do not match", expAccounts, accountSummaryAccountText);
    }

    @Then("Credit Accounts Table must have these columns")
    public void credit_accounts_table_must_have_these_columns(List<String> expectedCreditAccountColumns) {
        List<String> actualCreditAccountColumns = BrowserUtils.getElementsText(accountSummaryPage.creditAccountTableColumns);
        Assert.assertEquals("Column names do not match", expectedCreditAccountColumns, actualCreditAccountColumns);

    }
}
