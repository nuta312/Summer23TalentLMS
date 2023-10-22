package com.digital.pages.coursesPage;

import com.digital.driver.Driver;
import com.digital.helper.ElementActions;
import com.digital.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.io.IOException;
import java.util.List;

public class CreateCoursePage extends BasePage {

    ElementActions elementActions = new ElementActions();

    @FindBy(xpath = "//div[@class='controls']/div/input[@name='name']")
    public WebElement courseNameInput;
    @FindBy(xpath = "//span[@class='add-on']")
    public WebElement permissibleValueName;
    @FindBy(xpath = "(//span[@class='help-inline'])[1]")
    public WebElement text1;
    @FindBy(xpath = "//div[@class='select2-container']")
    public WebElement chooseCategoryInput;
    @FindBy(xpath = "//textarea[@class='span7']")
    public WebElement descriptionInput;
    @FindBy(xpath = "//span[@class='add-on textarea-countdown']")
    public WebElement permissibleDescription;
    @FindBy(id = "show-coursecode")
    public WebElement showCourseCodeInput;
    @FindBy(id = "course-coursecode")
    public WebElement writeCode;
    @FindBy(id = "show-price")
    public WebElement showCodePrice;
    @FindBy(id = "course-price")
    public WebElement coursePriceInput;
    @FindBy(id = "show-intro-video-url")
    public WebElement showVideoInput;
    @FindBy(xpath = "//input[@name='intro_video_url']")
    public WebElement downloadVideo;
    @FindBy(id = "show-capacity")
    public WebElement showCapasityInput;
    @FindBy(id = "course-capacity")
    public WebElement writeCapasityText;
    @FindBy(id = "show-time-options")
    public WebElement showTimeOptionInput;
    @FindBy(xpath = "//a[@class='btn toggle-time-options']")
    public WebElement timeLimit;
    @FindBy(id = "course-timelimit")
    public WebElement timeLimitInput;
    @FindBy(xpath = "//div[@class='select2-result-label']")
    public List<WebElement> listOfCertificate;
    @FindBy(id = "show-certification")
    public WebElement certificateBtn;
    @FindBy(id = "s2id_course-certification")
    public WebElement selectCertificateDuration;
    @FindBy(xpath = "//*[text()='Forever']")
    public WebElement select2DropMask;
    @FindBy(xpath = "//span[@tabindex='0']")
    public WebElement moveTheSlider;
    @FindBy(id = "show-level")
    public WebElement showLevel;
    @FindBy(id = "s2id_course-level")
    public WebElement selectLevel;
    @FindBy(xpath = "//div[@id='select2-drop']/ul/li/div")
    public List<WebElement> inputLevel;
    @FindBy(xpath = "(//ul[@class='select2-results'])[7]")
    public List<WebElement> listLevel;
    @FindBy(xpath = "//input[@name='submit_course']")
    public WebElement saveBtn;


    public CreateCoursePage nameInput(String txt) {
        elementActions.waitElementToBeVisible(courseNameInput)
                .writeText(courseNameInput, txt);
        return this;
    }

    public CreateCoursePage choosyCategory(String str) {

        elementActions.clickElement(chooseCategoryInput);
        try {
            for (WebElement val : inputLevel) {
                if (val.getText().contains(str)) {
                    elementActions.clickElement(val);
                }
            }
            return this;
        } catch (RuntimeException exception) {
            return this;
        }
    }

    public CreateCoursePage descriptionInput(String txt){
        elementActions.clickElement(descriptionInput);
        elementActions.writeText(descriptionInput, txt);
        return this;
    }

    public CreateCoursePage courseCode(String txt){
        elementActions.clickElement(showCourseCodeInput);
        elementActions.writeText(writeCode, txt);
        return this;
    }

    public CreateCoursePage priceInput(String txt) {
        elementActions.clickElement(showCodePrice);
        elementActions.writeText(coursePriceInput, txt);
        return this;
    }

    public CreateCoursePage inputVideo() {
        elementActions.clickElement(showVideoInput);
        elementActions.writeText(downloadVideo, "https://www.youtube.com/watch?v=9sw1NzgSdyM&ab_channel=Fashion%26Sightseeing");
        return this;
    }

    public CreateCoursePage capacityInput(String txt) {
        elementActions.clickElement(showCapasityInput)
                .writeText(writeCapasityText, txt);
        return this;
    }

