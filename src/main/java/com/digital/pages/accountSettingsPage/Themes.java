package com.digital.pages.accountSettingsPage;

import com.digital.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Themes extends BasePage {

    @FindBy (xpath = "//a[@href='https://nbu111.talentlms.com/account/themes_index']")
    public WebElement openTheme;

    @FindBy (xpath = "(//*[@id='s2id_select-theme'])[1]")
    public WebElement openDropDown;

    public Themes clickDripDown() {
        elementActions.clickElement(openDropDown);
        return this;
    }
//    @FindBy (xpath = "//span[@class='select2-match' and text()='Tropic Zone']")
//    public WebElement clickTropicZone;



    }

