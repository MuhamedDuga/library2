package com.library2.pages;

import com.library2.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NavBar {

    public void NavBar(){

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//button[@class='navbar-toggler']")
    public WebElement books;

    @FindBy(xpath = "//input[@type='search']")
    public WebElement searchBtn;
}
