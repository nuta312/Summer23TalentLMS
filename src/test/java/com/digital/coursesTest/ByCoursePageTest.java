package com.digital.coursesTest;

import com.digital.BaseTest;
import com.digital.pages.coursesPage.ByCoursePage;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ByCoursePageTest extends BaseTest {
    @Test
    void test() {
        SoftAssert soft = new SoftAssert();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        byCoursePage.coursesClickBtn().buyCourseLinkClick();
        byCoursePage.clickHowTheCourseStoreWorks();
        soft.assertTrue(byCoursePage.textAssert1.getText().contains("Ready-made courses by TalentLMS & others"));
        System.out.println(byCoursePage.textAssert1.getText());
        byCoursePage.closeClick();

        byCoursePage.clickBusinessSkills();
        soft.assertTrue(byCoursePage.textAssert2.getText().contains("Business Skills / Business Continuity Essentials"));
        System.out.println(byCoursePage.textAssert2.getText());
        byCoursePage.resetClickBtn();

        byCoursePage.clickHumanRecources();
        soft.assertTrue(byCoursePage.textAssert3.getText().contains("Human Resources / Diversity and Inclusion"));
        System.out.println(byCoursePage.textAssert3.getText());
        byCoursePage.resetClickBtn();

        byCoursePage.clickLeaderShip();
        soft.assertTrue(byCoursePage.textAssert4.getText().contains("Leadership / Adaptive Leadership"));
        System.out.println(byCoursePage.textAssert4.getText());
        byCoursePage.resetClickBtn();

        byCoursePage.clickPersonalDevolopment();
        soft.assertTrue(byCoursePage.textAssert5.getText().contains("Personal Development / Career Management"));
        System.out.println(byCoursePage.textAssert5.getText());
        byCoursePage.resetClickBtn();

        byCoursePage.clickSafetyAndCompliance();
        soft.assertTrue(byCoursePage.textAssert6.getText().contains("Safety and Compliance / Compliance Essentials"));
        System.out.println(byCoursePage.textAssert6.getText());
        byCoursePage.resetClickBtn();

        byCoursePage.clickSalesAndService();
        soft.assertTrue(byCoursePage.textAssert7.getText().contains("Sales and Service / Customer Service Applied"));
        System.out.println(byCoursePage.textAssert7.getText());
        byCoursePage.resetClickBtn();

        byCoursePage.clickSectorSpecific();
        soft.assertTrue(byCoursePage.textAssert8.getText().contains("Sector Specific / HIPAA Compliance Essentials"));
        System.out.println(byCoursePage.textAssert8.getText());
        byCoursePage.resetClickBtn();

        byCoursePage.clickTechnology();
        soft.assertTrue(byCoursePage.textAssert9.getText().contains("Technology / Artificial Intelligence Essentials"));
        System.out.println(byCoursePage.textAssert9.getText());
        byCoursePage.resetClickBtn();

        byCoursePage.clickName();
        soft.assertTrue(byCoursePage.assertNameBtn.getText().contains("Name"));
        System.out.println(byCoursePage.assertNameBtn.getText());

        byCoursePage.clickEnglish();
        soft.assertTrue(byCoursePage.assertEnglishBtn.getText().contains("English"));
        System.out.println(byCoursePage.assertEnglishBtn.getText());

    }
}
