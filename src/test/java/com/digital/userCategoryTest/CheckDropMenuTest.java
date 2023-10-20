package com.digital.userCategoryTest;

import com.digital.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckDropMenuTest extends UserHomePageTest{
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
