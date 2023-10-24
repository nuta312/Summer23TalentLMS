package com.digital.coursesTest;

import com.digital.config.ConfigReader;
import com.digital.CoursesCategoriesBaseTest;
import com.digital.pages.coursesPage.CreateCoursePage;
import com.digital.utils.FakeDataProvider;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.FileNotFoundException;

public class ValidTestAddCoursesPage extends CoursesCategoriesBaseTest {
    @Test (priority = 0, description = "This is test meets all parameters")
    public void allMethodsValid() throws AWTException, FileNotFoundException {
        driver.get(ConfigReader.getProperty("COURSE_CREATE_URL"));
        String generatedBio = FakeDataProvider.generateLongText(50);
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
                .pictureInput()
                .saveBtn();
        driver.get(ConfigReader.getProperty("COURSE_INDEX"));
        Assert.assertTrue(CreateCoursePage.newCourse.stream().anyMatch(s-> s.getText().contains(nameCourse)));


    }

    @Test (priority = 1, description = "This test checks the ability to enter the name of the int")
    public void nameIntValidTest() {
        driver.get(ConfigReader.getProperty("COURSE_CREATE_URL"));
        String nameCourse = "55";
        String generatedBio = FakeDataProvider.generateLongText(50);
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
                .pictureInput()
                .saveBtn();
        driver.get(ConfigReader.getProperty("COURSE_INDEX"));
        Assert.assertTrue(CreateCoursePage.newCourse.stream().anyMatch(s-> s.getText().contains(nameCourse)));
    }

    @Test (priority = 2, description = "This test checks the ability to enter the name of the symbol")
    public void nameSymbolValidTest() {
        driver.get(ConfigReader.getProperty("COURSE_CREATE_URL"));
        String nameCourse = "!@#$%^&*(";
        String generatedBio = FakeDataProvider.generateLongText(50);
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
                .pictureInput()
                .saveBtn();
        Assert.assertTrue(CreateCoursePage.newCourse.stream().anyMatch(s-> s.getText().contains(nameCourse)));
    }
}
