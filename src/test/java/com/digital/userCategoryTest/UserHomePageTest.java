package com.digital.userCategoryTest;

import com.digital.BaseTest;
import com.digital.pages.HomePage;
import com.digital.pages.usersPage.CreateUserPage;
import com.digital.pages.usersPage.UserHomePage;
import com.digital.pages.usersPage.components.CheckTableOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class UserHomePageTest extends BaseTest {
    public HomePage homePage;
    public CreateUserPage createUser;
    public CheckTableOptions checkTableOptions;

    @BeforeClass
    void setHomePage(){
        userHomePage = new UserHomePage();
        homePage = new HomePage();
        homePage.openUserCategory();
        checkTableOptions = new CheckTableOptions();

    }
    public UserHomePageTest checkAdminText(){
        Assert.assertEquals(checkTableOptions.textSuperAdmin.getAttribute("innerText"), "SUPERADMIN");
        return this;
    }
    @Test
    void checkTable(){
        checkTableOptions.clickToReportsBtn();
        checkAdminText();
        checkTableOptions.elementActions.navigateBack();
    }

}
