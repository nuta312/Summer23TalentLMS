package com.digital.coursesTest;

import com.digital.BaseTest;
import org.testng.annotations.Test;

public class addCoursesTest extends BaseTest {
    @Test
    public void test() throws InterruptedException {
        driver.get("https://nbu111.talentlms.com/course/create");
        Thread.sleep(5000);
       createCoursePage.allMethods();

    }
}
