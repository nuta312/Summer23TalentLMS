package com.digital;

import com.digital.driver.Driver;
import com.digital.pages.HomePage;
import com.digital.pages.LoginPage;
import com.digital.pages.accountSettings.BasicSettings;
import com.digital.pages.usersPage.UserHomePage;
import com.digital.pages.usersPage.components.CheckTableOptions;
import com.fasterxml.jackson.databind.cfg.BaseSettings;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;

public abstract class BaseTest {

    public BasicSettings basicSettings;
    public WebDriver driver;
    public LoginPage loginPage;
    public UserHomePage userHomePage;

    public HomePage homePage;
    public CheckTableOptions checkTableOptions;
    @BeforeClass(alwaysRun = true)
    public void setUpBrowser() {
        driver = Driver.getDriver();
        loginPage = new LoginPage();
        driver.get("https://nbu111.talentlms.com/dashboard");
        loginPage.logIn();
        homePage = new HomePage();
    }

//    @AfterClass(alwaysRun = true)
//    public void tearDown(){
//        Driver.closeDriver();
//    }

}
