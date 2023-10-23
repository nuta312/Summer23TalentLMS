package com.digital.pages.usersPage.components;

import com.digital.pages.usersPage.UserHomePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class CheckTableOptions extends UserHomePage {
    public UserHomePage userHomePage;
    //Alex

    @FindBy(xpath ="//span[@title='J. Torphy (admin)']" )
    public WebElement moveToBtn;

    @FindBy(xpath = "//tr[@class='even'][2]//i[@title='Reports']")
    public WebElement repBtn;

    @FindBy(xpath = "//*[text()='SuperAdmin']")
    public WebElement textSuperAdmin;



    public CheckTableOptions clickToReportsBtn(){
        userHomePage = new UserHomePage();
        elementActions.moveToElement(userHomePage.firstTableRow);
        elementActions.moveToElement(moveToBtn).clickElement(repBtn);
        return this;
    }


}
