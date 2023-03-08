package com.library2.step_definitions;

import com.library2.pages.US04_LoginPage;
import com.library2.pages.US04_UsersPage_BZ;
import com.library2.utilities.ConfigurationReader;
import com.library2.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class US04_Step_Def_BZ {

    US04_UsersPage_BZ us04 = new US04_UsersPage_BZ();

    Select select = new Select(us04.rowDropDown);
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));



    @Given("I click on {string} link")
    public void i_click_on_link() {
        us04.UsersPage.click();

    }
    @When("I select Show {int} records")
    public void i_select_show_records(Integer int1) {
        select.selectByValue((int1+""));
    }
    @Then("show records value should be {int}")
    public void show_records_value_should_be(Integer int1) {
        Assert.assertEquals(int1 + "", select.getFirstSelectedOption().getText() );
    }
    @Then("the users table must display {int} records")
    public void the_users_table_must_display_records(Integer int1) {
        Assert.assertEquals((int)int1, us04.rowList.size());
    }


}
