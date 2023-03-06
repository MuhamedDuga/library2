package com.library2.pages;

import com.library2.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US02_ShowRecordsFunctionality {

    public  US02_ShowRecordsFunctionality(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath="//div[@class='dataTables_length']//option[2]")
    public WebElement showRecords;

    @FindBy(name = "tbl_users_length")
    public WebElement showRecordsDropdown;


}
