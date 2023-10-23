package com.digital.coursesTest.addCoursesTest;

import com.digital.utils.FakeDataProvider;
import org.testng.annotations.Test;

import java.awt.*;


public class AllTest extends CoursesHomePageTest {
    @Test
    public void testDiscriptionInvalidAllValid() throws AWTException {
        String generatedBio = FakeDataProvider.generateLongText(1000);
        driver.get("https://nbu111.talentlms.com/course/create");
        createCoursePage.nameInput(FakeDataProvider.generateFakeFirstName())
                .choosyCategory("it")
                .descriptionInput(generatedBio)
                .courseCode(FakeDataProvider.generateLogin())
                .priceInput(FakeDataProvider.generateSalary()+"")
                .inputVideo()
                .capacityInput(FakeDataProvider.generateAge()+"")
                .selectDate("30")
                .selectCertificate("Fan")
                .selectDurations("Custom")
                .moveSlider()
                .levelInput("3")
                //  .pictureInput()
                .saveBtn();
        soft.assertTrue(createCoursePage.exceptionTextOfDescription.getText().contains("cannot exceed 5000 characters"));
        System.out.println(createCoursePage.exceptionTextOfDescription.getText());
        soft.assertAll();
    }


}

