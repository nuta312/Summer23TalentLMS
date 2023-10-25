package com.digital.accountSettingTest;

import com.digital.pages.accountSettingsPage.TalentLMSBetaPage;
import org.testng.annotations.Test;


public class TalentLMSBetaTest extends AccountSettingsEnter {
    @Test
    void talentLMS() {
        talentLMSBetaPage = new TalentLMSBetaPage();
        talentLMSBetaPage.openTalentLMS()
                .clickLearnMore()
                .openTalentLMS()
                .submitTl()
                .feedback()
                .elementActions.navigateBack();
    }
}
