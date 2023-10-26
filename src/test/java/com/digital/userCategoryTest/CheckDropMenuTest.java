package com.digital.userCategoryTest;

import com.digital.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckDropMenuTest extends UserHomePageTest {

    @Test(priority = 1)
    void checkDropMenu() {
        homePage = new HomePage();
        checkDropMenu.clickAllChecBox();
        Assert.assertTrue(checkDropMenu.isCheckt);
        checkDropMenu.massActionsList();
        Assert.assertEquals(checkDropMenu.actualTextList.toString(), checkDropMenu.visiblText);
    }

    @Test(priority = 2)
    void checkMassAction() {
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
        Assert.assertEquals(checkDropMenu.actualTextSendMessage, "Send message");
    }
    @Test(priority = 3)
    void CheckFilterIcon(){
        checkDropMenu.getAllUsersInTable();
        checkDropMenu.activeUserFilter()
         .getFilterUsersInTable();
        Assert.assertEquals(checkDropMenu.usersListInTable,checkDropMenu.usersInTableToActive);
        checkDropMenu.onClickActivFilter();
    }
}
