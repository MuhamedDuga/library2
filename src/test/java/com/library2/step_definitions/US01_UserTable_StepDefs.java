package com.library2.step_definitions;

import com.library2.pages.LibrarianMainPage_SR;
import com.library2.pages.UserTable_SR;
import com.library2.pages.UsersPage_SR;
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
    UserTable_SR userTable = new UserTable_SR();
    LibrarianMainPage_SR librarianMainPageSR = new LibrarianMainPage_SR();

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
        librarianMainPageSR.UsersLink.click();


    }
    @Then("Each user id should be unique")
    public void each_user_id_should_be_unique() {
        WebElement table = Driver.getDriver().findElement(By.xpath("//tbody"));
        List<WebElement> rows = table.findElements(By.tagName("tr"));
        ArrayList<String> userIDs = new ArrayList<>();
        for (WebElement row : rows) {
            List<WebElement> cells = row.findElements(By.tagName("td"));
            if (cells.size() > 1) { // Make sure the row has at least two cells
                WebElement cell = cells.get(1); // Get the second cell (index 1)
                String text = cell.getText(); // Get the text of the cell
                userIDs.add(text);
            }
            //check if user ids are unique



        }
        //System.out.println(userIDs);
        for (int i = 0; i < userIDs.size(); i++) {
            for (int j = i + 1; j < userIDs.size(); j++) {
                if (userIDs.get(i).equals(userIDs.get(j))) {
                    System.out.println("Duplicate user ID: " + userIDs.get(i));
                }else if (!userIDs.get(i).equals(userIDs.get(j))){
                    System.out.println("Unique user ID: " + userIDs.get(i));
                }
            }
        }





    }


}
