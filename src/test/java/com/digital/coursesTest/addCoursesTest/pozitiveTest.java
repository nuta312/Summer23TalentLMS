package com.digital.coursesTest.addCoursesTest;
import com.digital.utils.FakeDataProvider;
import org.testng.annotations.Test;
import java.awt.*;

public class pozitiveTest extends CoursesHomePageTest {
    @Test
    public void allMethodsPozitiv() throws AWTException {
        String generatedBio = FakeDataProvider.generateLongText(200);
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
    }
}
