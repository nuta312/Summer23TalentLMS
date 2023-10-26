package com.digital.userCategoryTest;

import org.testng.Assert;
import org.testng.annotations.Test;
//eliza

public class UserBranchTest extends UserHomePageTest {

    @Test(priority = 1,groups = "RegressionTests")
    void testBranchPage() {
        userBranchPage.clickPersonBranchBtn().clickBranchBtn();
    }

    @Test(priority = 2,groups = "RegressionTests")
    void testAssertBranch() {
        userBranchPage.clickPersonBranchBtn().clickBranchBtn();
        Assert.assertEquals(userBranchPage.actualBranchText, "You do not belong in any branch");
    }
}
