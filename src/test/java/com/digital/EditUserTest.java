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
    void editAndAssertUserInfo() throws InterruptedException {
        homePage = new HomePage();
        homePage.openUserCategory();
        editUserInfoPage = new EditUserInfoPage();
        String fakeFirstName = fakeDataProvider.generateFakeFirstName();
        String fakeLastName = fakeDataProvider.generateFakeLastName();
        String fakeUserName = fakeDataProvider.generateFakeUserName();
        String BIO = fakeDataProvider.generateRandomBio();
        editUserInfoPage
                .clickToEditBtn()
                .editFirstName(fakeFirstName)
                .editLastName(fakeLastName)
                .editUserName(fakeUserName)
                .editBio(BIO)
                .timeZoneChosen()
                .timeZoneSelect()
                .languageChosenClick()
                .languageSelect()
                .userTypeSelected()
                .clickActivateCheckBox()
                .clickExcludeCheckBox()
                .updateBtn();

        Assert.assertEquals(editUserInfoPage.firsName.getAttribute("value"), fakeFirstName);
        Assert.assertEquals(editUserInfoPage.lastName.getAttribute("value"), fakeLastName);
//        Assert.assertEquals(editUserInfoPage.getInputBio.getAttribute("innerText"), BIO);
    }
}
