package com.digital.coursesTest;

import com.digital.BaseTest;
import org.testng.annotations.Test;

public class CategoriesTest extends BaseTest {
    @Test
    void testCategories(){
        driver.get("https://nbu111.talentlms.com/category/index");
       categoriesPage.allClickMethods();

    }

}
