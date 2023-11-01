package com.digital.categoriesTest;

import com.digital.coursesTest.CoursesBaseTest;
import com.digital.config.ConfigReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CategoriesTest extends CoursesBaseTest {
    @Test(priority = 1)
    void testClickBtnAddCategory() {
        driver.get(ConfigReader.getProperty("CATEGORY_URL"));
        categoriesPage.clickBtnAddCategory();
        Assert.assertTrue(categoriesPage.expectedTextName.getText().contains("Name"));
        elementActions.navigateBack();
    }
    @Test(priority = 2)
    void testClickSampleCategory(){
        categoriesPage.clickSampleCategory();
        Assert.assertTrue(categoriesPage.expectedAfterClickSamplesCategory.getText().contains("Name"));
        elementActions.navigateBack();
    }
    @Test(priority = 3)
    void  testClickSamplesCategoryOptionsEditBtn(){
        categoriesPage.clickSamplesCategoryOptionsEditBtn();
        Assert.assertTrue(categoriesPage.expectedAfterClickSamplesCategoryOptionsBtn.getText().contains("Name"));
        elementActions.navigateBack();
    }
    @Test(priority = 4)
    void  testClickSamplesCategoryOptionsDeleteBtn(){
        categoriesPage.clickSamplesCategoryOptionsDeleteBtn();
    }
    @Test(priority = 5)
    void  testClickViewCourseCatalogBtn(){
        categoriesPage.clickViewCourseCatalogBtn();
        Assert.assertTrue(categoriesPage.expectedAfterClickViewCourseCatalogBtn.getText().contains("Name"));
        elementActions.navigateBack();
    }
    @Test(priority = 6)
    void testClickSaveAsCSVBtn(){
        categoriesPage.clickSaveAsCSVBtn();
    }

}
