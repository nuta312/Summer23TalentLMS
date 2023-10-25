package com.digital.pages;

import com.digital.enums.UserCredentials;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(xpath = "//input[@name='login']")
    public WebElement loginInput;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordInput;

    @FindBy(xpath = "//input[@name='submit']")
    public WebElement submitBtn;


    public LoginPage logIn() {
        elementActions.writeText(loginInput, UserCredentials.ADMIN.getUsername());
        elementActions.writeText(passwordInput, UserCredentials.ADMIN.getPassword());
        elementActions.clickElement(submitBtn);
        return this;
    }


}
