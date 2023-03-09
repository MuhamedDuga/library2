package com.library2.step_definitions;

import com.library2.pages.LoginPage;
import com.library2.pages.NavBar;
import com.library2.utilities.BrowserUtils;
import com.library2.utilities.ConfigurationReader;
import com.library2.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class US09_Search_A_Book_StepDefs {

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        LoginPage loginPage = new LoginPage();
        loginPage.login(ConfigurationReader.getProperty("student_username"), (ConfigurationReader.getProperty("student_password")));

    }
    @Given("I login to application as a student")
    public void i_login_to_application_as_a_student() {

    }

    NavBar navBar = new NavBar();
    @When("I navigate to {string} page")
        public void i_navigate_to_page() {
            navBar.books.click();

    }

    @When("I search for {string}")
    public void i_search_for(String bookName) {
        navBar.searchBtn.sendKeys(bookName + Keys.ENTER);
        Assert.assertTrue(Driver.getDriver().getTitle().contains(bookName));


    }
    @Then("books table should contain results matching The Goldfinch")
    public void books_table_should_contain_results_matching_the_goldfinch(io.cucumber.datatable.DataTable dataTable) {


    };



    }
