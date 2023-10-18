package com.digital.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BuyCoursesPage extends BasePage {
    @FindBy (xpath = "//ul[@class = 'nav nav-tabs']/li[2]/a")
    WebElement navigateOtherCourses;
    @FindBy (xpath = "//ul[@class = 'nav nav-tabs']/li[1]/a")
    WebElement navigateTalentLibraryCourses;
    @FindBy (xpath = "//div[@id='grid_marketplace_filter']/label/input")
    WebElement searchPlace;

    public BuyCoursesPage navigateMarket(){
        elementActions.clickElement(navigateOtherCourses);
        elementActions.clickElement(navigateTalentLibraryCourses);
        return this;


    }



}
