package com.library2.pages;

import com.library2.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class ManageUserInfoTablePage_MD {
    Select select;
    public ManageUserInfoTablePage_MD (){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath="//span[.='Users']")
    public WebElement users;

    @FindBy(name = "tbl_users_length")
    public WebElement showRecordsDropdown;

    @FindBy(xpath="//div[@class='dataTables_length']")
    public WebElement showRecords;

    public void chooseOption(String num){
        select = new Select(showRecordsDropdown);
        select.selectByValue(num);
    }

    public String readSelectedOption(){
        return select.getFirstSelectedOption().getText();
    }

    @FindBy (xpath = "//tbody//td[1]")
    public List<WebElement> allRows;

    public String numberOfTableRows() {
        return allRows.size() + "";
    }
}
