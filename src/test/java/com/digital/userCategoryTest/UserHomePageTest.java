package com.digital.userCategoryTest;

import com.digital.BaseTest;
import com.digital.pages.HomePage;
import com.digital.pages.usersPage.CreateUserPage;
import com.digital.pages.usersPage.UserHomePage;
import org.testng.annotations.BeforeClass;

public class UserHomePageTest extends BaseTest {
    public HomePage homePage;
    public CreateUserPage createUser;

    @BeforeClass
    void setHomePage(){
        userHomePage = new UserHomePage();
        homePage = new HomePage();
        homePage.openUserCategory();
        createUser = new CreateUserPage();
    }

}
