package com.library2.pages;

import com.library2.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US12_HomePage {
   public US12_HomePage(){
       PageFactory.initElements(Driver.getDriver(), this);
   }

   @FindBy (linkText = "Users")
    public WebElement usersModule;

   @FindBy (linkText = "Books")
    public WebElement booksModule;

   @FindBy (linkText = "Dashboard")
    public WebElement dashboardModule;



}
