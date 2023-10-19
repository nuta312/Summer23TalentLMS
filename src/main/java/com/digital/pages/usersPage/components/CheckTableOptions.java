package com.digital.pages.usersPage.components;

import com.digital.pages.usersPage.UserHomePage;

public class CheckTableOptions extends UserHomePage {
    public UserHomePage userHomePage;
    //Alex
    public CheckTableOptions clickToReportsBtn(){
        userHomePage = new UserHomePage();
        elementActions.moveToElement(userHomePage.firstTableRow);
        elementActions.clickElement(userHomePage.reportsBtn);
        return this;
    }
}
