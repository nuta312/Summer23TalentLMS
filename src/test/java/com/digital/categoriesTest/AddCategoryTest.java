package com.digital.categoriesTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AddCategoryTest extends CategoriesBaseTest {
    @Test(priority = 1,groups = "Regression Tests")
    void testClickAddCategoryBtnOnHomePage(){
       addCategoryPage.clickAddCategoryBtnOnHomePage();
        Assert.assertTrue(addCategoryPage.expectedTextName.getText().contains("Name"));
    }
    @Test(priority = 2,groups = "Regression Tests")
    void testFillUpFieldNameInput(){
        addCategoryPage.fillUpFieldNameInput();
        Assert.assertTrue(addCategoryPage.expectedAfterFillUpFieldNameInput.getText().contains("78"));
    }
    @Test(priority = 3,groups = "Regression Tests")
    void testChooseParentCategory(){
        addCategoryPage.chooseParentCategory();
        Assert.assertTrue(addCategoryPage.expectedChooseParentCategory.getText().contains("Parent category"));
    }
    @Test(priority = 4,groups = "Regression Tests")
    void testClickPriceBtn(){
        addCategoryPage.clickPriceBtn();
        Assert.assertTrue(addCategoryPage.expectedAfterClickPriceBtn.getText().contains("$"));
    }
    @Test(priority = 5,groups = "Regression Tests")
    void testFillUpFieldPriceInput(){
        addCategoryPage.fillUpFieldPriceInput();
        Assert.assertTrue(addCategoryPage.expectedAfterFillUpFieldPriceInput.getText().contains("Price"));
    }
    @Test(priority = 6,groups = "Regression Tests")
    void testClickAddNewCategoryBtn(){
        addCategoryPage.clickAddNewCategoryBtn();
        Assert.assertTrue(addCategoryPage.expectedAfterClickAddNewCategoryBtn.getText().contains("QA"));
    }
    @Test(priority = 7,groups = "Regression Tests")
    void testClickNewAddedCategoryOptionsDeleteBtn(){
        addCategoryPage.clickNewAddedCategoryOptionsDeleteBtn();
    }
    @Test(priority = 8,groups = "Regression Tests")
    void testClickDeleteBtn(){
        addCategoryPage.clickDeleteBtn();
    }
}
