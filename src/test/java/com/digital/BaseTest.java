package com.digital;
import com.digital.config.ConfigReader;
import com.digital.driver.Driver;
import com.digital.helper.ElementActions;
import com.digital.pages.HomePage;
import com.digital.pages.LoginPage;
<<<<<<< HEAD

=======
import com.digital.pages.accountSettingsPage.AccountHomePage;
import com.digital.pages.usersPage.UserHomePage;
>>>>>>> master
import com.digital.pages.accountSettingsPage.AccountSettingsPage;
import com.digital.pages.accountSettingsPage.CertificatesPage;
import com.digital.pages.usersPage.EditUserInfoPage;
import com.digital.utils.FakeDataProvider;

import com.digital.pages.accountSettings.BasicSettings;
import com.digital.pages.usersPage.UserHomePage;
import com.digital.pages.usersPage.components.CheckTableOptions;
import com.fasterxml.jackson.databind.cfg.BaseSettings;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import com.digital.pages.coursesPage.ByCoursePage;
import com.digital.pages.coursesPage.CategoriesPage;

public abstract class BaseTest {
<<<<<<< HEAD


    public BasicSettings basicSettings;

=======
>>>>>>> master
    public WebDriver driver;
    public LoginPage loginPage;
    public AccountSettingsPage accountSettingsPage;
    public CertificatesPage certificatesPage;
    public UserHomePage userHomePage;
    public HomePage homePage;
    public FakeDataProvider fakeDataProvider;
    public CategoriesPage categoriesPage;
    public AccountHomePage accountHomePage;
    public ElementActions elementActions;
    public ByCoursePage byCoursePage;

    @BeforeClass(alwaysRun = true)
    public void setUpBrowser() {
        driver = Driver.getDriver();
        loginPage = new LoginPage();
        driver.get(ConfigReader.getProperty("BASE_URL"));
        loginPage.logIn();
        homePage = new HomePage();
        fakeDataProvider = new FakeDataProvider();
        byCoursePage = new ByCoursePage();
        categoriesPage = new CategoriesPage();
        accountHomePage= new AccountHomePage();
        elementActions = new ElementActions();
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        Driver.closeDriver();
    }


}