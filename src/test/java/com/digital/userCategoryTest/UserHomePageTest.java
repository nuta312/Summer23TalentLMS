package com.digital.userCategoryTest;

import com.digital.BaseTest;
import com.digital.pages.HomePage;
import com.digital.pages.usersPage.CreateUserPage;
import com.digital.pages.usersPage.UserCoursesPage;
import com.digital.pages.usersPage.UserHomePage;
import org.testng.annotations.BeforeClass;

public class UserHomePageTest extends BaseTest {
    public HomePage homePage;
    public CreateUserPage createUser;
    public UserCoursesPage userCoursesPage;

    @BeforeClass
    void setHomePage(){
        userHomePage = new UserHomePage();
        homePage = new HomePage();
        homePage.openUserCategory();
        userCoursesPage = new UserCoursesPage();
        createUser = new CreateUserPage();
    }

}
