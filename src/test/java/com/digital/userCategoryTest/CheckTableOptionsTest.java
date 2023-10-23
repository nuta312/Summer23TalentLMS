package com.digital.userCategoryTest;


import com.digital.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckTableOptionsTest extends UserHomePageTest{
    @Test
    void checkTable(){
        checkTableOptions.clickToReportsBtn();
        Assert.assertEquals(checkTableOptions.textSuperAdmin.getAttribute("innerText"), "SUPERADMIN");
        checkTableOptions.elementActions.navigateBack();
    }
}
