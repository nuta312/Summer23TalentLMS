package com.digital.pages.coursesPage;

import com.digital.helper.ElementActions;
import com.digital.pages.BasePage;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CreateCoursePage extends BasePage {
    ElementActions elementActions = new ElementActions();
    @FindBy(xpath = "//div[@class='controls']/div/input[@name='name']")
    public WebElement courseNameInput;
    @FindBy(xpath = "//div[@class='select2-container']")
    public WebElement chooseCategoryInput;
    @FindBy(xpath ="//div[@class='select2-result-label']")
    public WebElement selectSamples;
    @FindBy(xpath = "//textarea[@class='span7']")
    public WebElement descriptionInput;
    @FindBy(id = "show-coursecode")
    public WebElement showCourseCodeInput;
    @FindBy (id ="course-coursecode")
    public WebElement writeCode;
    @FindBy(id= "show-price")
    public WebElement showCodePrice;
    @FindBy(id = "course-price")
    public WebElement coursePriceInput;
    @FindBy(id = "show-intro-video-url")
    public WebElement showVideoInput;
    @FindBy(id = "counter-course-intro-video-url")
    public WebElement downloadVideo;
    @FindBy(id = "show-capacity")
    public WebElement showCapasityInput;
    @FindBy(id="course-capacity")
    public WebElement writeCapasityText;
    @FindBy(id = "show-time-options")
    public WebElement showTimeOptionInput;
    @FindBy(id = "start-date")
    public WebElement startDateInput;
    @FindBy(id = "expiration-date")
    public WebElement expirationDateInput;
    @FindBy (xpath = "//a[@class='btn toggle-time-options']")
    public WebElement timeLimit;
    @FindBy(id = "start-time")
    public WebElement startTimeInput;
    @FindBy(id = "expiration-time")
    public WebElement expirationTimeInput;
    @FindBy (id= "course-timelimit")
    public WebElement timeLimitInput;
    @FindBy(id = "(//th[@class='next'])[4]")
    public WebElement nextBtn;
    @FindBy(xpath = "(//table[@class=' table-condensed'])[1]")
    public List<WebElement> listData;
    @FindBy(id = "hour-9")
    public WebElement hour9Input;
    @FindBy(id = "minute-0")
    public WebElement minute0Input;
    @FindBy(id = "hour-12")
    public WebElement hour12Input;
    @FindBy(id = "minute-15")
    public WebElement minute15Input;
    @FindBy(id = "time-limit-retain-access")
    public WebElement timeLimitRetainAccessBtn;
    @FindBy(id = "s2id_course-certification")
    public WebElement selectCertificateInput;
    @FindBy(id = "show-certification")
    public WebElement certificateBtn;
    @FindBy(xpath = "(//span[@class='select2-chosen'])[2]")
    public WebElement selectClassicCertificate;
    @FindBy(id = "(//span[@class='select2-match'])[2]")
    public WebElement selectCertificateDuration;
    @FindBy(xpath = "(//span[@class= 'select2-match'])[4]")
    public WebElement select6month;
    @FindBy(id = "reassign-checkbox")
    public WebElement reassignCheckbox;
    @FindBy(id = "s2id_tl-reassign-when")
    public WebElement reassignWhen;
    @FindBy(id = "show-level")
    public WebElement showLevel;
    @FindBy(xpath = "//ul[@class='select2-results']")
    public List<WebElement> listLevel;
    @FindBy(xpath = "//input[@name='submit_course']")
    public WebElement saveBtn;


    public CreateCoursePage nameInput() {
        elementActions.waitElementToBeVisible(courseNameInput)
                .writeText(courseNameInput, "Java");
        return this;
    }

    public CreateCoursePage choosyCategory() {
        elementActions.clickElement(chooseCategoryInput);
        elementActions.clickElement(selectSamples);
        return this;
    }

    public CreateCoursePage descriptionInput() {
        elementActions.clickElement(descriptionInput)
                .writeText(descriptionInput, "This is a good course");
        return this;
    }

    public CreateCoursePage courseCode() throws InterruptedException {
        elementActions.clickElement(showCourseCodeInput);
                elementActions.writeText(writeCode, "WS123");
        return this;
    }

    public CreateCoursePage priceInput() {
        elementActions.clickElement(showCodePrice);
        elementActions.writeText(coursePriceInput, "10000");
        return this;
    }

    public CreateCoursePage capacityInput() {
        elementActions.clickElement(showCapasityInput)
                .writeText(writeCapasityText, "50");
        return this;
    }

    public CreateCoursePage selectDate() throws InterruptedException {
        elementActions.clickElement(showTimeOptionInput)
//                clickElement(showTimeOptionInput)
//                .clickElement(startDateInput)
//                .clickElement(nextBtn)
//                .clickElement(nextBtn)
//                .clickElement(listData.get(4))
                .clickElement(timeLimit)
                .writeText(timeLimitInput,"30");
        Thread.sleep(3000);
        return this;
    }

    public CreateCoursePage selectTime() throws InterruptedException {
        elementActions.clickElement(startTimeInput)
                .clickElement(hour9Input)
                .clickElement(minute0Input)
                .clickElement(expirationTimeInput)
                .clickElement(hour12Input)
                .clickElement(minute15Input);
        Thread.sleep(3000);
        return this;
    }

    public CreateCoursePage selectCertificate() throws InterruptedException {
        elementActions.clickElement(certificateBtn)
                .clickElement(selectClassicCertificate)
                .clickElement(selectCertificateDuration);
        Thread.sleep(3000);
        return this;
    }

    public CreateCoursePage levelInput() throws InterruptedException {
        elementActions.clickElement(showLevel)
                .clickElement(listLevel.get(5));
        Thread.sleep(3000);
        return this;
    }

    public CreateCoursePage saveBtn() throws InterruptedException {
        elementActions.clickElement(saveBtn);
        Thread.sleep(5000);
        return this;
    }

    public CreateCoursePage allMethods() throws InterruptedException {
        CreateCoursePage createCoursePage= new CreateCoursePage();
        createCoursePage
                .nameInput()
                .choosyCategory()
                .descriptionInput()
                .courseCode()
                .priceInput()
                .capacityInput()
                .selectDate()
                .selectCertificate()
                .levelInput()
                .saveBtn();
        return this;
    }
}
