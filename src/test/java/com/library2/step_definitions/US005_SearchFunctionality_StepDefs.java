package com.library2.step_definitions;

import com.library2.pages.LoginPage;
import com.library2.pages.US005_Page;
import com.library2.utilities.BrowserUtils;
import com.library2.utilities.ConfigurationReader;
import com.library2.utilities.Driver;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class US005_SearchFunctionality_StepDefs {

    LoginPage loginPage = new LoginPage();
    @Given("I am on the login page")
    public void i_am_on_the_login_page(){
       String currentURL =  Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(currentURL, ConfigurationReader.getProperty("url"));


    }

    US005_Page us005_page = new US005_Page();

    @Given("I click on {string} link")
    public void i_click_on_link(String string) {
        us005_page.usersLink.click();
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), "https://library2.cydeo.com/#users");

    }

    @When("I search for {string}")
    public void i_search_for(String testString) {
        us005_page.searchBox.sendKeys(testString);

    }
    @Then("table should contain rows with {string}")
    public void table_should_contain_rows_with(String expected) {
        BrowserUtils.sleep(2);
        String actualResult = us005_page.testText.getText().toLowerCase().trim().substring(0,4);
        System.out.println("Expected result: "+expected);
        System.out.println("Actual result: "+actualResult);

        String expectedResult = expected.toString();
        Assert.assertEquals(expectedResult, actualResult);

    }


    @Then("table should have following column names:")
    public void table_should_have_following_column_names(io.cucumber.datatable.DataTable dataTable) {
        List<String> expectedColumnNames = new ArrayList<>(Arrays.asList("Actions", "User ID", "Full Name", "Email", "Group", "Status"));
        List<WebElement> actualColumnNames = new ArrayList<>(us005_page.columnNames);

        List<String> actualAsString = new ArrayList<>();
        for (WebElement each : actualColumnNames) {
           actualAsString.add(each.getText());
       }
       Assert.assertEquals(actualAsString, expectedColumnNames);

    }

}