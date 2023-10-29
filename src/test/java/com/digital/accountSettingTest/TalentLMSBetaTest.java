package com.digital.accountSettingTest;

import com.digital.pages.accountSettingsPage.TalentLMSBetaPage;
import io.qameta.allure.Epic;
import org.testng.annotations.Test;


@Epic("Talent_LMS_Beta_Page")
public class TalentLMSBetaTest extends AccountSettingsEnter {
    @Test (groups = "regression", priority = 1)
    public void openTalentLMS(){
        talentLMSBetaPage = new TalentLMSBetaPage();
        elementActions.clickElement(talentLMSBetaPage.openTalentLMS);
    }

//    @Test (groups = "regression", priority = 2)
//    public void clickLearnMore(){
//        elementActions.clickElement(talentLMSBetaPage.learnMore);
//        elementActions.navigateBack();
//    }

    @Test (groups = "regression", priority = 3)
    public void submitTl(){
        elementActions.clickElement(talentLMSBetaPage.submitTl);
    }

//    @Test (groups = "regression", priority = 4)
//    public void feedback(){
//        elementActions.makeElementVisible(talentLMSBetaPage.feedback);
//        elementActions.clickElement(talentLMSBetaPage.feedback);
//    }
}
