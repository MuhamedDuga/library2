package com.library2.pages;

import com.library2.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US005_Page {

    public US005_Page(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[normalize-space()='Users']")
    public WebElement usersLink;

    @FindBy(xpath = "//input[@type='search']")
    public WebElement searchBox;

    @FindBy(tagName = "th")
    public List<WebElement> columnNames;

    @FindBy(xpath = "//th[@data-name='actions']")
    public WebElement actions;

    @FindBy(xpath = "//th[@data-name='id']")
    public WebElement userId;

    @FindBy(xpath = "//th[@data-name='full_name']")
    public WebElement fullName;

    @FindBy(xpath = "//th[@data-name='email']")
    public WebElement email;

    @FindBy(xpath = "//th[@data-name='group_name']")
    public WebElement groupName;

    @FindBy(xpath = "//th[@data-name='status']")
    public WebElement status;

    @FindBy(xpath = "//*[@id=\"tbl_users\"]/tbody/tr[1]/td[4]")
    public WebElement testText;






}
