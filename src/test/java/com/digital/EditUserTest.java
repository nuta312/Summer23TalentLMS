package com.digital;

import com.digital.pages.HomePage;
import com.digital.pages.usersPage.EditUserInfoPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EditUserTest extends BaseTest{
    public HomePage homePage;
    public EditUserInfoPage editUserInfoPage;
    @Test
    void editUserInfo() throws InterruptedException {
        homePage = new HomePage();
        homePage.openUserCategory();
        editUserInfoPage = new EditUserInfoPage();
        editUserInfoPage
                .clickToEditBtn()
                .editFirstName()
                .editLastName()
                .editBio()
                .timeZoneChosen()
                .timeZoneSelect()
                .languageChosenClick()
                .languageSelect()
                .clickDeactivateCheckBox()
                .clickExcludeCheckBox()
//                .imageLoad();
                .updateBtn();

    }

    @FindBy(xpath = "//input[@name='name']")
    public WebElement nameInput;

    public String getNameInputText() {
        return nameInput.getAttribute("value");
    }
    @Test(priority = 1)
    void assertEditedUser(){
        homePage = new HomePage();
        editUserInfoPage = new EditUserInfoPage();
        homePage.openUserCategory();
        Assert.assertEquals(getNameInputText(), editUserInfoPage.firstName);
    }
}
