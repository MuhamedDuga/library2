package com.library2.pages;

import com.library2.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class US07_AddUsers_Page {

    public US07_AddUsers_Page() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//a[@href='tpl/add-user.html']")
    public WebElement addUserBTN;

    @FindBy (xpath = "//input[@placeholder]")
    public List<WebElement> inputList;

    @FindBy (name = "full_name")
    public WebElement nameBox;

    @FindBy (name = "email")
    public WebElement emailBox;

    @FindBy (name = "password")
    public WebElement passwordBox;

    @FindBy (name = "address")
    public WebElement addressBox;

    public List<WebElement> listOfEntryBoxes(){
        List<WebElement> elements = new ArrayList<>();
        elements.add(nameBox);
        elements.add(emailBox);
        elements.add(passwordBox);
        return elements;
    }








}
