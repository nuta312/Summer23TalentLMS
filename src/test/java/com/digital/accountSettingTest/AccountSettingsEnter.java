package com.digital.accountSettingTest;

import com.digital.BaseTest;

import com.digital.pages.accountSettingsPage.*;

import org.testng.annotations.BeforeClass;

public class AccountSettingsEnter extends BaseTest {

    public Themes themes;
    public BasicSettings basicSettings;
    public EcommercePage ecommercePage;
    public TalentLMSBetaPage talentLMSBetaPage;
    @BeforeClass
    public void BasicSettingsTest () {
        accountSettingsPage = new AccountSettingsTest();
        accountSettingsPage.enterAccountSettingsPage();
    }

}