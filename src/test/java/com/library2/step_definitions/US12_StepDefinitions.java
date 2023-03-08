package com.library2.step_definitions;

import com.library2.pages.LoginPage;
import com.library2.pages.US12_HomePage;
import com.library2.utilities.ConfigurationReader;
import com.library2.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US12_StepDefinitions {

    @Given("I am on the login as librarian")
    public void i_am_on_the_login_as_librarian() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    LoginPage loginPage = new LoginPage();
    @Given("I login as a librarian")
    public void i_login_as_a_librarian() {
      loginPage.login(ConfigurationReader.getProperty("librarian_username"), ConfigurationReader.getProperty("librarian_password"));
    }

US12_HomePage homepage = new US12_HomePage();


    @When("I click on {string} module")
    public void iClickOnModule(String moduleLink) {

        if(moduleLink.equalsIgnoreCase("Users")){
            homepage.usersModule.click();
        } else if (moduleLink.equalsIgnoreCase("Books")) {
            homepage.booksModule.click();
        }else {
            homepage.dashboardModule.click();
        }
    }

    @Then("{string} page should be displayed")
    public void pageShouldBeDisplayed(String moduleLink) {

        if(moduleLink.equalsIgnoreCase("Users")){
            homepage.usersModule.isDisplayed();
        } else if (moduleLink.equalsIgnoreCase("Books")) {
            homepage.booksModule.isDisplayed();
        }else{
            homepage.dashboardModule.isDisplayed();
        }
    }
}

