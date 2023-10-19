package com.digital;

import com.digital.pages.HomePage;
import org.testng.annotations.Test;

public class TalentLMS extends BaseTest {
    @Test
    public void test (){
        driver.get("https://nbu111.talentlms.com/index");

    }
    @Test
    void userCoursesPage () {
        homePage = new HomePage();
        userCoursesPage.clickCheckBoxUser();
        userCoursesPage.clickMassActions();
        userCoursesPage.clickActivate();
        userCoursesPage.closeFrame();
        userCoursesPage.clickMassActions();
        userCoursesPage.clickDelete();
        userCoursesPage.closeFrame();
        userCoursesPage.clickMassActions();
        userCoursesPage.clickDeactivate();
        userCoursesPage.closeFrame();

    }
}
