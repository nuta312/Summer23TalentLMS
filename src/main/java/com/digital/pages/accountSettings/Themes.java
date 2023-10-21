package com.digital.pages.accountSettings;

import com.digital.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Themes extends BasePage {



    @FindBy (xpath = "//a[@href='https://nbu111.talentlms.com/account/themes_index']")
    public WebElement openTheme;

    public Themes openThemes () {
        elementActions.clickElement(openTheme);
      return this;
    }
}
