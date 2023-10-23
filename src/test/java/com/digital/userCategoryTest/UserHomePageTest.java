package com.digital.userCategoryTest;

import com.digital.BaseTest;
import com.digital.pages.HomePage;
import com.digital.pages.usersPage.*;
import com.digital.pages.usersPage.components.CheckDropMenu;
import com.digital.pages.usersPage.components.UserTable;
import org.testng.annotations.BeforeClass;


public class UserHomePageTest extends BaseTest {
    public HomePage homePage;
    public CreateUserPage createUser;
    public FilesPage filePage;
    public UserCoursesPage userCoursesPage;
    public CheckDropMenu checkDropMenu;
    public UserTable userTable;
    public UserBranchPage userBranchPage;
    public UserGroupsPage userGroupsPage;
    public EditUserInfoPage editUserInfoPage;


    @BeforeClass
    void setHomePage() {
        userHomePage = new UserHomePage();
        homePage = new HomePage();
        homePage.openUserCategory();
        filePage = new FilesPage();
        userCoursesPage = new UserCoursesPage();
        createUser = new CreateUserPage();
        checkDropMenu = new CheckDropMenu();
        userTable = new UserTable();
        userBranchPage = new UserBranchPage();
        userGroupsPage = new UserGroupsPage();
        editUserInfoPage = new EditUserInfoPage();
    }
}


