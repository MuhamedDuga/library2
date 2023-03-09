package com.library2.step_definitions;

import com.library2.pages.LoginPage;
import com.library2.pages.ManageUserInfoTablePage_MD;
import com.library2.utilities.ConfigurationReader;
import com.library2.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

public class US03_ManageUserInfoTable_StepDefs {
    LoginPage loginPage = new LoginPage();
    ManageUserInfoTablePage_MD userPageObject = new ManageUserInfoTablePage_MD();


    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }
    @Given("I login as a librarian")
    public void i_login_as_a_librarian() {
        loginPage.login(ConfigurationReader.getProperty("librarian_username"), ConfigurationReader.getProperty("librarian_password"));

    }
    @Given("I click on {string} link")
    public void i_click_on_link(String string) {
        userPageObject.users.click();

    }
    @When("I select Show {string} records")
    public void iSelectShowRecords(String num) {
        userPageObject.chooseOption(num);
    }

    @Then("show records value should be {string}")
    public void showRecordsValueShouldBe(String num) {
        Assert.assertEquals(num, userPageObject.readSelectedOption());

    }

    @Then("the users table must display {string} records")
    public void the_users_table_must_display_records(String string) {
        Assert.assertEquals(string, userPageObject.numberOfTableRows());
    }

}
