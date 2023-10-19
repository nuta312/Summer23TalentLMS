package com.digital.userCategoryTest;

import com.digital.BaseTest;
import com.digital.pages.HomePage;
import com.digital.pages.usersPage.CreateUserPage;
import com.digital.pages.usersPage.FilesPage;
import com.digital.pages.usersPage.UserHomePage;
import com.digital.pages.usersPage.components.EditFile;
import org.testng.annotations.BeforeClass;

public class UserHomePageTest extends BaseTest {
    public HomePage homePage;
    public CreateUserPage createUser;
    public FilesPage filePage;


    @BeforeClass
    void setHomePage(){
        userHomePage = new UserHomePage();
        homePage = new HomePage();
        homePage.openUserCategory();
        filePage= new FilesPage();


    }

}
