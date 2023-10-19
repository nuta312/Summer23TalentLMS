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

   @FindBy(xpath= "//div[@class='select2-container tl-select2'][@id='s2id_default_language']")
   public WebElement inputLanguage;

    @FindBy(xpath = "//div[text()='English']")
    public WebElement choosingLanguage;

   @FindBy(xpath= "//div[@class='select2-container tl-select2'][@id='s2id_default_timezone']")
   public WebElement defaultTimeZone;

    @FindBy(xpath = "//div[text()='(GMT +02:00) Madrid, Spain']")
    public WebElement choosingDefaultZone;

        @FindBy(xpath = "//div[@id='s2id_410532837']")
    public WebElement choosingDateFormat;

    @FindBy(xpath = "//span[text()='DDMMYYYY']")
    public WebElement dateFormat;

//    @FindBy(xpath = "//div[@id='s2id_2106249779']")
//    public WebElement timeFormat;
//
//    @FindBy(xpath = "//span[text()='24-hour']")
//    public WebElement fillInputTimeFormat;

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
       elementActions.clickElement(defaultTimeZone);
    return this;
    }

    public  BasicSettings inputDefaultZone(){
        elementActions.clickElement(choosingDefaultZone);
    return this;
    }

    public BasicSettings inputDateFormat(){
        elementActions.clickElement(choosingDateFormat);
        return this;
    }

    public BasicSettings dateFormatClick(){
        elementActions.clickElement(dateFormat);
        return this;
    }

//    public BasicSettings inputTimeFormat(){
//        elementActions.clickElement(timeFormat);
//        return this;
//    }
//
//    public BasicSettings choosingTimeFormat(){
//        elementActions.clickElement(fillInputTimeFormat);
//        return this;
//    }
}


