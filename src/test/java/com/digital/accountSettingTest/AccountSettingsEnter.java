
package com.digital.AccountSettingTest;

import com.digital.pages.accountSettingsPage.AccountSettingsPage;


import com.digital.BaseTest;

import com.digital.pages.accountSettingsPage.AccountSettingsPage;
import com.digital.pages.accountSettingsPage.BasicSettings;
import com.digital.pages.accountSettingsPage.EcommercePage;
import com.digital.pages.accountSettingsPage.TalentLMSBetaPage;

import org.testng.annotations.BeforeClass;


public class AccountSettingsEnter extends BaseTest {

    public BasicSettings basicSettings;
    public EcommercePage ecommercePage;
    public TalentLMSBetaPage talentLMSBetaPage;

    @BeforeClass
    public void BasicSettingsTest() {
        accountSettingsPage = new AccountSettingsPage();
        accountSettingsPage.enterAccountSettingsPage();
    }
}
