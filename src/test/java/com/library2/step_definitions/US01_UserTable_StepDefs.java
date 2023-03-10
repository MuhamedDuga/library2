package com.library2.step_definitions;

import com.library2.pages.LibrarianMainPage_SR;
import com.library2.pages.LoginPage;

import com.library2.utilities.ConfigurationReader;
import com.library2.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class US01_UserTable_StepDefs {
    WebDriver driver = Driver.getDriver();
    //TODO: Failed to instantiate class com.library2.step_definitions.US01_UserTable_StepDefs
    //UserTable_SR userTable = new UserTable_SR();
    LoginPage loginPage = new LoginPage();

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }

    @Given("I login as a librarian")
    public void i_login_as_a_librarian() {
        loginPage.login(ConfigurationReader.getProperty("librarian_username"), ConfigurationReader.getProperty("librarian_password"));


    }

    LibrarianMainPage_SR librarianMainPageSR = new LibrarianMainPage_SR();

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


}
