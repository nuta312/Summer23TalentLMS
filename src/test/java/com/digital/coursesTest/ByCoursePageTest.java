package com.digital.coursesTest;

import com.digital.BaseTest;
import com.digital.pages.coursesPage.ByCoursePage;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class ByCoursePageTest extends BaseTest {

    @Test
   void test() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.location=' https://nbu111.talentlms.com/marketplace/talentlibrary_index'");

       // driver.get("https://nbu111.talentlms.com/marketplace/talentlibrary_index");
       byCoursePage.coursesClickBtn();
       byCoursePage.buyCourseLinkClick();
       byCoursePage.clickHowTheCourseStoreWorks().closeClick();
       Thread.sleep(2000);
       byCoursePage.clickBusinessSkills()
               .clickHumanRecources()
               .clickLeaderShip()
               .clickPersonalDevolopment()
               .clickSafetyAndCompliance()
               .clickSalesAndService()
               .clickSectorSpecific().
               clickTechnology()
               .clickName()
               .clickEnglish();
        js.executeScript("arguments[0].setAttribute('style',arguments[1]);", byCoursePage.name, "border: 2px solid red");
        js.executeScript("arguments[0].click()",byCoursePage.name);
        js.executeScript("arguments[0].setAttribute('style',arguments[1]);", byCoursePage.english, "border: 2px solid red");
        js.executeScript("arguments[0].click()",byCoursePage.english);
        byCoursePage.resetClickBtn();


//        .clickName().clickEnglish().clickBusinessSkills();
    }
}
