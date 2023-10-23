package com.digital.accountSettingTest;

import com.digital.BaseTest;
import com.digital.pages.accountSettingsPage.AccountSettingsPage;
import com.digital.pages.accountSettingsPage.BasicSettings;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AccountSettingsEnter extends BaseTest {
    public BasicSettings basicSettings;

    @BeforeClass
    public void BasicSettingsTest() {
        accountSettingsPage = new AccountSettingsPage();
        accountSettingsPage.enterAccountSettingsPage();
    }
}
