package com.digital.coursesTest;

import com.digital.BaseTest;
import com.digital.driver.Driver;
import com.digital.helper.ElementActions;
import com.digital.pages.categoriesPage.AddCategoryPage;
import com.digital.pages.coursesPage.CreateCoursePage;
import com.github.javafaker.Faker;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.asserts.SoftAssert;

public abstract class CoursesBaseTest extends BaseTest {
    public CreateCoursePage createCoursePage;
    public SoftAssert soft;
    public Faker faker;
    public ElementActions elementActions;
    public AddCategoryPage addCategoryPage;

    @BeforeClass
    public void setUpCoursesHome() {
      //driver = Driver.getDriver();
        createCoursePage = new CreateCoursePage();
        soft = new SoftAssert();
        faker = new Faker();
        elementActions = new ElementActions();
        addCategoryPage = new AddCategoryPage();

    }
}

