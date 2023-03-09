package com.library2.pages;

import com.library2.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class UserTable_SR {

    public UserTable_SR() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "inputEmail")
    public WebElement username;

    @FindBy(id = "inputPassword")
    public WebElement password;

    @FindBy(tagName = "button")
    public WebElement signInButton;


    public void login(String userNameStr, String passwordStr) {
        username.sendKeys(userNameStr);
        password.sendKeys(passwordStr);
        signInButton.click();
        // verification that we logged
    }

    @FindBy(xpath = "//tbody")
    public WebElement table;

    //-----------------------------------------------------------------------------------------
    // BZ added after this line

    @FindBy(xpath = "//tbody//td[2]")
    public List<WebElement> userIDs;
    //This method finds an array list of only the user ID's

    /*
    NOTE FROM BZB: I DIDN'T REALLY UNDERSTAND WHAT THIS METHOD IS ACCOMPLISHING.
    //TODO: attn Sergey: please compare with my new unique entries method
    public void uniqueEntries() {
        List<WebElement> rows = table.findElements(By.tagName("tr"));
        ArrayList<String> userIDs = new ArrayList<>();
        for (WebElement row : rows) {
            List<WebElement> cells = row.findElements(By.tagName("td"));
            if (cells.size() > 1) { // Make sure the row has at least two cells
                WebElement cell = cells.get(1); // Get the second cell (index 1)
                String text = cell.getText(); // Get the text of the cell
                userIDs.add(text);
            }


        }

     */
    public boolean checkUserIDUnique() {
        String userID;

        for (int i = 0; i < userIDs.size(); i++) {

            userID = userIDs.get(i).getText();

            for (int j = i + 1; j < userIDs.size(); j++) {

                String compare = userIDs.get(j).getText();

                if (userID.equals(compare)) {
                    return false;
                }

            }


        }
        return true;


    }
}
