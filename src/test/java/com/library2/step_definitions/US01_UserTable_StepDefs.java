package com.library2.step_definitions;

import com.library2.pages.LibrarianMainPage;
import com.library2.pages.US01_UserTable;
import com.library2.utilities.ConfigurationReader;
import com.library2.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US01_UserTable_StepDefs {

    US01_UserTable userTable = new US01_UserTable();
    LibrarianMainPage librarianMainPage = new LibrarianMainPage();

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));


    }
    @Given("I login as a librarian")
    public void i_login_as_a_librarian() {
        userTable.login(ConfigurationReader.getProperty("librarian_username"), ConfigurationReader.getProperty("librarian_password"));


    }
    @When("I click on {string} link")
    public void i_click_on_link(String userLink) {
        librarianMainPage.UsersLink.click();


    }
    @Then("Each user id should be unique")
    public void each_user_id_should_be_unique() {
        //TODO: Write code here that turns the phrase above into concrete actions


    }


}
