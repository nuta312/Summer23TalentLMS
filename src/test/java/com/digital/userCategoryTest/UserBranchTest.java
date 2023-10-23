package com.digital.userCategoryTest;

import com.digital.pages.usersPage.UserBranchPage;
import org.testng.Assert;
import org.testng.annotations.Test;
//eliza

public class UserBranchTest extends UserHomePageTest{
    UserBranchPage userBranchPage=new UserBranchPage();

    @Test(priority = 1)
    void testBranchPage(){
        userBranchPage.clickPersonBranchBtn().clickBranchBtn();
    }
    @Test(priority = 2)
    void testAssertBranch(){
        userBranchPage.clickPersonBranchBtn().clickBranchBtn();
        Assert.assertEquals(userBranchPage.actualBranchText,"You do not belong in any branch");
    }
}
