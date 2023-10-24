package com.digital.AccountSettingTest;

import com.digital.BaseTest;
import com.digital.driver.Driver;
import com.digital.pages.accountSettings.Themes;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class ThemesTest extends AccountSettingsEnter {

    @Test
    public void SettingThemesTest(){

        themes = new Themes();
        themes.openThemes();
        themes.clickDropDown();
        themes.chooseTropicZone();


//        WebElement getOpenSettings = driver.findElement(By.xpath("//a[@href='https://nbu111.talentlms.com/account/basic_index']"));
//        getOpenSettings.click();

//        WebElement openTheme = driver.findElement(By.xpath("//a[@href='https://nbu111.talentlms.com/account/themes_index']"));
//        openTheme.click();
    }

}
