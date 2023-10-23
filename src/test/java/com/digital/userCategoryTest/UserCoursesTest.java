package com.digital.userCategoryTest;
import com.beust.ah.A;
import com.digital.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserCoursesTest extends UserHomePageTest {

    @Test (priority = 1)
    void userCoursePage1() {
        homePage = new HomePage();
        userCoursesPage.clickUserName();
        Assert.assertTrue(Boolean.parseBoolean(userCoursesPage.userNameIsDisplayed));
        userCoursesPage.clickCourses();
        Assert.assertTrue(Boolean.parseBoolean(userCoursesPage.coursesIsDisplayed));
        userCoursesPage.clickCheckBox();
        Assert.assertFalse(userCoursesPage.checkBoxAction);
        userCoursesPage.clickMassActions1();
        Assert.assertTrue(Boolean.parseBoolean(userCoursesPage.coursesIsDisplayed));
        userCoursesPage.clickEnrollAction();
        Assert.assertEquals(userCoursesPage.enrollActualText,"Enroll");
        userCoursesPage.clickMassActions1();
        userCoursesPage.clickUnenrollAction();
        Assert.assertEquals(userCoursesPage.unenrollActualText, "Unenroll");
        userCoursesPage.closeClick();
        Assert.assertTrue(Boolean.parseBoolean(userCoursesPage.closeBtnIsDisplayed));
        userCoursesPage.clickMassActions1();
        userCoursesPage.clickResetProgress();
        Assert.assertEquals(userCoursesPage.resetProgressActualText,"Reset progress");

      }

      }

