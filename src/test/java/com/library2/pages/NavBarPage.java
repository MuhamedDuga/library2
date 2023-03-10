package com.library2.pages;

import com.library2.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class NavBarPage {

    public NavBarPage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//span[.='Books']")
    public WebElement books;

    @FindBy(xpath = "//input[@type='search']")
    public WebElement searchBtn;

    @FindBy (tagName = "th")
    public List<WebElement> keysHeader;

    @FindBy (tagName = "td")
    public List<WebElement> keyValues;

}
