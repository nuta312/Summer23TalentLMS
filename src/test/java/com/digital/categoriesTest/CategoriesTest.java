package com.digital.coursesTest;

import com.digital.BaseTest;
import com.digital.config.ConfigReader;
import com.digital.helper.ElementActions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CategoriesTest extends BaseTest {
    @Test
    void testCategories() {
        driver.get(ConfigReader.getProperty("CATEGORY_URL"));
        categoriesPage.clickBtnAddCategory();
        Assert.assertTrue(categoriesPage.expectedTextName.getText().contains("Name"));
        ElementActions elementActions = new ElementActions();
        elementActions.navigateBack();
    }
    @Test
    void

}
