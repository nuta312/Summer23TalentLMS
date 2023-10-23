package com.digital.userCategoryTest;

import com.digital.BaseTest;
import com.digital.pages.usersPage.UserGroupsPage;
import org.testng.Assert;
import org.testng.annotations.Test;
//eliza

public class UserGroupTest extends UserHomePageTest {
    UserGroupsPage userGroupsPage = new UserGroupsPage();
    @Test(priority = 1)
    void testGroupPage(){
         userGroupsPage.clickPersonBtn().clickGroupBtn();
    }
    @Test(priority = 2)
    void testAssertGroup(){
        userGroupsPage.clickPersonBtn().clickGroupBtn();
        Assert.assertEquals(userGroupsPage.actualText,"You do not belong in any group");
    }
}
