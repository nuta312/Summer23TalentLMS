package com.digital;

import com.digital.pages.ByCoursePage;
import org.testng.annotations.Test;

public class ByCoursePageTest extends BaseTest{
ByCoursePage byCoursePage = new ByCoursePage();
    @Test
   void test() throws InterruptedException {

        driver.get("https://nbu111.talentlms.com/marketplace/talentlibrary_index");
//        byCoursePage.clickByCourse();
       Thread.sleep(4000);
       byCoursePage.clickHowTheCourseStoreWorks().closeClick();
       Thread.sleep(2000
       );
       byCoursePage.clickName().clickEnglish().clickBusinessSkills().clickHumanRecources().clickLeaderShip().clickPersonalDevolopment().clickSafetyAndCompliance().clickSalesAndService()
                       .clickSectorSpecific().clickTechnology();


//        .clickName().clickEnglish().clickBusinessSkills();
    }
}
