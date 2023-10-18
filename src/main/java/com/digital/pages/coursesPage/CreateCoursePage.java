package com.digital.pages.coursesPage;
import com.digital.helper.ElementActions;
import com.digital.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateCoursePage extends BasePage {
    ElementActions elementActions= new ElementActions();
    @FindBy(xpath = "(//div[@class='input-append tl-countdown'])[1]]")
    public WebElement courseNameInput;
    @FindBy(xpath = "(//span[@class= 'select2-arrow'])[1]")
    public WebElement chooseCategoryInput;
    @FindBy(xpath = "(//div[@class='input-append tl-countdown'])[2]")
    public WebElement descriptionInput;
    @FindBy(id = "show-coursecode")
    public WebElement showCourseCodeInput;
    @FindBy(id = "course-price")
    public WebElement coursePriceInput;
    @FindBy(id = "show-intro-video-url")
    public WebElement showVideoInput;
    @FindBy (id= "counter-course-intro-video-url")
    public WebElement downloadVideo;
    @FindBy(id = "show-capacity")
    public WebElement showCapasityInput;
    @FindBy(id = "show-time-options")
    public WebElement showTimeOptionInput;
    @FindBy(id = "start-date")
    public WebElement startDateInput;
    @FindBy(id = "expiration-date")
    public WebElement expirationDateInput;
    @FindBy(id = "start-time")
    public WebElement startTimeInput;
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
    @FindBy(xpath = "(//span[@class='select2-match'])[2]")
    public WebElement selectClassicCertificate;
    @FindBy(id = "(//div[@class='select2-container tl-select2'])[2]")
    public WebElement selectCertificateDuration;
    @FindBy(xpath = "(//span[@class= 'select2-match'])[4]")
    public WebElement select6month;
    @FindBy(id = "reassign-checkbox")
    public WebElement reassignCheckbox;
    @FindBy(id = "s2id_tl-reassign-when")
    public WebElement reassignWhen;
    @FindBy(id = "show-level")
    public WebElement showLevel;
    @FindBy(xpath = "//input[@name='submit_course']")
    public WebElement saveBtn;
    //https://nbu111.talentlms.com/course/index
    //(//tr[@class='odd'])[4] list

    public CreateCoursePage priceInput(){
    elementActions.clickElement(coursePriceInput);
    elementActions.writeText(coursePriceInput,"10000" );
    return this;
}
    public CreateCoursePage capasityInput(){
        elementActions.writeText(showVideoInput,"50");
        return this;
    }

    public CreateCoursePage selectDate(){
        elementActions.clickElement(startDateInput);
        elementActions.clickElement(showVideoInput);
        return this;
    }
}
