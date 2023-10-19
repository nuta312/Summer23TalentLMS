package com.digital.pages.usersPage.components;

import com.digital.pages.usersPage.UserHomePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class CheckTableOptions extends UserHomePage {
    public UserHomePage userHomePage;
    //Alex
    public CheckTableOptions clickToReportsBtn(){
        userHomePage = new UserHomePage();
        elementActions.moveToElement(userHomePage.firstTableRow);
        elementActions.clickElement(userHomePage.reportsBtn);
        return this;
    }
    @FindBy(xpath = "//*[text()='SuperAdmin']")
    public WebElement textSuperAdmin;

}
