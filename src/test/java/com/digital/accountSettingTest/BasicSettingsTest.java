
package com.digital.accountSettingTest;

import com.digital.helper.ElementActions;
import com.digital.pages.accountSettingsPage.BasicSettings;
import org.testng.annotations.Test;


public class BasicSettingsTest extends AccountSettingsEnter {
    @Test(groups = "smoke", priority = 1)
    void fillUpTheSiteTest() {
        BasicSettings basicSettings = new BasicSettings();
        ElementActions elementActions = new ElementActions();
        basicSettings.fillUpTheSiteName("");
        basicSettings.fillUpTheSiteDescription("Basic Settings");
        basicSettings
                .searchSelectLanguage()
                .scrollDown()
                .searchSelectTimeZone()
                .scrollDown()
                .internalAnnouncementInput()
                .displayIconText(basicSettings.internalAnnouncementTool)
                .externalAnnouncementInput()
                .displayIconText(basicSettings.externalAnnouncementInfo)
                .checkBoxWork(basicSettings.checkboxEnableApi)
                .refreshApiKey()
                .checkBoxWork(basicSettings.checkboxEnableXApi)
                .checkBoxWork(basicSettings.checkboxExternalLrs);
        elementActions.writeText(basicSettings.inputXApiEndpoint, "https://www.google.com/")
                .writeText(basicSettings.inputXApiKey, "sdfghjk45632")
                .writeText(basicSettings.inputXApiSecret, "dog");
        basicSettings.checkBoxWork(basicSettings.checkboxRegistration)
                .inputDomainRegistration()
                .checkBoxWork(basicSettings.checkboxDisallowMultipleLogins)
                .checkBoxWork(basicSettings.checkboxDisallowMobileApp)
                .checkBoxWork(basicSettings.checkboxIntercomIdentityVerification);
        elementActions.writeText(basicSettings.inputIntercomSecretKey, "key");
        basicSettings.checkBoxWork(basicSettings.checkboxDisableVideoTranscoding)
                .checkBoxWork(basicSettings.checkboxVideoWatermark)
                .checkBoxWork(basicSettings.checkboxUseDocumentsViewer)
                .checkBoxWork(basicSettings.checkboxLoadInFrame)
                .checkBoxWork(basicSettings.checkboxLockSystem)
                .inputMessage()
                .checkBoxWork(basicSettings.checkboxHideFromSearchEngines)
                .checkBoxWork(basicSettings.checkboxExternalCatalog)
                .checkBoxWork(basicSettings.checkboxShowBranchCourses)
                .checkBoxWork(basicSettings.checkboxShowCourseInfoPage)
                .checkBoxWork(basicSettings.checkboxBambooHR)
                .checkBoxWork(basicSettings.checkboxInactiveUsers);
        elementActions.writeText(basicSettings.inputSubdomain, "nbu111");
        basicSettings.clickSave();

    }

}


