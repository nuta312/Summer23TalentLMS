package com.digital.pages.coursesPage;

import com.digital.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddCategoryPage extends BasePage {

    @FindBy(xpath = "//input[@name='name']")
    public WebElement fieldNameInput;


}
