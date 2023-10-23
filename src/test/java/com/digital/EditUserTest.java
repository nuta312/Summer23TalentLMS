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
        String generatedFirstname = fakeDataProvider.generateFakeFirstName();
        String generateLastName = fakeDataProvider.generateFakeLastName();
        String generateBIO = fakeDataProvider.generateRandomBio();
        editUserInfoPage
                .clickToEditBtn()
                .editFirstName(generatedFirstname)
                .editLastName(generateLastName)
                .editBio(generateBIO)
                .timeZoneChosen()
                .timeZoneSelect()
                .languageChosenClick()
                .languageSelect()
                .userTypeSelected()
                .clickActivateCheckBox()
                .clickExcludeCheckBox()
                .updateBtn();

        Assert.assertEquals(editUserInfoPage.firsName.getAttribute("value"), generatedFirstname);
        Assert.assertEquals(editUserInfoPage.lastName.getAttribute("value"), generateLastName);
//        Assert.assertEquals(editUserInfoPage.getInputBio.getAttribute("innerText"), generateBIO);
    }
}
