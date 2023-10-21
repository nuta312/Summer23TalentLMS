package com.digital.pages.coursesPage;

import com.digital.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class ByCoursePage extends BasePage {

    @FindBy(id = "grid_marketplace_filter")
    public WebElement searchCourse;

    @FindBy(xpath = "//div[@class='dropdown tl-grid-marketplace-sorting-wrapper pull-right hidden-phone']")
    public WebElement name;

    @FindBy(xpath = "//div[@class='dropdown tl-grid-course-library-language-wrapper pull-right hidden-phone']")
    public WebElement english;

    @FindBy(xpath = "//a[@title='Business Skills (168)']")
    public WebElement businessSkills;
    @FindBy(xpath = "//a[@title='Human Resources (88)']")
    public WebElement humanResources;
    @FindBy(xpath = "//a[@title='Leadership (76)']")
    public WebElement leaderShip;
    @FindBy(xpath = "//a[@title='Personal Development (85)']")
    public WebElement personalDevolopment;
    @FindBy(xpath = "//a[@title='Safety and Compliance (114)']")
    public WebElement safetyAndCompliance;
    @FindBy(xpath = "//a[@title='Sales and Service (84)']")
    public WebElement salesAndService;
    @FindBy(xpath = "//a[@title='Sector Specific (35)']")
    public WebElement sectorSpecific;
    @FindBy(xpath = "//a[@title='Technology (61)']" )
    public WebElement technology;

    @FindBy(xpath = "//div[@class='tl-marketplace-info-text']")
    public WebElement howTheCourseStoreWorks;
    @FindBy(xpath = "(//a[@href='https://nbu111.talentlms.com/marketplace/talentlibrary_index'])[2]")
    public WebElement byCurse;
    @FindBy(xpath = "(//a[@data-dismiss='modal'])[1]")
    public WebElement close;

    @FindBy(xpath = "(//div[@class='tl-bold-link'])[2]")
    public WebElement courses;
    @FindBy(xpath = "//*[text()='Buy courses']")
    public WebElement buyCourses;

    @FindBy(xpath = "//a[@id='tl-reset-categories']")
    public WebElement reset;
    public ByCoursePage resetClickBtn(){
        elementActions.clickElement(reset);
        return this;
    }
    public ByCoursePage buyCourseLinkClick(){
        elementActions.clickElement(buyCourses);
        return this;
    }
    public ByCoursePage coursesClickBtn(){
        elementActions.clickElement(courses);
        return this;
    }

    public ByCoursePage closeClick(){
        elementActions.clickElement(close);
      // Assert.assertEquals(close.getText(),"close element");
        return this;
    }

   public ByCoursePage clickHowTheCourseStoreWorks(){
        elementActions.clickElement(howTheCourseStoreWorks);
    // Assert.assertEquals(howTheCourseStoreWorks.getText(),"You have click the button");
       return this;
   }

    public ByCoursePage clickHumanRecources(){
        elementActions.clickByJS(humanResources);
       // Assert.assertEquals(humanResources.getText(),"You have click human resources");

        return this;
    }
    public ByCoursePage clickLeaderShip()  {
        elementActions.clickElement(leaderShip);
      //  Assert.assertEquals(leaderShip.getText(),"You have click leader ship");

        return this;
    }
    public ByCoursePage clickPersonalDevolopment(){
        elementActions.clickElement(personalDevolopment);
      //  Assert.assertEquals(personalDevolopment.getText(),"you have click personal devolopment");

        return this;
    }
    public ByCoursePage clickSafetyAndCompliance() {
        elementActions.clickElement(safetyAndCompliance);
       // Assert.assertEquals(safetyAndCompliance.getText(),"you have click safety and compliance");

        return this;
    }
    public ByCoursePage clickSalesAndService()  {
        elementActions.clickElement(salesAndService);
     // Assert.assertEquals(salesAndService.getText(),"you have click sales and service");

        return this;
    }

    public ByCoursePage clickSectorSpecific()  {
        elementActions.clickElement(sectorSpecific);
      //  Assert.assertEquals(sectorSpecific.getText(),"you have click sector specific");
      //  sectorSpecific.click();

        return this;
    }
    public ByCoursePage clickTechnology() {
        elementActions.clickElement(technology);
            //    Assert.assertEquals(technology.getText(),"ypu have click tecchnology");


        return this;
    }
    public ByCoursePage clickByCourse(){
        elementActions.clickElement(byCurse);
       // Assert.assertEquals(byCurse.getText(),"You have click by curse");

        return this;
    }

public ByCoursePage clickName(){
       elementActions.clickElement(name);

       // name.click();
    //Assert.assertEquals(name.getText(),"You are click the NAME");

return this;
}
public ByCoursePage clickEnglish(){
        elementActions.clickElement(english);
      //  Assert.assertEquals(english.getText(),"english");

    return this;
}

public ByCoursePage writeSearchCourse(){
        elementActions.moveToElement(searchCourse);
   // searchCourse.sendKeys();
    return this;
}
public ByCoursePage clickBusinessSkills(){
        elementActions.clickByJS(businessSkills);
      //  elementActions.clickElement(businessSkills);
    //Assert.assertEquals(businessSkills.getText(),"you have click business skills");

    return this;
}
}
