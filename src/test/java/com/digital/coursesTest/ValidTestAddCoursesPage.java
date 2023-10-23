package com.digital.coursesTest;

import com.digital.config.ConfigReader;
import com.digital.CoursesCategoriesBaseTest;
import com.digital.pages.coursesPage.CreateCoursePage;
import com.digital.utils.FakeDataProvider;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.awt.*;

public class ValidTestAddCoursesPage extends CoursesCategoriesBaseTest {
    @Test
    public void allMethodsValid() throws AWTException {
        driver.get(ConfigReader.getProperty("COURSE_CREATE_URL"));
        String generatedBio = FakeDataProvider.generateLongText(200);
        String nameCourse = "Java";
        createCoursePage.nameInput(nameCourse)
                .choosyCategory("it")
                .descriptionInput(generatedBio)
                .courseCode(FakeDataProvider.generateLogin())
                .priceInput(FakeDataProvider.generateSalary() + "")
                .inputVideo()
                .capacityInput(FakeDataProvider.generateAge() + "")
                .selectDate("30")
                .selectCertificate("Fan")
                .selectDurations("Custom")
                .moveSlider()
                .levelInput("3")
                // .pictureInput()
                .saveBtn();
        driver.get(ConfigReader.getProperty("COURSE_INDEX"));
        try {
            for (WebElement val : CreateCoursePage.newCourse) {
                if (val.getText().contains(nameCourse)) {
                }
            }
        } catch (RuntimeException exception) {
        }
    }

    @Test
    public void nameIntValidTest() {
        driver.get(ConfigReader.getProperty("COURSE_CREATE_URL"));
        String nameCourse = "55";
        String generatedBio = FakeDataProvider.generateLongText(100);
        createCoursePage.nameInput(nameCourse)
                .choosyCategory("it")
                .descriptionInput(generatedBio)
                .courseCode(FakeDataProvider.generateLogin())
                .priceInput(FakeDataProvider.generateSalary() + "")
                .inputVideo()
                .capacityInput(FakeDataProvider.generateAge() + "")
                .selectDate("30")
                .selectCertificate("Fan")
                .selectDurations("Custom")
                .moveSlider()
                .levelInput("3")
                //  .pictureInput()
                .saveBtn();
        driver.get(ConfigReader.getProperty("COURSE_INDEX"));
        try {
            for (WebElement val : CreateCoursePage.newCourse) {
                if (val.getText().contains(nameCourse)) {
                }
            }
        } catch (RuntimeException exception) {
        }
    }

    @Test
    public void nameSymbolValidTest() {
        driver.get(ConfigReader.getProperty("COURSE_CREATE_URL"));
        String nameCourse = "!@#$%^&*(";
        String generatedBio = FakeDataProvider.generateLongText(200);
        createCoursePage.nameInput(nameCourse)
                .choosyCategory("it")
                .descriptionInput(generatedBio)
                .courseCode(FakeDataProvider.generateLogin())
                .priceInput(FakeDataProvider.generateSalary() + "")
                .inputVideo()
                .capacityInput(FakeDataProvider.generateAge() + "")
                .selectDate("30")
                .selectCertificate("Fan")
                .selectDurations("Custom")
                .moveSlider()
                .levelInput("3")
                //  .pictureInput()
                .saveBtn();
        for (WebElement val : CreateCoursePage.newCourse) {
            if (val.getText().contains(nameCourse)) {
            }
        }
    }
}
