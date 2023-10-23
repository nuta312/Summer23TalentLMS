package com.digital.pages.categoriesPage;

import com.digital.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class CategoriesPage extends BasePage {

    @FindBy(xpath = "//a[text()='Add category']")
    public WebElement addCategoryBtn;

    @FindBy(xpath = "//a[text()='Samples']")
    public WebElement samplesCategory;

    @FindBy(xpath = "//tr[@class='even']//div[@class='tl-table-operations-trigger touchable']//i[@class='icon-ellipsis-h tl-table-operations-icon']")
    public WebElement samplesCategoryOptions;

    @FindBy(xpath = "(//i[@alt='Edit'])[2]")
    public WebElement samplesCategoryOptionsEditBtn;

    @FindBy(xpath = "(//i[@alt='Delete'])[2]")
    public WebElement samplesCategoryOptionsDeleteBtn;
    @FindBy(xpath = "(//a[@class='btn'])[2]")
    public WebElement cancelBtn;

    @FindBy(xpath = "//i[@class='icon-download tl-icon19']")
    public WebElement saveAsCSVBtn;

    @FindBy(xpath = "//a[@href='https://nbu111.talentlms.com/catalog']")
    public WebElement viewCourseCatalogBtn;

    @FindBy(xpath = "//label[text()='Name']")
    public WebElement expectedTextName;
    @FindBy(xpath = "//label[text()='Name']")
    public WebElement expectedAfterClickSamplesCategory;
    @FindBy(xpath = "//label[text()='Name']")
    public WebElement expectedAfterClickSamplesCategoryOptionsBtn;

    @FindBy(xpath = "//b[text()='Samples']")
    public WebElement expectedAfterClickSamplesCategoryOptionsDeleteBtn;
    @FindBy(xpath = "//span[@class='tl-current-sorting-type']")
    public WebElement expectedAfterClickViewCourseCatalogBtn;


    public CategoriesPage clickBtnAddCategory() {
        elementActions.clickElement(addCategoryBtn);
        return this;
    }

    public CategoriesPage clickSampleCategory() {
        elementActions.clickElement(samplesCategory);
        return this;
    }

    private CategoriesPage hoverMouseToSamplesCategoryOptions() {
        elementActions.moveToElement(samplesCategoryOptions);
        return this;
    }

    public CategoriesPage clickSamplesCategoryOptionsEditBtn() {
        CategoriesPage categoriesPage = new CategoriesPage();
        categoriesPage.hoverMouseToSamplesCategoryOptions();
        elementActions.clickElement(samplesCategoryOptionsEditBtn);
        return this;
    }

    private CategoriesPage clickCancelBtn() {
        elementActions.clickElement(cancelBtn);
        return this;
    }

    public CategoriesPage clickSamplesCategoryOptionsDeleteBtn() {
        CategoriesPage categoriesPage = new CategoriesPage();
        categoriesPage.hoverMouseToSamplesCategoryOptions();
        elementActions.clickElement(samplesCategoryOptionsDeleteBtn);
        categoriesPage.clickCancelBtn();
        return this;
    }

    public CategoriesPage clickViewCourseCatalogBtn() {
        elementActions.clickElement(viewCourseCatalogBtn);
        return this;
    }

    public CategoriesPage clickSaveAsCSVBtn() {
        elementActions.clickElement(saveAsCSVBtn);
        return this;
    }
}
