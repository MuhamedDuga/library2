package com.library2.step_definitions;

import com.library2.pages.UsersPage_SR;
import com.library2.utilities.BrowserUtils;
import com.library2.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class US02_ShowRecordsFunctionality_StepDefs {

    WebDriver driver = Driver.getDriver();
    //UsersPage_SR ShowRecordsFunctionality = new UsersPage_SR();

    @Then("show records default value should be {int}")
    public void show_records_default_value_should_be(Integer int1) {
        WebElement dropdown = driver.findElement(By.xpath("//select[contains(@class,'form-control input-sm')]"));
        Select select = new Select(dropdown);
        WebElement defaultOption = select.getFirstSelectedOption();
        String actual = defaultOption.getText();
        String expected = int1.toString();
        System.out.println("actual = " + actual);
        System.out.println("expected = " + expected);
        Assert.assertEquals(expected, actual);

        //TODO: Why this code does not work?
        //TODO: Why i can't instantiate UsersPage_SR class?
/*    @Then("show records default value should be {int}")
    public void show_records_default_value_should_be(Integer int1) {
        Select select = new Select(ShowRecordsFunctionality.showRecordsDropdown);
        String defaultOption = select.getFirstSelectedOption().getText();
        String actual = defaultOption;
        String expected = int1.toString();
        System.out.println("actual = " + actual);
        System.out.println("expected = " + expected);
        Assert.assertEquals(expected, actual);*/


    }
    @Then("show records should have following options:")
    public void show_records_should_have_following_options(List<String> expectedRow) {
        WebElement dropdown = driver.findElement(By.xpath("//select[contains(@class,'form-control input-sm')]"));
        List<String> actualRow = BrowserUtils.dropdownOptions_as_STRING(dropdown);
        System.out.println("actualRow = " + actualRow);
        System.out.println("expectedRow = " + expectedRow);
        Assert.assertEquals(expectedRow, actualRow);

        //TODO: Why this code does not work?
        /*UsersPage_SR ShowRecordsFunctionality = new UsersPage_SR();
        List<String> actualRow = BrowserUtils.dropdownOptions_as_STRING(ShowRecordsFunctionality.showRecordsDropdown);
        System.out.println("actualRow = " + actualRow);
        System.out.println("expectedRow = " + expectedRow);
        Assert.assertEquals(expectedRow, actualRow);*/



    }

}
