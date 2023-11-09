package com.digital.coursesTest;

import com.digital.config.ConfigReader;
import com.digital.utils.FakeDataProvider;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class InvalidTestAddCoursePage extends CoursesBaseTest {
    @Test (priority = 0, description = "This test checks for inconsistent data entry in Description, Price, Code,Capacity")
    public void invalidAllTest(){
        driver.get(ConfigReader.getProperty("COURSE_CREATE_URL"));
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
                .pictureInput()
                .saveBtn();

        SoftAssert soft= new SoftAssert();
        soft.assertTrue(createCoursePage.text1.getText().contains("cannot exceed 100 characters"));
        soft.assertTrue(createCoursePage.exceptionTextOfCourseCode.getText().contains("cannot exceed 20 characters"));
        soft.assertTrue(createCoursePage.exceptionTextOfCoursePrice.getText().contains("This is not a valid"));
        soft.assertTrue(createCoursePage.exceptionTextOfDescription.getText().contains("cannot exceed 5000 characters"));
        soft.assertTrue(createCoursePage.exceptionTextOfCapacity.getText().contains("This is not a valid"));
        soft.assertAll();
    }
    @Test (priority = 1, description = "This is test check exceeding title length for name course")
    public void NameLengthInvalidTest() {
        driver.get(ConfigReader.getProperty("COURSE_CREATE_URL"));
        String firstName2 = faker.name().firstName();
        StringBuilder longName = new StringBuilder(firstName2);
        String generatedBio = FakeDataProvider.generateLongText(50);
        while (longName.length() < 101) {
            longName.append(firstName2);
        }
        String resultName = longName.toString().substring(0, 101);
        createCoursePage.nameInput(resultName)
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
        Assert.assertTrue(createCoursePage.text1.getText().contains("cannot exceed 100 characters"));

    }
    @Test (priority = 2, description = "This is test check exceeding title length for description course")
    public void descriptionInvalidTest() {
        String generatedBio = FakeDataProvider.generateLongText(1000);
        driver.get(ConfigReader.getProperty("COURSE_CREATE_URL"));
        createCoursePage.nameInput(FakeDataProvider.generateFakeFirstName())
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
        Assert.assertTrue(createCoursePage.exceptionTextOfDescription.getText().contains("cannot exceed 5000 characters"));
    }
    @Test (priority = 3, description = "This is test checking the letters entered in the price field ")
    public void priceInvalidTest() {
        String generatedBio = FakeDataProvider.generateLongText(50);
        driver.get(ConfigReader.getProperty("COURSE_CREATE_URL"));
        createCoursePage.nameInput(FakeDataProvider.generateFakeFirstName())
                .choosyCategory("it")
                .descriptionInput(generatedBio)
                .courseCode(FakeDataProvider.generateLogin())
                .priceInput(FakeDataProvider.generateFakeFirstName())
                .inputVideo()
                .capacityInput(FakeDataProvider.generateAge() + "")
                .selectDate("30")
                .selectCertificate("Fan")
                .selectDurations("Custom")
                .moveSlider()
                .levelInput("3")
                .pictureInput()
                .saveBtn();
        Assert.assertTrue(createCoursePage.exceptionTextOfCoursePrice.getText().contains("This is not a valid"));

    }

    @Test (priority = 4, description = "This is test checking negative value in price")
    public void priceInvalidTestMinus() {
        String generatedBio = FakeDataProvider.generateLongText(50);
        driver.get(ConfigReader.getProperty("COURSE_CREATE_URL"));
        createCoursePage.nameInput(FakeDataProvider.generateFakeFirstName())
                .choosyCategory("it")
                .descriptionInput(generatedBio)
                .courseCode(FakeDataProvider.generateLogin())
                .priceInput("-" + FakeDataProvider.generateSalary())
                .inputVideo()
                .capacityInput(FakeDataProvider.generateAge() + "")
                .selectDate("30")
                .selectCertificate("Fan")
                .selectDurations("Custom")
                .moveSlider()
                .levelInput("3")
                .pictureInput()
                .saveBtn();
        Assert.assertTrue(createCoursePage.exceptionTextOfCoursePrice.getText().contains("This is not a valid"));
    }
    @Test (priority = 5, description = "This is test check exceeding title length for price course")
    public void codeInvalidTest() {
        driver.get(ConfigReader.getProperty("COURSE_CREATE_URL"));
        String code = faker.name().firstName();
        StringBuilder longName = new StringBuilder(code);
        String generatedBio = FakeDataProvider.generateLongText(50);
        while (longName.length() < 30) {
            longName.append(code);
        }
        String codeResult = longName.toString().substring(0, 30);
        createCoursePage.nameInput(FakeDataProvider.generateFakeFirstName())
                .choosyCategory("it")
                .descriptionInput(generatedBio)
                .courseCode(codeResult)
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
        Assert.assertTrue(createCoursePage.exceptionTextOfCourseCode.getText().contains("cannot exceed 20 characters"));

    }
    @Test (priority = 6, description = "This is test entering letters into a capacity field")
    public void capacityInvalidTest() {
        driver.get(ConfigReader.getProperty("COURSE_CREATE_URL"));
        String generatedBio = FakeDataProvider.generateLongText(50);
        createCoursePage.nameInput(FakeDataProvider.generateFakeFirstName())
                .choosyCategory("it")
                .descriptionInput(generatedBio)
                .courseCode(FakeDataProvider.generateLogin())
                .priceInput(FakeDataProvider.generateSalary() + "")
                .inputVideo()
                .capacityInput(FakeDataProvider.generateFakeFirstName())
                .selectDate("30")
                .selectCertificate("Fan")
                .selectDurations("Custom")
                .moveSlider()
                .levelInput("3")
                .pictureInput()
                .saveBtn();
        Assert.assertTrue(createCoursePage.exceptionTextOfCapacity.getText().contains("This is not a valid"));

    }
    @Test (priority = 7, description = "This is test entering symbol into a capacity field")
    public void capacityInvalidSymbolTest() {
        driver.get(ConfigReader.getProperty("COURSE_CREATE_URL"));
        String generatedBio = FakeDataProvider.generateLongText(50);
        createCoursePage.nameInput(FakeDataProvider.generateFakeFirstName())
                .choosyCategory("it")
                .descriptionInput(generatedBio)
                .courseCode(FakeDataProvider.generateLogin())
                .priceInput(FakeDataProvider.generateSalary() + "")
                .inputVideo()
                .capacityInput(":)(*&")
                .selectDate("30")
                .selectCertificate("Fan")
                .selectDurations("Custom")
                .moveSlider()
                .levelInput("3")
                .pictureInput()
                .saveBtn();
        Assert.assertTrue(createCoursePage.exceptionTextOfCapacity.getText().contains("This is not a valid"));

    }
    @Test (priority = 8, description = "This is test checking negative value in capacity")
    public void capacityInvalidMinusTest() {
        driver.get(ConfigReader.getProperty("COURSE_CREATE_URL"));
        String generatedBio = FakeDataProvider.generateLongText(50);
        createCoursePage.nameInput(FakeDataProvider.generateFakeFirstName())
                .choosyCategory("it")
                .descriptionInput(generatedBio)
                .courseCode(FakeDataProvider.generateLogin())
                .priceInput(FakeDataProvider.generateSalary() + "")
                .inputVideo()
                .capacityInput("-" + FakeDataProvider.generateAge())
                .selectDate("30")
                .selectCertificate("Fan")
                .selectDurations("Custom")
                .moveSlider()
                .levelInput("3")
                .pictureInput()
                .saveBtn();
        Assert.assertTrue(createCoursePage.exceptionTextOfCapacity.getText().contains("This is not a valid"));

    }
}