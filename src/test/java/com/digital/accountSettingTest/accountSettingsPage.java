package com.digital.accountSettingTest;

import com.digital.BaseTest;

import com.digital.pages.accountSettingsPage.AccountSettingsTest;
import com.digital.pages.accountSettingsPage.BasicSettings;
import com.digital.pages.accountSettingsPage.EcommercePage;
import com.digital.pages.accountSettingsPage.TalentLMSBetaPage;

import org.testng.annotations.BeforeClass;

public class accountSettingsPage extends BaseTest {

public BasicSettings basicSettings;
    public EcommercePage ecommercePage;
    public TalentLMSBetaPage talentLMSBetaPage;
    @BeforeClass
    public void BasicSettingsTest () {
        accountSettingsPage = new AccountSettingsTest();
        accountSettingsPage.enterAccountSettingsPage();
    }

}
