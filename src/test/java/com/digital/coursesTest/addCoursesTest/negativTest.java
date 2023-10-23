package com.digital.coursesTest.addCoursesTest;

import com.digital.utils.FakeDataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class negativTest extends CoursesHomePageTest {
    @Test
    public void aLLTestNameInvalid() throws InterruptedException {
        driver.get("https://nbu111.talentlms.com/course/create");
        String generatedBio = FakeDataProvider.generateLongText(1000);
        String firstName2 = faker.name().firstName();
        StringBuilder longName = new StringBuilder(firstName2);
        while (longName.length() < 101) {
            longName.append(firstName2);
        }
        String resultName = longName.toString().substring(0, 101);
            createCoursePage.nameInput(resultName)
                    .choosyCategory("it")
                    .descriptionInput(generatedBio)
                    .courseCode(resultName)
                    .priceInput(FakeDataProvider.generateSalary()+"LOK")
                    .inputVideo()
                    .capacityInput(resultName)
                    .selectDate("1000000")
                    .selectCertificate("Fan")
                    .selectDurations("Custom")
                    .moveSlider()
                    .levelInput("20")
                    //  .pictureInput()
                    .saveBtn();

        SoftAssert soft= new SoftAssert();
        soft.assertTrue(createCoursePage.text1.getText().contains("cannot exceed 100 characters"));
        System.out.println(createCoursePage.text1.getText());

        soft.assertTrue(createCoursePage.exceptionTextOfCourseCode.getText().contains("cannot exceed 20 characters"));
        System.out.println(createCoursePage.exceptionTextOfCourseCode.getText());

        soft.assertTrue(createCoursePage.exceptionTextOfCoursePrice.getText().contains("This is not a valid"));
        System.out.println(createCoursePage.exceptionTextOfCoursePrice.getText());

        soft.assertTrue(createCoursePage.exceptionTextOfDescription.getText().contains("cannot exceed 5000 characters"));
        System.out.println(createCoursePage.exceptionTextOfDescription.getText());
        soft.assertAll();

    }
}
