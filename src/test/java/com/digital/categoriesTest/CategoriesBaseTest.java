package com.digital.categoriesTest;

import com.digital.BaseTest;
import com.digital.config.ConfigReader;
import com.digital.pages.categoriesPage.AddCategoryPage;
import com.digital.pages.categoriesPage.CategoriesPage;
import org.testng.annotations.BeforeClass;

public class CategoriesBaseTest extends BaseTest {

    public CategoriesPage categoriesPage;
    public AddCategoryPage addCategoryPage;

    @BeforeClass
    public void setUpCoursesHome() {
        addCategoryPage = new AddCategoryPage();
        categoriesPage = new CategoriesPage();
        driver.get(ConfigReader.getProperty("CATEGORY_URL"));
    }
}
