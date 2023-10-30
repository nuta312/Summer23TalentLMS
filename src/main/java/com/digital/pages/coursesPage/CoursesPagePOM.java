package com.digital.pages.coursesPage;


import com.digital.pages.BasePage;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;


public class CoursesPagePOM extends BasePage {
    @FindBy(xpath = "//input[@id = 'tl-grid-checkbox-all']")
    public WebElement courseCheckBoxAll;

    @FindBy(xpath = "//span[@title = 'simple']")
    public WebElement simpleHyperText;

    @FindBy(xpath = "//i[@class = 'icon-signal icon-grid']")
    public WebElement simpleSignalIcon;

    @FindBy(xpath = "//*[@class = ' tl-align-center hidden-phone']")
    public WebElement pustoeMesto;

    @FindBy(xpath = "//i[@class = 'icon-pencil icon-grid']")
    public WebElement simplePencilIcon;

    @FindBy(xpath = "//i[@class = 'icon-magnet icon-grid']")
    public WebElement simpleMagnetIcon;

    @FindBy(xpath = "(//*[text() = 'Cancel'])[1]")
    public WebElement simpleMagnetIconBack;

    @FindBy(xpath = "(//*[text() = 'Cancel'])[5]")
    public WebElement simpleRemoveIconBack;

    @FindBy(xpath = "//i[@class = 'icon-remove icon-grid']")
    public WebElement simpleRemoveIcon;



    public CoursesPagePOM checkBoxAllTest() {
        elementActions.moveToElement(courseCheckBoxAll);
        elementActions.clickElement(courseCheckBoxAll);
        return this;
    }

    public CoursesPagePOM toClickSimpleHyperTextAndReturnBack() {
        simpleHyperText.click();
        elementActions.navigateBack();
        return this;
    }

    public CoursesPagePOM toClickSignalIconAndReturnBack() {
        elementActions.moveToElement(pustoeMesto);
        elementActions.clickByJS(simpleSignalIcon);
        elementActions.navigateBack();
        return this;
    }

    public CoursesPagePOM toClickPencilIconAndReturnBack() {
        elementActions.moveToElement(pustoeMesto);
        elementActions.clickByJS(simplePencilIcon);
        elementActions.navigateBack();
        return this;
    }

    public CoursesPagePOM toClickMagnetIconAndClickCancel() {
        elementActions.moveToElement(pustoeMesto);
        elementActions.clickByJS(simpleMagnetIcon);
        elementActions.clickByJS(simpleMagnetIconBack);
        return this;
    }

    public CoursesPagePOM toClickRemoveIconAndClickCancel() {
        elementActions.moveToElement(pustoeMesto);
        elementActions.clickByJS(simpleRemoveIcon);
        elementActions.clickByJS(simpleRemoveIconBack);
        return this;
    }
}


