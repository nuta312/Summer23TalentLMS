package com.digital;

import com.digital.driver.Driver;

<<<<<<< HEAD
import com.digital.pages.ByCoursePage;
=======
import com.digital.pages.HomePage;
>>>>>>> master
import com.digital.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public abstract class BaseTest {
    public ByCoursePage byCoursePage;
    public WebDriver driver;
    public LoginPage loginPage;

    public HomePage homePage;
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
