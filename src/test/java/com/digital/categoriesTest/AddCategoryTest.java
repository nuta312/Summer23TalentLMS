package com.digital.categoriesTest;

import com.digital.CoursesCategoriesBaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddCategoryTest extends CoursesCategoriesBaseTest {
    @Test(priority = 1)
    void testClickAddCategoryBtnOnHomePage(){
       addCategoryPage.clickAddCategoryBtnOnHomePage();
        Assert.assertTrue(addCategoryPage.expectedTextName.getText().contains("Name"));
    }
    @Test(priority = 2)
    void testFillUpFieldNameInput(){
        addCategoryPage.fillUpFieldNameInput();
        Assert.assertTrue(addCategoryPage.expectedAfterFillUpFieldNameInput.getText().contains("78"));
    }
    @Test(priority = 3)
    void testChooseParentCategory(){
        addCategoryPage.chooseParentCategory();
        Assert.assertTrue(addCategoryPage.expectedChooseParentCategory.getText().contains("Parent category"));
    }
    @Test(priority = 4)
    void testClickPriceBtn(){
        addCategoryPage.clickPriceBtn();
        Assert.assertTrue(addCategoryPage.expectedAfterClickPriceBtn.getText().contains("$"));
    }
    @Test(priority = 5)
    void testFillUpFieldPriceInput(){
        addCategoryPage.fillUpFieldPriceInput();
        Assert.assertTrue(addCategoryPage.expectedAfterFillUpFieldPriceInput.getText().contains("Price"));
    }
    @Test(priority = 6)
    void testClickAddNewCategoryBtn(){
        addCategoryPage.clickAddNewCategoryBtn();
        Assert.assertTrue(addCategoryPage.expectedAfterClickAddNewCategoryBtn.getText().contains("QA"));
    }
    @Test(priority = 7)
    void testClickNewAddedCategoryOptionsDeleteBtn(){
        addCategoryPage.clickNewAddedCategoryOptionsDeleteBtn();
    }
    @Test(priority = 8)
    void testClickDeleteBtn(){
        addCategoryPage.clickDeleteBtn();
    }
}
