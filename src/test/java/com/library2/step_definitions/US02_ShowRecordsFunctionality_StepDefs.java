package com.library2.step_definitions;

import com.library2.pages.US02_ShowRecordsFunctionality;
import com.library2.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class US02_ShowRecordsFunctionality_StepDefs {

    US02_ShowRecordsFunctionality ShowRecordsFunctionality = new US02_ShowRecordsFunctionality();

    @Then("show records default value should be {int}")
    public void show_records_default_value_should_be(Integer valueRecords) {

        String actual = ShowRecordsFunctionality.showRecords.getText();
        String expected = valueRecords.toString();
        System.out.println("actual = " + actual);
        System.out.println("expected = " + expected);
        Assert.assertEquals(expected, actual);


    }
    @Then("show records should have following options:")
    public void show_records_should_have_following_options(List<String> expectedRow) {
        List<String> actualRow = BrowserUtils.dropdownOptions_as_STRING(ShowRecordsFunctionality.showRecordsDropdown);
        System.out.println("actualRow = " + actualRow);
        System.out.println("expectedRow = " + expectedRow);
        Assert.assertEquals(expectedRow, actualRow);
    }

    }



