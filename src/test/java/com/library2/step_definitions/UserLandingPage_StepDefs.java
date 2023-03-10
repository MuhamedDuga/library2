package com.library2.step_definitions;

import com.library2.pages.LoginPage;
import com.library2.utilities.BrowserUtils;
import com.library2.utilities.ConfigurationReader;
import com.library2.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class UserLandingPage_StepDefs {

    LoginPage loginPage = new LoginPage();


    @When("I login using {string} and {string}.")
    public void i_login_using_and_library_user(String username, String password) {
        loginPage.login(username, password);
    }
    @Then("{string} page should be displayed")
    public void dashboard_page_should_be_displayed(String page) {
        BrowserUtils.sleep(3);
        String currentURL = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(currentURL.contains(page));
    }

}
