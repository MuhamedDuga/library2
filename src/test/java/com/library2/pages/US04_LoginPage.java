package com.library2.pages;

import com.library2.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class US04_LoginPage {

    public US04_LoginPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id ="inputEmail")
    public WebElement loginUserInput;

    @FindBy(id = "inputPassword")
    public WebElement loginPasswordInput;

    @FindBy(xpath = "//button[@class='btn btn-lg btn-primary btn-block']")
    public WebElement SignIn;

    public void login(String UserName, String Password){
        loginUserInput.sendKeys(UserName);
        loginPasswordInput.sendKeys(Password);
        SignIn.click();

    }




}
