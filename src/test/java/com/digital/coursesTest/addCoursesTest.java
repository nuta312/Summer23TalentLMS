package com.digital.coursesTest;

import com.digital.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

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
        Assert.assertTrue(createCoursePage.text1.getText().contains("'Course name' cannot exceed 100 characters"));
        Assert.assertTrue(createCoursePage.text1.getText().contains("This is not a valid 'Price'"));
        Assert.assertTrue(createCoursePage.text1.getText().contains("'Description' cannot exceed 5000 characters"));
        System.out.println(createCoursePage.text1.getText());


    }

}
