package com.digital.accountSettingTest;

import com.digital.BaseTest;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

@Epic("Account_Settings_Page")
public class AccountHomePageTest extends BaseTest {

    @Test(priority = 1)
    @Description("Check homepage button on the Main page")
    public void openHomePageTest() {
        elementActions.clickElement(accountHomePage.openHomePage);
        assertTrue(accountHomePage.openHomePage.isEnabled());
        Assert.assertEquals(driver.getCurrentUrl(), "https://nbu111.talentlms.com/account/cms_index");

    }

    @Test(priority = 2)
    @Description("Verify that user can maximize video window")
    public void maximizeVideoWindowTest(){
        elementActions.clickElement(accountHomePage.fullScreenButton);
        assertTrue(accountHomePage.fullScreenButton.isEnabled());
    }

    @Test(priority = 3)
    @Description("Check play button on the Home page")
    public void clickPlayBtn() {
        elementActions.clickElement(accountHomePage.playButton);
        assertTrue(accountHomePage.playButton.isEnabled());
        elementActions.moveToElement(accountHomePage.playButton);
        elementActions.clickElement(accountHomePage.playButton);
    }


}