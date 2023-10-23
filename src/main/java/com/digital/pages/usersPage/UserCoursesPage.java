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

        @FindBy(xpath ="//input[@id='tl-grid-checkbox-all']")
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


        public String userNameIsDisplayed;
        public UserCoursesPage clickUserName () {
            elementActions.waitElementToBeClickable(userName);
            userNameIsDisplayed = String.valueOf(userName.isDisplayed());
            elementActions.clickByJS(userName);
            return this;
        }
        public String coursesIsDisplayed;
        public UserCoursesPage clickCourses(){
            elementActions.waitElementToBeClickable(courses);
            coursesIsDisplayed = String.valueOf(courses.isDisplayed());
                elementActions.clickByJS(courses);
            return this;
        }
        public boolean checkBoxAction;
        public UserCoursesPage clickCheckBox(){
            elementActions.waitElementToBeClickable(clickCheckBox);
            checkBoxAction = clickCheckBox.isSelected();
            elementActions.clickByJS(clickCheckBox);
            return this;
        }
        public String massActionsActualText;
        public UserCoursesPage clickMassActions1(){
            elementActions.waitElementToBeVisible(massActions1);
            elementActions.waitElementToBeClickable(massActions1);
           massActionsActualText =String.valueOf(massActions1.isDisplayed());
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
        public String closeBtnIsDisplayed;
        public UserCoursesPage closeClick(){
            elementActions.waitElementToBeClickable(closeBtn);
            closeBtnIsDisplayed = String.valueOf(courses.isDisplayed());
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
