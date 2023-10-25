package com.digital.userCategoryTest;

import org.testng.Assert;
import org.testng.annotations.Test;
//eliza

public class UserGroupTest extends UserHomePageTest {
    @Test(priority = 1,groups = "RegressionTests")
    void testGroupPage() {
        userGroupsPage.clickPersonBtn().clickGroupBtn();
    }

    @Test(priority = 2,groups = "RegressionTests")
    void testAssertGroup() {
        userGroupsPage.clickPersonBtn().clickGroupBtn();
        Assert.assertEquals(userGroupsPage.actualText, "You do not belong in any group");
    }
}
