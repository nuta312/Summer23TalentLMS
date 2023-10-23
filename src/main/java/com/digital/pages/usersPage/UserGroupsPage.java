package com.digital.pages.usersPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserGroupsPage extends UserHomePage {

    //eliza
    @FindBy(xpath = "(//span[text()='J. Torphy'])[2]")
    public WebElement clickPerson;
    @FindBy(xpath = "//a[text()='Groups']")
    public WebElement clickGroup;

    @FindBy(xpath = "//div[@class='empty-state-text-margin-bottom']")
    public WebElement actualDescription;
    public String actualText;

    public UserGroupsPage clickPersonBtn() {
        elementActions.clickElement(clickPerson);
        return this;

    }

    public UserGroupsPage clickGroupBtn() {
        elementActions.clickElement(clickGroup);
        actualText = actualDescription.getAttribute("innerText");
        return this;
    }
}