package com.digital.userCategoryTest;
import com.digital.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserCoursesTest extends UserHomePageTest {

    @Test (priority = 1)
    void userCoursePage1() {
        homePage = new HomePage();
        userCoursesPage.clickUserName();
        userCoursesPage.clickCourses();
        userCoursesPage.clickCheckBox();
        userCoursesPage.clickMassActions1();
        userCoursesPage.clickEnrollAction();
        Assert.assertEquals(userCoursesPage.enrollActualText,"Enroll");
        userCoursesPage.clickMassActions1();
        userCoursesPage.clickUnenrollAction();
        Assert.assertEquals(userCoursesPage.unenrollActualText, "Unenroll");
        userCoursesPage.closeClick();
        userCoursesPage.clickMassActions1();
        userCoursesPage.clickResetProgress();
        Assert.assertEquals(userCoursesPage.resetProgressActualText,"Reset progress");

      }

      }

