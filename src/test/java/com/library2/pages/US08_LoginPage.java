package com.library2.pages;

import com.library2.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US08_LoginPage {



    public US08_LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id="inputEmail")
    public WebElement userName;



    @FindBy(id="inputPassword")
    public WebElement password;

    @FindBy(tagName = "button")
    public WebElement submit;


    @FindBy(xpath = "//span [.='Users']")
    public WebElement usersLink;

    @FindBy(xpath = "//input[@type='search']")
    public WebElement IdSearch;

    @FindBy(xpath = "//tbody/tr[@role = 'row' ][1]")
    public WebElement ActualColumn;
    @FindBy(xpath = "//td[2]")
    public WebElement ID;

    @FindBy(xpath = "//td[3]")
    public WebElement FullName;

    @FindBy(xpath = "//td[4]")
    public WebElement Email;


}
