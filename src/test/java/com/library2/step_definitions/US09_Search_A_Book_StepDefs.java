package com.library2.step_definitions;

import com.library2.pages.LoginPage;
import com.library2.pages.NavBarPage;
import com.library2.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.*;

public class US09_Search_A_Book_StepDefs {
        LoginPage loginPage = new LoginPage();
    @Given("I am on the login page")
    public void i_am_on_the_login_page() {

        loginPage.login(ConfigurationReader.getProperty("student_username"), (ConfigurationReader.getProperty("student_password")));

    }
    @Given("I login to application as a student")
    public void i_login_to_application_as_a_student() {
    }

         NavBarPage navBarPage = new NavBarPage();

    //@When("I navigate to Books page")
    //public void iNavigateToBooksPage() {
     //       navBarPage.books.click();

    @When("I navigate to {string} page")
    public void iNavigateToPage(String books) {
       navBarPage.books.click();

    }


    @When("I search for {string}")
    public void i_search_for(String bookName) {

        navBarPage.searchBtn.sendKeys(bookName);

    }
    @Then("books table should contain results matching The Goldfinch")
    public void books_table_should_contain_results_matching_the_goldfinch(Map<String, Objects> bookInfo) {

        Map <String, Objects> expectedMap = new TreeMap<>(bookInfo);
        Map<String, Object> actualMap = new TreeMap<>();

        List<String> keys = new ArrayList<>();
        for (WebElement eachKey : navBarPage.keysHeader){
            keys.add(eachKey.getText());
        }

        List<String> values = new ArrayList<>();
        for (WebElement eachKey : navBarPage.keyValues){
            values.add(eachKey.getText());
        }

        for (int i = 0; i < navBarPage.keysHeader.size(); i++) {
            actualMap.put(navBarPage.keysHeader.get(i).getText(), navBarPage.keyValues.get(i));
        }

        Assert.assertEquals(expectedMap, actualMap);

    }



}



