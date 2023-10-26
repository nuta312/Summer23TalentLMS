package com.digital.userCategoryTest;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class UserCoursesTest extends UserHomePageTest {


    @BeforeClass
    void navigateToCoursesPage() {
        userCoursesPage.clickUserName();
        Assert.assertTrue(Boolean.parseBoolean(userCoursesPage.userNameIsDisplayed));
        userCoursesPage.clickCourses();
        Assert.assertTrue(Boolean.parseBoolean(userCoursesPage.coursesIsDisplayed));
    }

    @Test(priority = 1)
    void userCoursePage1() {
        userCoursesPage.clickCheckBox();
        Assert.assertFalse(userCoursesPage.checkBoxAction);
        userCoursesPage.clickMassActions1();
        Assert.assertTrue(Boolean.parseBoolean(userCoursesPage.coursesIsDisplayed));
        userCoursesPage.clickEnrollAction();
        Assert.assertEquals(userCoursesPage.enrollActualText, "Enroll");
        userCoursesPage.clickMassActions1();
        userCoursesPage.clickUnenrollAction();
        Assert.assertEquals(userCoursesPage.unenrollActualText, "Unenroll");
        userCoursesPage.closeClick();
        Assert.assertTrue(Boolean.parseBoolean(userCoursesPage.closeBtnIsDisplayed));
        userCoursesPage.clickMassActions1();
        userCoursesPage.clickResetProgress();
        Assert.assertEquals(userCoursesPage.resetProgressActualText, "Reset progress");
    }

    @Test(priority = 2, description = "this test checks the tabs on the course user page")
    void checkTabsInCoursesPage() {
        userCoursesPage.clickToProfileTab();
        Assert.assertTrue(userCoursesPage.profileUrl.contains("/user/courses/id:"));
        userCoursesPage.clickToProgressTab();
        System.out.println(userCoursesPage.progressUrl);
        Assert.assertTrue(userCoursesPage.progressUrl.contains("/reports/userinfo/id"));
        System.out.println(userCoursesPage.progressUrl);
        userCoursesPage.clickToInfographicTab();
        System.out.println(userCoursesPage.infographicUrl);
        Assert.assertTrue(userCoursesPage.infographicUrl.contains("/reports/userinfographics/id:"));

    }


}

