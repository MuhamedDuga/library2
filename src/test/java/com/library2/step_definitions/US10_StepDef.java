package com.library2.step_definitions;

import com.library2.pages.DashBoardPage;
import com.library2.pages.LoginPage;
import com.library2.utilities.BrowserUtils;
import com.library2.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US10_StepDef {

    LoginPage loginPage = new LoginPage();  // use web elements

    @When("I enter user name {string}")
    public void iEnterUserName(String username) {
       loginPage.userName.sendKeys(username);

    }

    @And("I enter password {string}")
    public void iEnterPassword(String password) {
        loginPage.password.sendKeys(password);
    }

    @And("click the sign in button")
    public void clickTheSignInButton() {

        loginPage.submit.click();
    }
      DashBoardPage dashBoardPage = new DashBoardPage();
    @Then("dashboard should be displayed {string}")
    public void dashboardShouldBeDisplayed(String page) {
        BrowserUtils.sleep(1);
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(page.toLowerCase()));

        //Assert.assertTrue(dashBoardPage.dashBoard.isDisplayed());


    }
}
