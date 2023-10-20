package com.digital.userCategoryTest;

import com.digital.BaseTest;
import com.digital.pages.HomePage;
import com.digital.pages.usersPage.CreateUserPage;
import com.digital.pages.usersPage.UserCoursesPage;
import com.digital.pages.usersPage.UserHomePage;
import com.digital.pages.usersPage.components.CheckDropMenu;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class UserHomePageTest extends BaseTest {
    public HomePage homePage;
    public CreateUserPage createUser;
    public UserCoursesPage userCoursesPage;
    public CheckDropMenu checkDropMenu;

    @BeforeClass
    void setHomePage() {
        userHomePage = new UserHomePage();
        homePage = new HomePage();
        homePage.openUserCategory();
        userCoursesPage = new UserCoursesPage();
        createUser = new CreateUserPage();
        checkDropMenu = new CheckDropMenu();
    }

    @Test(priority = 1)
    void checkDropMenu() {
        homePage = new HomePage();
        checkDropMenu.checkMenu()
                .clickActivate()
                .clickDeactivate()
                .clickDelete()
                .clickBranchAdd()
                .clickBranchRemove()
                .clickAddGroup()
                .clickRemoveGroup()
                .clickMessage();

    }

    @Test(priority = 2)
    void assertTest() {
        checkDropMenu.clickActivate();
        Assert.assertEquals(checkDropMenu.actualTextActivate, "Activate");
        checkDropMenu.clickDeactivate();
        Assert.assertEquals(checkDropMenu.actualTextDeactivate, "Deactivate");
        checkDropMenu.clickDelete();
        Assert.assertEquals(checkDropMenu.actualTextDelete, "Delete");
        checkDropMenu.clickBranchAdd();
        Assert.assertEquals(checkDropMenu.actualTextAddBranch, "Add users to branch");
        checkDropMenu.clickBranchRemove();
        Assert.assertEquals(checkDropMenu.actualTextRemoveBranch, "Remove users from branch");
        checkDropMenu.clickAddGroup();
        Assert.assertEquals(checkDropMenu.actualTextAddGroup, "Add users to group");
        checkDropMenu.clickRemoveGroup();
        Assert.assertEquals(checkDropMenu.actualTextRemoveGroup, "Remove users from group");
        checkDropMenu.clickMessage();
        Assert.assertEquals(checkDropMenu.actualTextSendMessage,"Send message");
    }

}
