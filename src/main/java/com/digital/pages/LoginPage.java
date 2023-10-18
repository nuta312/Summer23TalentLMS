package com.digital.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy (xpath = "//input[@name='login']")
    WebElement loginInput;

    @FindBy(xpath = "//input[@name='password']")
    WebElement passwordInput;

    @FindBy(xpath = "//input[@name='submit']")
    WebElement submitBtn;


    public LoginPage logIn(){
        elementActions.writeText(loginInput,"admin");
        elementActions.writeText(passwordInput,"Admin123!");
        elementActions.clickElement(submitBtn);
        return this;
    }


}
