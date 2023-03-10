package com.library2.step_definitions;

import com.library2.pages.LoginPage;
import com.library2.pages.US04UserPageObject;
import com.library2.utilities.ConfigurationReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;



public class US04_Step_Def_BZ {

    LoginPage loginPage = new LoginPage();
    US04UserPageObject userPageObject = new US04UserPageObject();

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {

    }
    @Given("I login as a librarian")
    public void i_login_as_a_librarian() {
        loginPage.login(ConfigurationReader.getProperty("librarian_username"), ConfigurationReader.getProperty("librarian_password"));

    }
    @And("I click on Users link")
    public void iClickOnUsersLink() {
        userPageObject.usersLink.click();

    }

    @When("I select Show {string} records")
    public void iSelectShowRecords(String number) {
        userPageObject.selectFromDropdown(number);
    }

    @Then("show records value should be {string}")
    public void showRecordsValueShouldBe(String arg0) {
        Assert.assertEquals(userPageObject.valueOfDropdown(), arg0);
    }

    @And("the users table must display {string} records")
    public void theUsersTableMustDisplayRecords(String arg0) {
       Assert.assertEquals(userPageObject.numberOfTableRows(), arg0);

    }

}
