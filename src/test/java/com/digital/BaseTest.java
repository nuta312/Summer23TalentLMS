package com.digital;

import com.digital.driver.Driver;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public abstract class BaseTest {
    public WebDriver driver;
    @BeforeClass(alwaysRun = true)
    public void setUpBrowser() {
        driver = Driver.getDriver();

    }

    @AfterClass(alwaysRun = true)
    public void tearDown(){
        Driver.closeDriver();
    }

}
