package com.digital.pages.coursesPage;

import com.digital.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CategoriesPage extends BasePage {

    @FindBy (xpath = "//a[text()='Add category']")
    public WebElement addCategoryBtn;

    @FindBy(xpath = "//a[text()='Samples']")
    public WebElement samplesCategory;

    @FindBy(xpath = "//tr[@class='even']//div[@class='tl-table-operations-trigger touchable']//i[@class='icon-ellipsis-h tl-table-operations-icon']")
    public WebElement samplesCategoryOptions;

    @FindBy(xpath = "(//i[@alt='Edit'])[2]")
    public WebElement samplesCategoryOptionsEditBtn;

    @FindBy(xpath = "(//i[@alt='Delete'])[2]")
    public WebElement samplesCategoryOptionsDeleteBtn;

    @FindBy(xpath = "//i[@class='icon-download tl-icon19']")
    public WebElement saveAsCSVBtn;

    @FindBy(xpath = "//a[text()='View course catalog']")
    public WebElement viewCourseCatalogBtn;


}
