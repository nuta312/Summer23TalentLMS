package com.digital.pages.accountSettingsPage;

import com.digital.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountSettingsTest extends BasePage {

    // create locator to find and enter into Account & Settings page
    @FindBy(xpath = "//div[@class='tl-bold-link']/a[@href='https://nbu111.talentlms.com/account/basic_index']")
    public WebElement enter;

    public AccountSettingsTest enterAccountSettingsPage(){
        elementActions.waitElementToBeClickable(enter);
        elementActions.waitElementToBeVisible(enter);
        if (enter.isDisplayed() && enter.isEnabled()) {
            elementActions.scrollToTheElement(enter);
            elementActions.clickElement(enter);
        }
        return this;
    }
}
