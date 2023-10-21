package com.digital.AccountSettingTest;

import com.digital.BaseTest;
import com.digital.pages.accountSettings.Themes;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AccountSettingsEnter extends BaseTest {

    public Themes themes;

    @BeforeClass
    public void BasicSettingsTest () throws InterruptedException {
        driver.get("https://nbu111.talentlms.com/index");
        Thread.sleep(5000);
        WebElement accountSetting = driver.findElement(By.xpath("//div[@class='tl-bold-link']/a[@href='https://nbu111.talentlms.com/account/basic_index']"));
        accountSetting.click();
    }
}
