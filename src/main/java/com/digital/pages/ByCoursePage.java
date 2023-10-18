package com.digital.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;

public class ByCoursePage extends BasePage{

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

    public ByCoursePage closeClick(){
        close.click();
        return this;
    }

   public ByCoursePage clickHowTheCourseStoreWorks(){
       howTheCourseStoreWorks.click();
       return this;
   }

    public ByCoursePage clickHumanRecources(){
        humanResources.click();

        return this;
    }
    public ByCoursePage clickLeaderShip()  {
        leaderShip.click();

        return this;
    }
    public ByCoursePage clickPersonalDevolopment(){
        personalDevolopment.click();

        return this;
    }
    public ByCoursePage clickSafetyAndCompliance() {
        safetyAndCompliance.click();

        return this;
    }
    public ByCoursePage clickSalesAndService()  {
        salesAndService.click();

        return this;
    }

    public ByCoursePage clickSectorSpecific()  {
        sectorSpecific.click();

        return this;
    }
    public ByCoursePage clickTechnology() {
        technology.click();

        return this;
    }
    public ByCoursePage clickByCourse(){
        byCurse.click();
        return this;
    }

public ByCoursePage clickName(){
    name.click();

return this;
}
public ByCoursePage clickEnglish(){
    english.click();
    return this;
}

public ByCoursePage writeSearchCourse(){
    searchCourse.sendKeys();
    return this;
}
public ByCoursePage clickBusinessSkills(){
    businessSkills.click();
    return this;
}



}
