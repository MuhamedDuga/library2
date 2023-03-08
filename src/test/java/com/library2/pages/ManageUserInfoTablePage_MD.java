package com.library2.pages;

import com.library2.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageUserInfoTablePage_MD {
    public ManageUserInfoTablePage_MD (){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath="//span[.='Users']")
    public WebElement users;

    @FindBy(name = "tbl_users_length")
    public WebElement showRecordsDropdown;

    @FindBy(xpath="//div[@class='dataTables_length']//option[4]")
    public WebElement showRecords;

}
