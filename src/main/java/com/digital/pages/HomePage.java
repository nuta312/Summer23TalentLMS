package com.digital.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    @FindBy(xpath = "//div[@class='tl-icons-block'][1]")
    public WebElement userCategoryBlock;


    public HomePage openUserCategory() {
        elementActions.clickElement(userCategoryBlock);
        return this;
    }


}
