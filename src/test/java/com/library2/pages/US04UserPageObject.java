package com.library2.pages;

import com.library2.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class US04UserPageObject {
    Select select;

    public US04UserPageObject() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (partialLinkText = "Users")
    public WebElement usersLink;

    @FindBy (name = "tbl_users_length")
    public WebElement rowNumsDropDown;
    
    public void findRowDropDown(){
        select = new Select(rowNumsDropDown);
    }

    public void selectFromDropdown(String num){
        findRowDropDown();
        select.selectByValue(num);
    }

    public String valueOfDropdown(){
        findRowDropDown();
        return select.getFirstSelectedOption().getText();
    }

    public String numberOfTableRows(){
        findRowDropDown();
        List<WebElement> list = Driver.getDriver().findElements(By.xpath("//tbody//td[1]"));
        return list.size()+"";
    }



}
