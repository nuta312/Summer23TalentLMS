package com.digital.pages.usersPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

//denis
    public class UserCoursesPage extends UserHomePage{

        @FindBy (xpath ="//a[@data-original-title='Username: admin']/span[@title='J. Torphy (admin)']")
        public WebElement userName;

        @FindBy (xpath ="//a[text()='Courses']")
        public WebElement courses;

        @FindBy(xpath ="//input[@data-id='134']")
        public WebElement clickCheckBox;

        @FindBy(xpath ="//a[@class='btn dropdown-toggle']")
        public WebElement massActions1;

        @FindBy (xpath ="//a[text()='Enroll']")
        public WebElement enrollAction;

        @FindBy(xpath = "//a[text()='Unenroll']")
        public WebElement unenrollAction;

        @FindBy (xpath ="//a[@class='close' and text()='×']")
        public WebElement closeBtn;


        @FindBy(xpath = "//a[text()='Reset progress']")
        public WebElement rstProgressAction;


        public UserCoursesPage clickUserName () {
            elementActions.waitElementToBeClickable(userName);
            elementActions.clickByJS(userName);
            return this;
        }
        public UserCoursesPage clickCourses(){
            elementActions.waitElementToBeClickable(courses);
            elementActions.clickByJS(courses);
            return this;
        }

        public UserCoursesPage clickCheckBox(){
            elementActions.waitElementToBeClickable(clickCheckBox);
            elementActions.clickByJS(clickCheckBox);
            return this;
        }
        public UserCoursesPage clickMassActions1(){
            elementActions.waitElementToBeVisible(massActions1);
            elementActions.waitElementToBeClickable(massActions1);
            elementActions.clickByJS(massActions1);
            return this;
        }
        public String enrollActualText;
        public UserCoursesPage clickEnrollAction(){
            elementActions.waitElementToBeClickable(enrollAction);
            enrollActualText = enrollAction.getAttribute("innerText");
            elementActions.clickByJS(enrollAction);
            return this;
        }
        public String unenrollActualText;
        public UserCoursesPage clickUnenrollAction(){
            elementActions.waitElementToBeVisible(unenrollAction);
            elementActions.waitElementToBeClickable(unenrollAction);
             unenrollActualText = unenrollAction.getAttribute("innerText");
            elementActions.clickByJS(unenrollAction);
            return this;
        }
        public UserCoursesPage closeClick(){
            elementActions.waitElementToBeClickable(closeBtn);
            elementActions.clickByJS(closeBtn);
            return this;
        }
        public String resetProgressActualText;
        public UserCoursesPage clickResetProgress(){
            elementActions.waitElementToBeClickable(rstProgressAction);
            resetProgressActualText = rstProgressAction.getAttribute("innerText");
            elementActions.clickByJS(rstProgressAction);
            return this;
        }


}
