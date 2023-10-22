package com.digital.pages.usersPage;

import com.digital.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FilesPage extends BasePage {

    @FindBy(xpath = "//input[@name='name']")
    public WebElement firstName;

    public FilesPage fullUpTheFirstName(){
        elementActions.writeText(firstName,"aida");
        return this;

    }

}
