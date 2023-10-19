package com.digital.pages.usersPage;

import com.digital.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserHomePage extends BasePage {
    //general
    @FindBy(xpath = "//tr[@class='odd'][1]")
    public WebElement firstTableRow;

    @FindBy(xpath ="//tr[@class='odd'][1]//i[@title='Reports']" )
    public WebElement reportsBtn;


}
