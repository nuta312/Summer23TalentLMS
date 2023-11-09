package com.digital.pages.coursesPage;

import com.digital.driver.Driver;
import com.digital.pages.usersPage.CreateUserPage;
import io.netty.handler.codec.http.multipart.FileUpload;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.FileReader;
import java.io.InputStream;
import java.util.List;

public class CreateCoursePage extends CreateUserPage {

    @FindBy(xpath = "//div[@class='controls']/div/input[@name='name']")
    public WebElement courseNameInput;
    @FindBy(xpath = "(//span[@class='help-inline'])[1]")
    public WebElement text1;
    @FindBy(xpath = "(//span[@class='help-block'])[4]")
    public WebElement exceptionTextOfCourseCode;
    @FindBy(xpath = "(//span[@class='help-block'])[5]")
    public WebElement exceptionTextOfCoursePrice;
    @FindBy(xpath = "(//span[@class='help-block'])[3]")
    public WebElement exceptionTextOfDescription;
    @FindBy(xpath = "(//span[@class='help-block'])[7]")
    public WebElement exceptionTextOfCapacity;
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
    @FindBy(xpath = "//input[@name='avatar[]']")
    public WebElement pictureBtn;
    @FindBy(id = "fileupload_input")
    public WebElement pictureClick;
    @FindBy(xpath = "//span[@class='tl-formatted-course-name']")
    public static List<WebElement> newCourse;
    @FindBy (xpath = "(//a[contains(., 'Add course') and @href='https://nbu111.talentlms.com/course/create'])[2]")
    public WebElement addCoursePage;
    @FindBy (xpath = "//span[@class='tl-box-title-options']")
    public WebElement addHomePage;


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
    public CreateCoursePage descriptionInput(String txt) {
        elementActions.clickElement(descriptionInput);
        elementActions.writeText(descriptionInput, txt);
        return this;
    }
    public CreateCoursePage courseCode(String txt) {
        elementActions.clickElement(showCourseCodeInput);
        elementActions.writeText(writeCode, txt);
        return this;
    }
    public CreateCoursePage priceInput(String txt) {
        elementActions.clickElement(showCodePrice);
        elementActions.writeText(coursePriceInput, String.valueOf(txt));
        return this;
    }
    public CreateCoursePage inputVideo() {
        elementActions.clickElement(showVideoInput);
        elementActions.writeText(downloadVideo, "https://www.youtube.com/watch?v=9sw1NzgSdyM&ab_channel=Fashion%26Sightseeing");
        return this;
    }
    public CreateCoursePage capacityInput(String txt) {
        elementActions.clickElement(showCapasityInput)
                .writeText(writeCapasityText, String.valueOf(txt));
        return this;
    }
    public CreateCoursePage selectDate(String txt) {
        elementActions.clickElement(showTimeOptionInput)
                .clickElement(timeLimit)
                .writeText(timeLimitInput, txt);
        return this;
    }
    public CreateCoursePage selectCertificate(String str) {
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
    public CreateCoursePage selectDurations(String str) {
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
        actions.dragAndDropBy(moveTheSlider, 100, 0).perform();
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
    public CreateCoursePage saveBtn() {
        elementActions.clickElement(Driver.getDriver().findElement(By.xpath("//input[@name='submit_course']")));
        return this;
    }
    public CreateCoursePage pictureInput() {
        pictureBtn.sendKeys("C:\\Users\\user\\projectHTML\\Summer23TalentLMS\\src\\main\\resources\\image\\java.png");
        return this;
    }
    public CreateCoursePage addCoursePage(){
        elementActions.clickElement(addCoursePage);
return this;
    }
    public CreateCoursePage homePage(){
        elementActions.clickElement(addHomePage);
        return this;
    }
}




