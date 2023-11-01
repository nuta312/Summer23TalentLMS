package com.digital.coursesTest;

import com.digital.config.ConfigReader;
import com.digital.pages.coursesPage.CreateCoursePage;
import com.digital.utils.FakeDataProvider;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ValidTestAddCoursesPage extends CoursesBaseTest {
    @Test(priority = 0, description = "This is test meets all parameters", groups = "Smoke Tests")
    public void allMethodsValid() {
        createCoursePage.addCoursePage();
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
        Assert.assertTrue(CreateCoursePage.newCourse.stream().anyMatch(s -> s.getText().contains(nameCourse)));
        createCoursePage.homePage();


    }

    @Test(priority = 1, description = "This test checks the ability to enter the name of the int", groups = "Smoke Tests")
    public void nameIntValidTest() {
        createCoursePage.addCoursePage();
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
        Assert.assertTrue(CreateCoursePage.newCourse.stream().anyMatch(s -> s.getText().contains(nameCourse)));
        createCoursePage.homePage();
    }

    @Test(priority = 2, description = "This test checks the ability to enter the name of the symbol", groups = "Smoke Tests")
    public void nameSymbolValidTest() {
        createCoursePage.addCoursePage();
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
        Assert.assertTrue(CreateCoursePage.newCourse.stream().anyMatch(s -> s.getText().contains(nameCourse)));
        createCoursePage.homePage();
    }
}