    public CreateCoursePage selectDate(String txt)  {
        elementActions.clickElement(showTimeOptionInput)
                .clickElement(timeLimit)
                .writeText(timeLimitInput, txt);
        return this;
    }

    public CreateCoursePage selectCertificate(String str)  {

        elementActions.clickElement(certificateBtn)
                .clickElement(selectCertificateDuration);
        try {
            for (WebElement val : inputLevel) {
                if (val.getText().contains(str)) {
                    elementActions.clickElement(val);

                }
            }
            return this;
        } catch (RuntimeException exception) {
            return this;
        }
    }

    public CreateCoursePage selectDurations(String str)  {

        elementActions.clickElement(select2DropMask);
        try {
            for (WebElement val : inputLevel) {
                if (val.getText().contains(str)) {
                    elementActions.clickElement(val);

                }
            }
            return this;
        } catch (RuntimeException exception) {
            return this;
        }
    }

    public CreateCoursePage moveSlider() {
        Actions actions = new Actions(Driver.getDriver());
        actions.dragAndDropBy(moveTheSlider, 40, 0).perform();
        return this;
    }

    public CreateCoursePage levelInput(String str) {

        elementActions.clickElement(showLevel)
                .clickElement(selectLevel);
        try {
            for (WebElement val : inputLevel) {
                if (val.getText().contains(str)) {
                    elementActions.clickElement(val);

                }
            }
            return this;
        } catch (RuntimeException exception) {
            return this;
        }
    }

    public CreateCoursePage saveBtn()  {
        elementActions.clickElement(Driver.getDriver().findElement(By.xpath("//input[@name='submit_course']")));
        return this;
    }

    public void allMethodsPozitiv() {
        nameInput("Java")
                .choosyCategory("it")
                .descriptionInput("IT stands for Information Technology, and there are numerous courses, programs, and certifications available in the field of IT covering a wide range of topics such as programming, cybersecurity, networking, cloud computing, data science, and more")
                .courseCode("12345")
                .priceInput("10000")
                .inputVideo()
                .capacityInput("50")
                .selectDate("30")
                .selectCertificate("Fan")
                .selectDurations("Custom")
                .moveSlider()
                .levelInput("3")
                .saveBtn();
    }

    public void allMethodsNegativ()  {

    negativMethodsForName();
        choosyCategory("it")
                .negativMethodsForDescription();
      courseCode("11111111111111111")
                .priceInput("10000000000")
                .capacityInput("5000000")
                .selectDate("3000000")
                .selectCertificate("Fan")
                .selectDurations("Custom")
                .moveSlider()
                .levelInput("3")
                .saveBtn();
    }

