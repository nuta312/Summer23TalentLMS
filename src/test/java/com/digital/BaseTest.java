package com.digital;

import com.digital.config.ConfigReader;
import com.digital.driver.Driver;
import com.digital.helper.ElementActions;
import com.digital.pages.HomePage;
import com.digital.pages.LoginPage;
import com.digital.pages.accountSettingsPage.AccountHomePage;
import com.digital.pages.usersPage.UserHomePage;
import com.digital.pages.accountSettingsPage.AccountSettingsPage;
import com.digital.pages.accountSettingsPage.CertificatesPage;
import com.digital.utils.FakeDataProvider;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import com.digital.pages.coursesPage.CategoriesPage;

public abstract class BaseTest {
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



    @BeforeClass(alwaysRun = true)
    public void setUpBrowser() {
        driver = Driver.getDriver();
        loginPage = new LoginPage();
        driver.get(ConfigReader.getProperty("BASE_URL"));
        loginPage.logIn();
        homePage = new HomePage();
        fakeDataProvider = new FakeDataProvider();
        categoriesPage = new CategoriesPage();
        accountHomePage= new AccountHomePage();
        elementActions = new ElementActions();

    }

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        Driver.closeDriver();
    }


}