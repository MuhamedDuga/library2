package com.library2.step_definitions;

import com.library2.pages.US04_LoginPage;
import com.library2.utilities.ConfigurationReader;
import com.library2.utilities.Driver;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class US04_LogInSteps {

    US04_LoginPage loginPage = new US04_LoginPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));



    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }
    @Given("I login as a librarian")
    public void i_login_as_a_librarian() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='inputEmail']")));
        loginPage.loginUserInput.sendKeys("blah");
        loginPage.loginPasswordInput.sendKeys("blah");
        loginPage.SignIn.click();
    }
}
