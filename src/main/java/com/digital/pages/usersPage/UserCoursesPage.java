package com.digital.pages.usersPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
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
    public UserCoursesPage clickEnrollAction(){
        elementActions.waitElementToBeClickable(enrollAction);
        elementActions.clickByJS(enrollAction);
        return this;
    }
    public UserCoursesPage clickUnenrollAction(){
        elementActions.waitElementToBeVisible(unenrollAction);
        elementActions.waitElementToBeClickable(unenrollAction);
        elementActions.clickByJS(unenrollAction);
        return this;
    }
    public UserCoursesPage closeClick(){
        elementActions.waitElementToBeClickable(closeBtn);
        elementActions.clickByJS(closeBtn);
        return this;
    }

    public UserCoursesPage clickResetProgress(){
        elementActions.waitElementToBeClickable(rstProgressAction);
        elementActions.clickByJS(rstProgressAction);
        return this;
    }


























   @FindBy (xpath = "//input[@class='hidden-mobile tl-grid-checkbox']")
    public WebElement checkBoxUsers;

   @FindBy(xpath = "//a[contains(text(), 'Mass actions')]")
   public WebElement massActions;

   @FindBy (xpath = "//a[@class='massaction' and contains(text(), 'Activate')]")
   public WebElement activate;

   @FindBy (xpath = "//a[@class='close' and @data-dismiss='modal']")
   public WebElement close;

   @FindBy (xpath = "//a[@class='massaction' and contains(text(), 'Deactivate')]")
   public WebElement deactivate;

   @FindBy (xpath = "//a[@class='massaction' and contains(text(), 'Delete')]")
   public WebElement delete;
   @FindBy (xpath = "//a[@class='massaction' and contains(text(), 'Add to branch')]")
   public WebElement addToBranch;
   @FindBy (xpath = "//a[@class='massaction' and contains(text(), 'Remove from branch')]")
   public WebElement removeFromBranch;

   public UserCoursesPage clickCheckBoxUser () {
       elementActions.waitElementToBeClickable(checkBoxUsers);
       elementActions.clickByJS(checkBoxUsers);
       return this;
   }
 public UserCoursesPage clickMassActions(){
       elementActions.waitElementToBeClickable(massActions);
       elementActions.clickByJS(massActions);
       return this;
 }

 public UserCoursesPage clickActivate(){
       elementActions.waitElementToBeClickable(activate);
       elementActions.waitElementToBeVisible(activate);
       elementActions.clickByJS(activate);
       return this;
 }

 public UserCoursesPage closeFrame(){
       elementActions.clickElement(close);
       return this;
 }

 public UserCoursesPage clickDeactivate(){
       elementActions.clickByJS(deactivate);
       return this;
 }

 public UserCoursesPage clickDelete(){
       elementActions.clickByJS(delete);
     String actualText = delete.getAttribute("innerText");
     String expectedText = "Delete";
     //Assert.assertEquals(actualText, expectedText);




       return this;
 }
 public UserCoursesPage clickAddToBranch(){
       elementActions.clickElement(addToBranch);
       return this;
 }
 public UserCoursesPage clickRemoveFromBranch(){
       elementActions.clickElement(removeFromBranch);
       return this;
 }

}

