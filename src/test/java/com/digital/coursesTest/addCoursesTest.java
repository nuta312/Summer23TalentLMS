package com.digital.coursesTest;

import com.digital.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class addCoursesTest extends BaseTest {
    @Test
    public void test() throws InterruptedException {
        driver.get("https://nbu111.talentlms.com/course/create");
       createCoursePage.allMethodsPozitiv();
    }
    @Test
    public void test2() throws InterruptedException {
        driver.get("https://nbu111.talentlms.com/course/create");
        createCoursePage.allMethodsNegativ();
        System.out.println(createCoursePage.text1.getText());
        SoftAssert soft= new SoftAssert();
        System.out.println(createCoursePage.text1.getText());
        soft.assertTrue(createCoursePage.text1.getText().contains("cannot exceed 100 characters"));
        System.out.println(createCoursePage.text1.getText());
        soft.assertTrue(createCoursePage.text1.getText().contains("This is not a valid"));
        System.out.println(createCoursePage.text1.getText());
        soft.assertTrue(createCoursePage.text1.getText().contains("cannot exceed 5000 characters"));
        soft.assertAll();

    }

}
