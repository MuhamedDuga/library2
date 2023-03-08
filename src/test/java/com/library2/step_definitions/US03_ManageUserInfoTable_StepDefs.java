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
    ManageUserInfoTablePage_MD userInfoTable = new ManageUserInfoTablePage_MD();
    Select select = new Select(userInfoTable.showRecordsDropdown);
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
        userInfoTable.users.click();
    }
    @When("I select Show {int} records")
    public void i_select_show_records(Integer int1) {
        select.selectByValue((int1 + ""));
    }
    @Then("show records value should be {int}")
    public void show_records_value_should_be(Integer int1) {
        Assert.assertEquals(int1 + "", select.getFirstSelectedOption().getText());
    }
    @Then("the users table must display {int} records")
    public void the_users_table_must_display_records(Integer int1) {
        Assert.assertEquals((int)int1, userInfoTable.showRecords.getSize());
    }

}
