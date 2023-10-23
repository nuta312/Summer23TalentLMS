package com.digital.pages.usersPage;

import com.digital.pages.BasePage;
import com.digital.pages.usersPage.components.UserTable;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserHomePage extends BasePage {
    //general
    @FindBy(xpath = "//tr[@class='odd'][1]")
    public WebElement firstTableRow;

    @FindBy(xpath ="//tr[@class='odd'][1]//i[@title='Reports']" )
    public WebElement reportsBtn;

    @FindBy(xpath = "//tr[@class='odd'][1]//i[@title='Edit']")
    public WebElement editBtn;




}
