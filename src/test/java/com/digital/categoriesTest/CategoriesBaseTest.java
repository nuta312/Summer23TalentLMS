package com.digital.categoriesTest;

import com.digital.BaseTest;
import com.digital.helper.ElementActions;
import com.digital.pages.categoriesPage.AddCategoryPage;
import com.digital.pages.categoriesPage.CategoriesPage;
import org.testng.annotations.BeforeTest;

public class CategoriesBaseTest extends BaseTest {

    public CategoriesPage categoriesPage;
    public AddCategoryPage addCategoryPage;

    @BeforeTest
    public void setUpCoursesHome() {
        addCategoryPage = new AddCategoryPage();
        categoriesPage = new CategoriesPage();
    }
}
