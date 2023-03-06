package com.library2.pages;

import com.library2.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;

public class UsersPage_SR {

    public UsersPage_SR(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath="//div[@class='dataTables_length']//option[2]")
    public WebElement showRecords;

    @FindBy(name = "tbl_users_length")
    public WebElement showRecordsDropdown;

//    @FindBy(xpath="//tbody/tr/td[2]")
//    public ArrayList<WebElement> userIDColumn;

    @FindBy(xpath="//tbody")
    public ArrayList<WebElement> table;


}
