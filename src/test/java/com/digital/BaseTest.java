package com.digital;

import com.digital.config.ConfigReader;
import com.digital.driver.Driver;
import com.digital.pages.HomePage;
import com.digital.pages.LoginPage;
import com.digital.pages.usersPage.UserHomePage;
import com.digital.pages.usersPage.components.CheckTableOptions;
import com.digital.utils.FakeDataProvider;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import com.digital.pages.coursesPage.CreateCoursePage;

public abstract class BaseTest {

    public WebDriver driver;
    public LoginPage loginPage;
    public UserHomePage userHomePage;

    public HomePage homePage;
    public CreateCoursePage createCoursePage;


    public FakeDataProvider fakeDataProvider;
    @BeforeClass(alwaysRun = true)
    public void setUpBrowser() {
        driver = Driver.getDriver();
        loginPage = new LoginPage();
        driver.get(ConfigReader.getProperty("BASE_URL"));
        loginPage.logIn();
        homePage = new HomePage();
        createCoursePage= new CreateCoursePage();
        fakeDataProvider = new FakeDataProvider();
    }

//    @AfterClass(alwaysRun = true)
//    public void tearDown(){
//        Driver.closeDriver();
//    }

}
