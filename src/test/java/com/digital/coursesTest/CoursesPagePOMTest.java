package com.digital.coursesTest;
import com.digital.BaseTest;
import com.digital.pages.coursesPage.CoursesPagePOM;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CoursesPagePOMTest extends BaseTest {
    CoursesPagePOM coursesPage = new CoursesPagePOM();

    @Test
    public void CheckBoxAllTestRun(){
        driver.get("https://nbu111.talentlms.com/course/index");
        coursesPage.checkBoxAllTest();
        coursesPage.toClickSimpleHyperTextAndReturnBack();
        coursesPage.toClickSignalIconAndReturnBack();
        coursesPage.toClickPencilIconAndReturnBack();
        coursesPage.toClickMagnetIconAndClickCancel();
        coursesPage.toClickRemoveIconAndClickCancel();
    }
}