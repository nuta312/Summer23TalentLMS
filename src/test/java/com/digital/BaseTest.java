package com.digital;
import com.digital.config.ConfigReader;
import com.digital.driver.Driver;
import com.digital.pages.HomePage;
import com.digital.pages.LoginPage;
import com.digital.pages.accountSettingsPage.AccountSettingsPage;
import com.digital.pages.accountSettingsPage.CertificatesPage;
import com.digital.pages.usersPage.EditUserInfoPage;
import com.digital.pages.usersPage.UserCoursesPage;
import com.digital.pages.usersPage.UserHomePage;
import com.digital.pages.usersPage.components.CheckTableOptions;
import com.digital.utils.FakeDataProvider;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import com.digital.pages.coursesPage.CategoriesPage;

public abstract class BaseTest {

    public WebDriver driver;
    public LoginPage loginPage;
    public AccountSettingsPage accountSettingsPage;
    public CertificatesPage certificatesPage;
    public UserHomePage userHomePage;
    public UserCoursesPage userCoursesPage;
    public HomePage homePage;

    public CheckTableOptions checkTableOptions;
    public EditUserInfoPage editUserInfoPage;

    public FakeDataProvider fakeDataProvider;
    public CategoriesPage categoriesPage;



    @BeforeClass(alwaysRun = true)
    public void setUpBrowser() {
        driver = Driver.getDriver();
        loginPage = new LoginPage();
        driver.get(ConfigReader.getProperty("BASE_URL"));
        loginPage.logIn();
        editUserInfoPage = new EditUserInfoPage();
        homePage = new HomePage();
        fakeDataProvider = new FakeDataProvider();
        userCoursesPage = new UserCoursesPage();
        categoriesPage = new CategoriesPage();
    }

//    @AfterClass(alwaysRun = true)
//    public void tearDown() {
//        Driver.closeDriver();
//    }


}