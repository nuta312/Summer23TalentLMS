package com.digital;

import com.digital.driver.Driver;

import com.digital.pages.BuyCoursesPage;
import com.digital.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public abstract class BaseTest {
    public WebDriver driver;
    public LoginPage loginPage;
    public BuyCoursesPage buyCoursesPage;

    @BeforeClass(alwaysRun = true)
    public void setUpBrowser() {
        driver = Driver.getDriver();
        loginPage = new LoginPage();
        driver.get("https://nbu111.talentlms.com/dashboard");
        loginPage.logIn();
    }
    @Test()
    public void marketPlace(){
        driver=Driver.getDriver();
        driver.get("https://nbu111.talentlms.com/marketplace/talentlibrary_index");
        buyCoursesPage.navigateMarket();
    }

//    @AfterClass(alwaysRun = true)
//    public void tearDown(){
//        Driver.closeDriver();
//    }

}
