package com.digital.pages.accountSettingsPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TalentLMSBetaPage extends AccountSettingsTest {

    @FindBy(xpath = "//a[@href='https://nbu111.talentlms.com/account/plus_index']")
    public WebElement openTalentLMS;
    @FindBy(xpath = "//a[@href='https://help.talentlms.com/hc/en-us/articles/7277832546076']")
    public WebElement learnMore;

    @FindBy(xpath = "//input[@name='submit_plus']")
    public WebElement submitTl;

    @FindBy(xpath = "//a[@href='https://talentlms.typeform.com/talentlmsplus']")
    public WebElement feedback;

    public TalentLMSBetaPage openTalentLMS(){
        elementActions.clickElement(openTalentLMS);
        return this;
    }

    public TalentLMSBetaPage clickLearnMore(){
        elementActions.clickElement(learnMore);
        return this;
    }

    public TalentLMSBetaPage submitTl(){
        elementActions.waitElementToBeClickable(submitTl);
        elementActions.clickElement(submitTl);
        return this;
    }

    public TalentLMSBetaPage feedback(){
        elementActions.clickElement(feedback);
        return this;
    }
}
