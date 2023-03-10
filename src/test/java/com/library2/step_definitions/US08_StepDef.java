package com.library2.step_definitions;

import com.library2.pages.LoginPage;
import com.library2.pages.US08_LoginPage;
import com.library2.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.logging.Log;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.Map;

public class US08_StepDef {
    US08_LoginPage LoginPage = new US08_LoginPage();


    @When("I search for “{int}\"")
    public void i_search_for(Integer ID) {
        BrowserUtils.sleep(1);
LoginPage.IdSearch.sendKeys(ID.toString());
    }
    @Then("table should contain this data")
    public void table_should_contain_this_data(Map<String,String> column) {
        BrowserUtils.sleep(1);
        String Expected = " User ID= "+column.get("User ID")+" Full Name= "+ column.get("Full Name")+" Email= "+column.get("Email");
        String Actual = " User ID= "+LoginPage.ID.getText()+" Full Name= "+LoginPage.FullName.getText()+" Email= "+LoginPage.Email.getText();
        Assert.assertEquals(Expected,Actual);
//        Assert.assertEquals(column.get("User ID"), LoginPage.ID.getText());
//        Assert.assertEquals(column.get("Full Name"), LoginPage.FullName.getText());
//        Assert.assertEquals(column.get("Email"), LoginPage.Email.getText());


    }


}
