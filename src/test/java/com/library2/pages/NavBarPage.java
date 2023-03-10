package com.library2.pages;

import com.library2.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NavBarPage {

    public void NavBar(){

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//span[.='Books']")
    public WebElement books;

    @FindBy(xpath = "//input[@type='search']")
    public WebElement searchBtn;

   //  @FindBy(xpath = "//div[@class = 'collapse navbar-collapse']")
   // public WebElement navBar;
}
