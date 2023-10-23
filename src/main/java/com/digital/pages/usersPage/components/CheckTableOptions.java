package com.digital.pages.usersPage.components;

import com.digital.pages.usersPage.UserHomePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class CheckTableOptions extends UserHomePage {
    public UserHomePage userHomePage;
    //Alex
    @FindBy(xpath = "//tr[@class='odd'][1]")
    public WebElement firstTable;

    @FindBy(xpath = "//span[@title='J. Torphy (admin)']")
    public WebElement moveToBtn;

    @FindBy(xpath = "//span[contains(text(),'SuperAdmin')]/../../td[7]/div/div/i[1]")
    public WebElement repBtn;

    @FindBy(xpath = "//*[text()='SuperAdmin']")
    public WebElement textSuperAdmin;

    public CheckTableOptions clickToReportsBtn() {
        userHomePage = new UserHomePage();
        elementActions.clickElement(firstTable);
        elementActions.moveToElement(moveToBtn).clickElement(repBtn);
        return this;
    }
}
