package com.digital.accountSettingTest;

import com.digital.pages.accountSettings.Themes;
import org.testng.annotations.Test;

public class ThemesTest extends AccountSettingsEnter {

    @Test
    public void SettingThemesTest(){

        Themes themes = new Themes();
        themes.openThemes();
        themes.clickDropDown();



//        WebElement getOpenSettings = driver.findElement(By.xpath("//a[@href='https://nbu111.talentlms.com/account/basic_index']"));
//        getOpenSettings.click();

//        WebElement openTheme = driver.findElement(By.xpath("//a[@href='https://nbu111.talentlms.com/account/themes_index']"));
//        openTheme.click();
    }

}
