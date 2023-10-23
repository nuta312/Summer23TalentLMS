package com.digital.coursesTest.addCoursesTest;

import com.digital.utils.FakeDataProvider;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class nameTest extends CoursesHomePageTest {
    @FindBy(id = "tl-courses-grid")
    public List<WebElement> newCourse;

    @Test
    public void testNameLengthInvalid() throws AWTException {
        driver.get("https://nbu111.talentlms.com/course/create");
        String firstName2 = faker.name().firstName();
        StringBuilder longName = new StringBuilder(firstName2);
        String generatedBio = FakeDataProvider.generateLongText(200);
        while (longName.length() < 101) {
            longName.append(firstName2);
        }
        String resultName = longName.toString().substring(0, 101);
        createCoursePage.nameInput(resultName)
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
        soft.assertTrue(createCoursePage.text1.getText().contains("cannot exceed 100 characters"));
        System.out.println(createCoursePage.text1.getText());
        soft.assertAll();
        // .pictureInput();
    }

    @Test
    public void testNameIntValid() throws AWTException {
        driver.get("https://nbu111.talentlms.com/course/create");
        String generatedBio = FakeDataProvider.generateLongText(100);
        createCoursePage.nameInput(FakeDataProvider.generateAge() + "")
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
        driver.get("https://nbu111.talentlms.com/course/index");
        newCourse = new ArrayList<>();
        elementActions.waitElementToBeClickable(newCourse.get(0));
        List<WebElement> list = new ArrayList<>();
        list.add(createCoursePage.courseNameInput);
        String str = String.valueOf(list.get(0));
        soft.assertTrue(newCourse.contains(str));
        soft.assertAll();
        // .pictureInput();
    }
    @Test
    public void testNameSymbolInvalid() throws AWTException {
        driver.get("https://nbu111.talentlms.com/course/create");
        String generatedBio = FakeDataProvider.generateLongText(200);
        createCoursePage.nameInput("!@#$%^&*(")
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
        soft.assertTrue(createCoursePage.text1.getText().contains("cannot exceed 100 characters"));
        System.out.println(createCoursePage.text1.getText());
        soft.assertAll();
        // .pictureInput();
    }

}
