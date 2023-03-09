package com.library2.step_definitions;

import com.library2.pages.HomePageMenu;
import com.library2.pages.LoginPage;
import com.library2.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US06_UserValidLogin_StepDefinition {

    LoginPage loginPage = new LoginPage();
    HomePageMenu homePageMenu = new HomePageMenu();


    @Given("I am on the login page")
    public void iAmOnTheLoginPage() {
        Driver.getDriver().get("https://library2.cydeo.com/login.html");
    }

    @When("I login using {string} and {string}")
    public void iLoginUsingAnd(String email, String password) {
        loginPage.userName.sendKeys(email);
        loginPage.password.sendKeys(password);
        loginPage.submit.click();

    }

    @Then("student account holder name should be {string}")
    public void studentAccountHolderNameShouldBe(String expectedName) {
        Assert.assertEquals(expectedName,homePageMenu.studentAccountName.getText());

    }

    @Then("librarian account holder name should be {string}")
    public void librarianAccountHolderNameShouldBe(String expectedName) {
        Assert.assertEquals(expectedName, homePageMenu.librarianAccountName.getText());
    }
}
