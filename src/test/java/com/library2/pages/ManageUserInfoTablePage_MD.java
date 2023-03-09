package com.library2.pages;

import com.library2.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ManageUserInfoTablePage_MD {
    public ManageUserInfoTablePage_MD (){
        PageFactory.initElements(Driver.getDriver(), this);

    }
    Select select;

    @FindBy(xpath="//span[.='Users']")
    public WebElement users;

    @FindBy(name = "tbl_users_length")
    public WebElement showNumDropdown;

   public void findRowNumDropdown() {
       select = new Select(showNumDropdown);
   }
   public void selectFromDropdown(Integer integer) {
       findRowNumDropdown();
       select.selectByValue(integer + "");
   }
   public String valueOfDropdown() {
       findRowNumDropdown();
       return select.getFirstSelectedOption().getText();
   }
   public String numOfRows() {
       findRowNumDropdown();
      WebElement num = Driver.getDriver().findElement(By.xpath("//div[@class='dataTables_length']//option[4]"));
        return num.isDisplayed() ;
   }


}
