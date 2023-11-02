package com.digital.categoriesTest;

import com.digital.config.ConfigReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CategoriesTest extends CategoriesBaseTest {
    @Test(priority = 1)
    void testClickBtnAddCategory() {
        driver.get(ConfigReader.getProperty("CATEGORY_URL"));
        categoriesPage.clickBtnAddCategory();
        Assert.assertTrue(categoriesPage.expectedTextName.getText().contains("Name"));
        elementActions.navigateBack();
    }
    @Test(priority = 2,groups = "Regression Tests")
    void testClickSampleCategory(){
        categoriesPage.clickSampleCategory();
        Assert.assertTrue(categoriesPage.expectedAfterClickSamplesCategory.getText().contains("Name"));
        elementActions.navigateBack();
    }
    @Test(priority = 3,groups = "Regression Tests")
    void  testClickSamplesCategoryOptionsEditBtn(){
        categoriesPage.clickSamplesCategoryOptionsEditBtn();
        Assert.assertTrue(categoriesPage.expectedAfterClickSamplesCategoryOptionsBtn.getText().contains("Name"));
        elementActions.navigateBack();
    }
    @Test(priority = 4,groups = "Regression Tests")
    void  testClickSamplesCategoryOptionsDeleteBtn(){
        categoriesPage.clickSamplesCategoryOptionsDeleteBtn();
    }
    @Test(priority = 5,groups = "Regression Tests")
    void  testClickViewCourseCatalogBtn(){
        categoriesPage.clickViewCourseCatalogBtn();
        Assert.assertTrue(categoriesPage.expectedAfterClickViewCourseCatalogBtn.getText().contains("Name"));
        elementActions.navigateBack();
    }
    @Test(priority = 6,groups = "Regression Tests")
    void testClickSaveAsCSVBtn(){
        categoriesPage.clickSaveAsCSVBtn();
    }

}
