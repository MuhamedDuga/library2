package com.library2.pages;

import com.library2.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPage {

    public DashBoardPage( ){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "//span[.='Dashboard']")
    public WebElement dashBoard;



}
