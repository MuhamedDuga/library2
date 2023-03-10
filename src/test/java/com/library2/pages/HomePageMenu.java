package com.library2.pages;

import com.library2.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageMenu {

    public HomePageMenu(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//span)[6]")
    public WebElement studentAccountName;

    @FindBy(xpath = "(//span)[8]")
    public WebElement librarianAccountName;
}
