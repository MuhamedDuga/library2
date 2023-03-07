package com.library2.pages;

import com.library2.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;

public class US04_UsersPage_BZ {
    public US04_UsersPage_BZ() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//span[text() = 'Users']")
    public WebElement UsersPage;

    @FindBy (name = "tbl_users_length")
    public WebElement rowDropDown;

    @FindBy (xpath = "//tbody/tr")
    public ArrayList<WebElement> rowList;



}
