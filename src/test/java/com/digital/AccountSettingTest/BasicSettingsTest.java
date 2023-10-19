package com.digital.AccountSettingTest;

import com.digital.BaseTest;
import com.digital.pages.accountSettings.BasicSettings;
import com.fasterxml.jackson.databind.cfg.BaseSettings;
import org.testng.annotations.Test;

public class BasicSettingsTest extends BaseTest {

@Test
    void fillUpBasicSettings(){


    driver.get("https://nbu111.talentlms.com/account/basic_index");
    basicSettings = new BasicSettings();
    basicSettings.fillUpTheSiteName("");
    basicSettings.fillUpTheSiteDescription("Basic Settings");
basicSettings.selectLanguage();
basicSettings.choosingLanguageInput();
basicSettings.inputTheTimeZone();
basicSettings.inputDefaultZone();

basicSettings.inputDateFormat();
basicSettings.dateFormatClick();

}
}
