package com.digital.pages.accountSettings;

import com.digital.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.HashMap;
import java.util.Map;

public class BasicSettings extends BasePage {



    @FindBy(xpath = "//input[@name='site_name']")
    public WebElement siteNameInput;

    @FindBy(xpath = "//input[@name='site_description']")
    public WebElement siteDescriptionInput;

    @FindBy(xpath= "//a[@class='select2-choice']")
    public WebElement inputLanguage;

    @FindBy(xpath = "//div[text()='Español (Spanish)']")
    public WebElement choosingLanguage;

    @FindBy(id = "s2id_default_timezone")
    public WebElement defaultTheTimeZone;

    @FindBy(xpath = "//div[text()='(GMT +02:00) Madrid, Spain']")
    public WebElement choosingDefaultZone;

    @FindBy(xpath = "//a[@class='select2-choice']")
    public WebElement dateFormat;

    @FindBy(xpath = "//span[text()='DD/MM/YYYY']")
    public WebElement choosingDateFormat;

    public BasicSettings fillUpTheSiteName(String siteName) {
        elementActions.writeText(siteNameInput, siteName);
        return this;
    }

    public BasicSettings fillUpTheSiteDescription(String txt) {
        elementActions.writeText(siteDescriptionInput, txt);
        return this;
    }
    public BasicSettings selectLanguage() {
        elementActions.clickElement(inputLanguage);
        return this;
    }
    public BasicSettings choosingLanguageInput() {
        elementActions.clickElement(choosingLanguage);
        return this;
    }


    public BasicSettings inputTheTimeZone(){
       elementActions.clickElement(defaultTheTimeZone);
    return this;
    }

    public  BasicSettings inputTheDefaultZone(){
        elementActions.clickElement(choosingDefaultZone);
    return this;
    }

    public BasicSettings dateFormatClick(){
        elementActions.clickElement(dateFormat);
        return this;
    }

    public BasicSettings inputDateFormat(){
        elementActions.clickElement(choosingDateFormat);
        return this;
    }
}


