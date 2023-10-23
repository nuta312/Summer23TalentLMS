package com.digital.pages.usersPage;

import com.digital.driver.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


//denis
public class UserCoursesPage extends UserHomePage {

    @FindBy(xpath = "//a[@data-original-title='Username: admin']/span[@title='J. Torphy (admin)']")
    public WebElement userName;

    @FindBy(xpath = "//a[text()='Courses']")
    public WebElement courses;

    @FindBy(xpath = "//input[@id='tl-grid-checkbox-all']")
    public WebElement clickCheckBox;

    @FindBy(xpath = "//a[@class='btn dropdown-toggle']")
    public WebElement massActions1;

    @FindBy(xpath = "//a[text()='Enroll']")
    public WebElement enrollAction;

    @FindBy(xpath = "//a[text()='Unenroll']")
    public WebElement unenrollAction;

    @FindBy(xpath = "//a[@class='close' and text()='×']")
    public WebElement closeBtn;

    @FindBy(xpath = "//a[text()='Reset progress']")
    public WebElement rstProgressAction;

    @FindBy(xpath = "//a[text()='Profile']")
    public WebElement profileTab;
    // profile - progress - infographic tabs
    @FindBy(xpath = "//a[text()='Progress']")
    public WebElement progressTab;

    @FindBy(xpath = "//a[text()='Infographic']")
    public WebElement infographicTab;
    public String profileUrl;
    public String progressUrl;
    public String infographicUrl;
    public String userNameIsDisplayed;
    public String coursesIsDisplayed;
    public boolean checkBoxAction;
    public String massActionsActualText;
    public String enrollActualText;
    public String unenrollActualText;
    public String closeBtnIsDisplayed;
    public String resetProgressActualText;

    public UserCoursesPage clickUserName() {
        elementActions.waitElementToBeClickable(userName);
        userNameIsDisplayed = String.valueOf(userName.isDisplayed());
        elementActions.clickByJS(userName);
        return this;
    }

    public UserCoursesPage clickCourses() {
        elementActions.waitElementToBeClickable(courses);
        coursesIsDisplayed = String.valueOf(courses.isDisplayed());
        elementActions.clickByJS(courses);
        return this;
    }

    public UserCoursesPage clickCheckBox() {
        elementActions.moveToElement(clickCheckBox);
        checkBoxAction = clickCheckBox.isSelected();
        elementActions.clickByJS(clickCheckBox);
        return this;
    }

    public UserCoursesPage clickMassActions1() {
        elementActions.moveToElement(massActions1);
        elementActions.waitElementToBeVisible(massActions1);
        elementActions.waitElementToBeClickable(massActions1);
        massActionsActualText = String.valueOf(massActions1.isDisplayed());
        elementActions.clickByJS(massActions1);
        return this;
    }

    public UserCoursesPage clickEnrollAction() {
        elementActions.waitElementToBeClickable(enrollAction);
        enrollActualText = enrollAction.getAttribute("innerText");
        elementActions.clickByJS(enrollAction);
        return this;
    }

    public UserCoursesPage clickUnenrollAction() {
        elementActions.waitElementToBeVisible(unenrollAction);
        elementActions.waitElementToBeClickable(unenrollAction);
        unenrollActualText = unenrollAction.getAttribute("innerText");
        elementActions.clickByJS(unenrollAction);
        return this;
    }

    public UserCoursesPage closeClick() {
        elementActions.waitElementToBeClickable(closeBtn);
        closeBtnIsDisplayed = String.valueOf(courses.isDisplayed());
        elementActions.clickByJS(closeBtn);
        return this;
    }

    public UserCoursesPage clickResetProgress() {
        elementActions.waitElementToBeClickable(rstProgressAction);
        resetProgressActualText = rstProgressAction.getAttribute("innerText");
        elementActions.clickByJS(rstProgressAction);
        return this;
    }


    public UserCoursesPage clickToProfileTab() {
        elementActions.pause(2000);
        elementActions.clickByJS(profileTab);
        profileUrl = Driver.getDriver().getCurrentUrl();
        System.out.println(profileUrl);
        return this;
    }


    public UserCoursesPage clickToProgressTab() {
        elementActions.pause(2000);
        elementActions.clickByJS(progressTab);
        elementActions.pause(2000);
        progressUrl = Driver.getDriver().getCurrentUrl();
        System.out.println(progressUrl);
        elementActions.pause(1000);
        elementActions.navigateBack();
        return this;
    }


    public UserCoursesPage clickToInfographicTab() {
        elementActions.pause(2000);
        elementActions.clickByJS(infographicTab);
        elementActions.pause(1000);
        infographicUrl = Driver.getDriver().getCurrentUrl();
        System.out.println(infographicUrl);
        elementActions.pause(1000);
        elementActions.navigateBack();
        return this;
    }
}
