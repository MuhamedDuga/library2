package com.library2.step_definitions;

import com.library2.pages.LoginPage;
import com.library2.pages.US07_AddUsers_Page;
import com.library2.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class US07_AddUsers_StepDefs {
    LoginPage loginPage = new LoginPage();
    US07_AddUsers_Page addUserPage = new US07_AddUsers_Page();

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {

    }
    @Given("I login using following credentials:")
    public void i_login_using_following_credentials(Map<String, String> credentials) {
        loginPage.userName.sendKeys(credentials.get("email"));
        loginPage.password.sendKeys(credentials.get("password"));
        loginPage.submit.click();
    }
    @Given("I click on {string} module")
    public void i_click_on_module(String page) {
        String locator = "//span[text() ='"+page+ "']";
        Driver.getDriver().findElement(By.xpath(locator)).click();
    }
    @When("I click on the Add Users")
    public void i_click_on_the_add_users() {
        addUserPage.addUserBTN.click();
    }
    @Then("dialog fields must have matching placeholder")
    public void dialog_fields_must_have_matching_placeholder(Map<String, String> placeholder) {
        List<WebElement> elements = addUserPage.listOfEntryBoxes();

        for (WebElement element : elements) {
                Assert.assertEquals(element.getAttribute("placeholder"), placeholder.get(element.getAttribute("name")));

        }

        String addressResult="";
        if(addUserPage.addressBox.getAttribute("placeholder").equals("")){
            addressResult=null;

        }

        Assert.assertEquals(placeholder.get("address"), addressResult );


    }

}
