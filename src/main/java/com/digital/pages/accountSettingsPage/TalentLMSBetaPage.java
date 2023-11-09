package com.digital.pages.accountSettingsPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TalentLMSBetaPage extends AccountSettingsPage {

    @FindBy(xpath = "//a[@href='https://nbu111.talentlms.com/account/plus_index']")
    public WebElement openTalentLMS;
    @FindBy(xpath = "//a[@href='https://help.talentlms.com/hc/en-us/articles/7277832546076']")
    public WebElement learnMore;

    @FindBy(xpath = "(//input[@autocomplete='off'])[4]")
    public WebElement submitTl;

    @FindBy(xpath = "//a[@href='https://talentlms.typeform.com/talentlmsplus']")
    public WebElement feedback;

}
