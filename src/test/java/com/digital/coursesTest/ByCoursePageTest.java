package com.digital.coursesTest;

import com.digital.BaseTest;
import com.digital.pages.coursesPage.ByCoursePage;
import org.testng.annotations.Test;

public class ByCoursePageTest extends BaseTest {

    @Test
   void test() throws InterruptedException {

        driver.get("https://nbu111.talentlms.com/marketplace/talentlibrary_index");
//        byCoursePage.clickByCourse();
       Thread.sleep(4000);
       byCoursePage.clickHowTheCourseStoreWorks().closeClick();
       Thread.sleep(2000);
       byCoursePage.clickName()
               .clickEnglish()
               .clickBusinessSkills()
               .clickHumanRecources()
               .clickLeaderShip()
               .clickPersonalDevolopment()
               .clickSafetyAndCompliance()
               .clickSalesAndService()
               .clickSectorSpecific().
               clickTechnology();


//        .clickName().clickEnglish().clickBusinessSkills();
    }
}
