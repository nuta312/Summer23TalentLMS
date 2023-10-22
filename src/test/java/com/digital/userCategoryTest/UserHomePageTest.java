package com.digital.userCategoryTest;
import com.digital.BaseTest;
import com.digital.pages.HomePage;
import com.digital.pages.usersPage.CreateUserPage;
import com.digital.pages.usersPage.FilesPage;
import com.digital.pages.usersPage.UserHomePage;
import com.digital.pages.usersPage.components.EditFile;
import com.digital.pages.usersPage.UserCoursesPage;
import com.digital.pages.usersPage.UserHomePage;
import com.digital.pages.usersPage.components.AddFile;
import com.digital.pages.usersPage.components.CheckDropMenu;
import com.digital.pages.usersPage.components.UserTable;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class UserHomePageTest extends BaseTest {
    public HomePage homePage;
    public CreateUserPage createUser;

    public FilesPage filePage;


    public UserCoursesPage userCoursesPage;
    public CheckDropMenu checkDropMenu;

    public EditFile editFile;

    public UserTable userTable;
    public AddFile addFile;




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
    }


    @Test(priority = 2)
    void assertTest(){
        checkDropMenu.clickActivate();
        Assert.assertEquals(checkDropMenu.actualTextActivate,"Activate");
        checkDropMenu.clickDeactivate();
        Assert.assertEquals(checkDropMenu.actualTextDeactivate,"Deactivate");
        checkDropMenu.clickDelete();
        Assert.assertEquals(checkDropMenu.actualTextDelete,"Delete");
        checkDropMenu.clickBranchAdd();
        Assert.assertEquals(checkDropMenu.actualTextAddBranch,"Add users to branch");
        checkDropMenu.clickBranchRemove();
        Assert.assertEquals(checkDropMenu.actualTextRemoveBranch,"Remove users from branch");
        checkDropMenu.clickAddGroup();
        Assert.assertEquals(checkDropMenu.actualTextAddGroup,"Add users to group");
        checkDropMenu.clickRemoveGroup();
        Assert.assertEquals(checkDropMenu.actualTextRemoveGroup,"Remove users from group");


    }

}
