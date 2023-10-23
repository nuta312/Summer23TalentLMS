package com.digital.pages.usersPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserBranchPage extends UserHomePage{
    //eliza
    @FindBy(xpath = "(//span[text()='J. Torphy'])[2]")
    public WebElement clickPersonBranch;

    @FindBy(xpath = "//a[text()='Branches']")
    public WebElement clickBranches;
    @FindBy(xpath = "//div[@class='empty-state-text-margin-bottom']")
    public WebElement actualText;

    public UserBranchPage clickPersonBranchBtn(){
        elementActions.clickElement(clickPersonBranch);
        return this;
    }
    public String actualBranchText;
    public UserBranchPage clickBranchBtn(){
        elementActions.clickElement(clickBranches);
        actualBranchText=actualText.getAttribute("innerText");
        return this;
    }
}