    public boolean negativMethodsForName() {

        nameInput("111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        System.out.println(permissibleValueName.getText());
        int number = Integer.valueOf(permissibleValueName.getText());
        if (number < 0) {
            return true;
        }
        return false;

    }

    public boolean negativMethodsForDescription() {

     descriptionInput("Could you please provide more details or clarify your question about the stands for Information Technology, and there are numerous courses, programs, and certifications available in the field of IT covering a wide range of topics such as programming, cybersecurity, networking, cloud computing, data science, and more. I\"IT course\"? \"IT\" stands for Information Technology, and there are numerous courses, programs, and certifications available in the field of IT covering a wide range of topics such as programming, cybersecurity, networking, cloud computing, data science, and more. If you have a specific IT course or topic in mind, feel free to provide more information so I can assist you accordingly.Could you please provide more details or clarify your question about the \"IT course\"? \"IT\" stands for Information Technology, and there are numerous courses, programs, and certifications available in the field of IT covering a wide range of topics such as programming, cybersecurity, networking, cloud computing, data science, and more. stands for Information Technology, and there are numerous courses, programs, and certifications available in the field of IT covering a wide range of topics such as programming, cybersecurity, networking, cloud computing, data science, and more. IIf you have a specific IT course or topic in mind, feel free to provide more information so I can assist you accordingly.fic IT course or topic in mind, feel free to provide more information so I can assist you accordingly.Could you please provide more details or clarify your question about the \"IT course\"? \"IT\" stands for Information Technology, and there are numerous courses, programs, and certifications available in the field of IT covering a wide range of topics such as programming, cybersecurity, networking, cloud computing, data science, and more. stands for Information Technology, and there are numerous courses, programs, and certifications available in the field of IT covering a wide range of topics such as programming, cybersecurity, networking, cloud computing, data science, and more. IIf you have a specific IT course or topic in mind, feel free to provide more information so I can assist you accordingly.fic IT course or topic in mind, feel free to provide more information so I can assist you accordingly.Could you please provide more details or clarify your question about the \"IT course\"? \"IT\" stands for Information Technology, and there are numerous courses, programs, and certifications available in the field of IT covering a wide range of topics such as programming, cybersecurity, networking, cloud computing, data science, and more. stands for Information Technology, and there are numerous courses, programs, and certifications available in the field of IT covering a wide range of topics such as programming, cybersecurity, networking, cloud computing, data science, and more. IIf you have a specific IT course or topic in mind, feel free to provide more information so I can assist you accordingly.fic IT course or topic in mind, feel free to provide more information so I can assist you accordingly.Could you please provide more details or clarify your question about the \"IT course\"? \"IT\" stands for Information Technology, and there are numerous courses, programs, and certifications available in the field of IT covering a wide range of topics such as programming, cybersecurity, networking, cloud computing, data science, and more. stands for Information Technology, and there are numerous courses, programs, and certifications available in the field of IT covering a wide range of topics such as programming, cybersecurity, networking, cloud computing, data science, and more. IIf you have a specific IT course or topic in mind, feel free to provide more information so I can assist you accordingly.fic IT course or topic in mind, feel free to provide more information so I can assist you accordingly.Could you please provide more details or clarify your question about the \"IT course\"? \"IT\" stands for Information Technology, and there are numerous courses, programs, and certifications available in the field of IT covering a wide range of topics such as programming, cybersecurity, networking, cloud computing, data science, and more. stands for Information Technology, and there are numerous courses, programs, and certifications available in the field of IT covering a wide range of topics such as programming, cybersecurity, networking, cloud computing, data science, and more. IIf you have a specific IT course or topic in mind, feel free to provide more information so I can assist you accordingly.fic IT course or topic in mind, feel free to provide more information so I can assist you accordingly.Could you please provide more details or clarify your question about the \"IT course\"? \"IT\" stands for Information Technology, and there are numerous courses, programs, and certifications available in the field of IT covering a wide range of topics such as programming, cybersecurity, networking, cloud computing, data science, and more. stands for Information Technology, and there are numerous courses, programs, and certifications available in the field of IT covering a wide range of topics such as programming, cybersecurity, networking, cloud computing, data science, and more. IIf you have a specific IT course or topic in mind, feel free to provide more information so I can assist you accordingly.fic IT course or topic in mind, feel free to provide more information so I can assist you accordingly.Could you please provide more details or clarify your question about the \"IT course\"? \"IT\" stands for Information Technology, and there are numerous courses, programs, and certifications available in the field of IT covering a wide range of topics such as programming, cybersecurity, networking, cloud computing, data science, and more. stands for Information Technology, and there are numerous courses, programs, and certifications available in the field of IT covering a wide range of topics such as programming, cybersecurity, networking, cloud computing, data science, and more. IIf you have a specific IT course or topic in mind, feel free to provide more information so I can assist you accordingly.Could you please provide more details or clarify your question about the stands for Information Technology, and there are numerous courses, programs, and certifications available in the field of IT covering a wide range of topics such as programming, cybersecurity, networking, cloud computing, data science, and more. I\"IT course\"? \"IT\" stands for Information Technology, and there are numerous courses, programs, and certifications available in the field of IT covering a wide range of topics such as programming, cybersecurity, networking, cloud computing, data science, and more. If you have a specific IT course or topic in mind, feel free to provide more information so I can assist you accordingly.Could you please provide more details or clarify your question about the \"IT course\"? \"IT\" stands for Information Technology, and there are numerous courses, programs, and certifications available in the field of IT covering a wide range of topics such as programming, cybersecurity, networking, cloud computing, data science, and more. stands for Information Technology, and there are numerous courses, programs, and certifications available in the field of IT covering a wide range of topics such as programming, cybersecurity, networking, cloud computing, data science, and more. IIf you have a specific IT course or topic in mind, feel free to provide more information so I can assist you accordingly.");
        System.out.println(permissibleDescription.getText());
        int number = Integer.valueOf(permissibleDescription.getText());
        if (number < 0) {
            return true;
        }
        return false;
    }
}