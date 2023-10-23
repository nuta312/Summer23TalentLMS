package com.digital.userCategoryTest;
import com.digital.BaseTest;
import com.digital.pages.HomePage;
import com.digital.pages.usersPage.CreateUserPage;
import com.digital.pages.usersPage.UserBranchPage;
import com.digital.pages.usersPage.UserGroupsPage;
import com.digital.pages.usersPage.UserHomePage;
import com.digital.pages.usersPage.FilesPage;
import com.digital.pages.usersPage.components.EditFile;
import com.digital.pages.usersPage.UserCoursesPage;
import com.digital.pages.usersPage.components.AddFile;
import com.digital.pages.usersPage.components.CheckDropMenu;
import com.digital.pages.usersPage.components.UserTable;
import org.testng.annotations.BeforeClass;

public class UserHomePageTest extends BaseTest{
    public HomePage homePage;
    public CreateUserPage createUser;
    public FilesPage filePage;
    public UserCoursesPage userCoursesPage;
    public CheckDropMenu checkDropMenu;
    public EditFile editFile;
    public UserTable userTable;
    public AddFile addFile;
    public UserBranchPage userBranchPage;
    public UserGroupsPage  userGroupsPage;

    @BeforeClass
    void setHomePage() {
        userHomePage = new UserHomePage();
        homePage = new HomePage();
        homePage.openUserCategory();
        filePage= new FilesPage();
        userCoursesPage = new UserCoursesPage();
        createUser = new CreateUserPage();
        checkDropMenu = new CheckDropMenu();
        editFile = new EditFile();
        userTable = new UserTable();
        addFile = new AddFile();
        userBranchPage = new UserBranchPage();
        userGroupsPage = new UserGroupsPage();
    }
}


