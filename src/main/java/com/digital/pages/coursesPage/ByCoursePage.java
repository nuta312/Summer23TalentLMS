package com.digital.pages.coursesPage;

import com.digital.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class ByCoursePage extends BasePage {
    @FindBy(xpath = "//input[@placeholder='Search courses']")
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
    @FindBy(xpath = "//a[@title='Technology (61)']")
    public WebElement technology;
    @FindBy(xpath = "//div[@class='tl-marketplace-info-text']")
    public WebElement howTheCourseStoreWorks;
    @FindBy(xpath = "(//a[@data-dismiss='modal'])[1]")
    public WebElement close;
    @FindBy(xpath = "(//div[@class='tl-bold-link'])[2]")
    public WebElement courses;
    @FindBy(xpath = "//*[text()='Buy courses']")
    public WebElement buyCourses;
    @FindBy(xpath = "//a[@id='tl-reset-categories']")
    public WebElement reset;
    @FindBy(xpath = "//div[@id = 'tl-marketplace-modal-info']//h3")
    public WebElement textAssert1;
    @FindBy(xpath = "(//div[@title = 'Business Skills / Business Continuity Essentials'])[1]")
    public WebElement textAssert2;
    @FindBy(xpath = "(//div[@title = 'Human Resources / Diversity and Inclusion'])[1]")
    public WebElement textAssert3;
    @FindBy(xpath = "(//div[@title = 'Leadership / Adaptive Leadership'])[1]")
    public WebElement textAssert4;
    @FindBy(xpath = "(//div[@title = 'Personal Development / Career Management'])[1]")
    public WebElement textAssert5;
    @FindBy(xpath = "(//div[@title = 'Safety and Compliance / Compliance Essentials'])[1]")
    public WebElement textAssert6;
    @FindBy(xpath = "(//div[@title = 'Sales and Service / Customer Service Applied'])[1]")
    public WebElement textAssert7;
    @FindBy(xpath = "(//div[@title = 'Sector Specific / HIPAA Compliance Essentials'])[1]")
    public WebElement textAssert8;
    @FindBy(xpath = "(//div[@title = 'Technology / Artificial Intelligence Essentials'])[1]")
    public WebElement textAssert9;
    @FindBy(xpath = "//a[@data-sortingtype= 'name']")
    public WebElement assertNameBtn;
    @FindBy(xpath = "//span[@class= 'tl-current-course-library-language']")
    public WebElement assertEnglishBtn;

    public ByCoursePage resetClickBtn() {
        elementActions.clickElement(reset);
        return this;
    }

    public ByCoursePage buyCourseLinkClick() {
        elementActions.clickElement(buyCourses);
        return this;
    }

    public ByCoursePage coursesClickBtn() {
        elementActions.clickElement(courses);
        return this;
    }

    public ByCoursePage closeClick() {
        elementActions.clickElement(close);
        return this;
    }

    public ByCoursePage clickHowTheCourseStoreWorks() {
        elementActions.clickElement(howTheCourseStoreWorks);
        return this;
    }

    public ByCoursePage clickHumanRecources() {
        elementActions.clickByJS(humanResources);
        return this;
    }

    public ByCoursePage clickLeaderShip() {
        elementActions.clickElement(leaderShip);
        return this;
    }

    public ByCoursePage clickPersonalDevolopment() {
        elementActions.clickElement(personalDevolopment);
        return this;
    }

    public ByCoursePage clickSafetyAndCompliance() {
        elementActions.clickElement(safetyAndCompliance);
        return this;
    }

    public ByCoursePage clickSalesAndService() {
        elementActions.clickElement(salesAndService);
        return this;
    }

    public ByCoursePage clickSectorSpecific() {
        elementActions.clickElement(sectorSpecific);
        return this;
    }

    public ByCoursePage clickTechnology() {
        elementActions.clickElement(technology);
        return this;
    }

    public ByCoursePage clickName() {
      elementActions.clickElement(name);

        return this;
    }

    public ByCoursePage clickEnglish() {
       elementActions.clickElement(english);
        return this;
    }

    public ByCoursePage writeSearchCourse() {
        elementActions.writeText(searchCourse, "Java");
        return this;
    }

    public ByCoursePage clickBusinessSkills() {
        elementActions.clickByJS(businessSkills);
        return this;
    }
}
