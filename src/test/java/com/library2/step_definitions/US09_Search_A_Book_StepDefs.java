package com.library2.step_definitions;

import com.library2.pages.LoginPage;
import com.library2.pages.NavBarPage;
import com.library2.utilities.ConfigurationReader;
import com.library2.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class US09_Search_A_Book_StepDefs {
        LoginPage loginPage = new LoginPage();
    @Given("I am on the login page")
    public void i_am_on_the_login_page() {

        loginPage.login(ConfigurationReader.getProperty("student_username"), (ConfigurationReader.getProperty("student_password")));

    }
    @Given("I login to application as a student")
    public void i_login_to_application_as_a_student() {
        System.out.println(loginPage);
    }

    NavBarPage navBarPage = new NavBarPage();
    //@When("I navigate to {string} page")
     //   public void i_navigate_to_page() {


    @When("I navigate to Books page")
    public void iNavigateToBooksPage() {

            navBarPage.books.click();
        }


    @When("I search for {string}")
    public void i_search_for(String bookName) {
        navBarPage.searchBtn.sendKeys(bookName);

    }

    @Then("books table should contain results matching The Goldfinch")
    public void books_table_should_contain_results_matching_the_goldfinch(io.cucumber.datatable.DataTable dataTable) {
      //  Assert.assertTrue(Driver.getDriver().getTitle().contains(bookName));


    }


    }



