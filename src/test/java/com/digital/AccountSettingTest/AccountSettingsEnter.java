package com.digital.AccountSettingTest;

import com.digital.BaseTest;
import com.digital.config.ConfigReader;
import com.digital.driver.Driver;
import com.digital.pages.HomePage;
import com.digital.pages.LoginPage;
import com.digital.pages.accountSettingsPage.AccountSettingsPage;
import com.digital.pages.accountSettingsPage.BasicSettings;
import com.digital.pages.accountSettingsPage.EcommercePage;
import com.digital.pages.accountSettingsPage.TalentLMSBetaPage;
import com.digital.pages.usersPage.UserCoursesPage;
import com.digital.utils.FakeDataProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AccountSettingsEnter extends BaseTest {
public BasicSettings basicSettings;
    public EcommercePage ecommercePage;

    public TalentLMSBetaPage talentLMSBetaPage;
    @BeforeClass
    public void BasicSettingsTest () {
        accountSettingsPage = new AccountSettingsPage();
        accountSettingsPage.enterAccountSettingsPage();
    }

}
