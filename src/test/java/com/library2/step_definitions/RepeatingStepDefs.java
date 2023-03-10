package com.library2.step_definitions;

import com.library2.pages.*;
import com.library2.utilities.BrowserUtils;
import com.library2.utilities.ConfigurationReader;
import com.library2.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RepeatingStepDefs {
    WebDriver driver = Driver.getDriver();
    LoginPage loginPage = new LoginPage();
    LibrarianMainPage_SR librarianMainPageSR = new LibrarianMainPage_SR();
    ManageUserInfoTablePage_MD userPageObject = new ManageUserInfoTablePage_MD();
    US04UserPageObject userPageObject2 = new US04UserPageObject();
    US005_Page us005_page = new US005_Page();




    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @Given("I login as a librarian")
    public void i_login_as_a_librarian() {
        loginPage.login(ConfigurationReader.getProperty("librarian_username"), ConfigurationReader.getProperty("librarian_password"));
    }

    @And("I click on Users link")
    public void iClickOnUsersLink() {
        userPageObject2.usersLink.click();

    }

    @When("I click on {string} link")
    public void i_click_on_link(String userLink) {
        librarianMainPageSR.UsersLink.click();
    }
    @Then("Each user id should be unique")
    public void each_user_id_should_be_unique() {
        //TODO: Failed to instantiate class com.library2.step_definitions.US01_UserTable_StepDefs
        WebElement table = driver.findElement(By.xpath("//tbody")); // Find the table
        List<WebElement> rows = table.findElements(By.tagName("tr")); // Find all rows
        ArrayList<String> userIDs = new ArrayList<>(); // Create an empty list to hold the user IDs
        for (WebElement row : rows) { // Loop through the rows
            List<WebElement> cells = row.findElements(By.tagName("td")); // Find all cells
            if (cells.size() > 1) { // Make sure the row has at least two cells
                WebElement cell = cells.get(1); // Get the second cell (index 1)
                String text = cell.getText(); // Get the text of the cell
                userIDs.add(text); // Add the text to the list
            }
            //check if user ids are unique


        }
        //System.out.println(userIDs);
        for (int i = 0; i < userIDs.size(); i++) { // Loop through the rows
            for (int j = i + 1; j < userIDs.size(); j++) { // Loop through the rows
                if (userIDs.get(i).equals(userIDs.get(j))) { // Compare the two cells
                    System.out.println("Duplicate user ID: " + userIDs.get(i)); // Print the text of the cell
                } else if (!userIDs.get(i).equals(userIDs.get(j))) { // Compare the two cells
                    System.out.println("Unique user ID: " + userIDs.get(i)); // Print the text of the cell
                }
            }
        }


    }
    @Then("show records default value should be {int}")
    public void show_records_default_value_should_be(Integer value) {
        WebElement dropdown = driver.findElement(By.xpath("//select[contains(@class,'form-control input-sm')]"));
        Select select = new Select(dropdown);
        WebElement defaultOption = select.getFirstSelectedOption();
        String actual = defaultOption.getText();
        String expected = value.toString();
        System.out.println("actual = " + actual);
        System.out.println("expected = " + expected);
        Assert.assertEquals(expected, actual);
    }

    @Then("show records should have following options:")
    public void show_records_should_have_following_options(List<String> expectedRow) {
        WebElement dropdown = driver.findElement(By.xpath("//select[contains(@class,'form-control input-sm')]"));
        List<String> actualRow = BrowserUtils.dropdownOptions_as_STRING(dropdown);
        System.out.println("actualRow = " + actualRow);
        System.out.println("expectedRow = " + expectedRow);
        Assert.assertEquals(expectedRow, actualRow);
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



