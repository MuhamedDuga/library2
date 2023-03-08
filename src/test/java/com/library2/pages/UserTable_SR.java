package com.library2.pages;

import com.library2.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserTable_SR {

    public UserTable_SR(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "inputEmail")
    public WebElement username;

    @FindBy(id="inputPassword")
    public WebElement password;

    @FindBy(tagName = "button")
    public WebElement signInButton;





}
