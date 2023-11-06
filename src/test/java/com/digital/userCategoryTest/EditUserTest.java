package com.digital.userCategoryTest;
import com.digital.pages.HomePage;
import com.digital.pages.usersPage.EditUserInfoPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EditUserTest extends UserHomePageTest{
    @Test(groups = "SmokeTests")
    void editAndAssertUserInfo() throws InterruptedException {
        homePage = new HomePage();
        editUserInfoPage = new EditUserInfoPage();
        String fakeFirstName = fakeDataProvider.generateFakeFirstName();
        String fakeLastName = fakeDataProvider.generateFakeLastName();
        String fakeUserName = fakeDataProvider.generateFakeUserName();
        String fakeEmail = fakeDataProvider.generateFakeEmail();
        String updatedText = "User details updated successfully"+" " + "An error occured (unknown error)";
        String notUpdateText = "";
        String BIO =
                "Вы помните, Вы всё, конечно, помните,\n" +
                        "Как я стоял, Приблизившись к стене,\n" +
                        "Взволнованно ходили вы по комнате\n" +
                        "И что-то резкое, В лицо бросали мне.\n" +
                        "Вы говорили: Нам пора расстаться,\n" +
                        "Что вас измучила, Моя шальная жизнь,\n" +
                        "Что вам пора за дело приниматься, А мой удел —\n" +
                        "Катиться дальше, вниз. Любимая!";

        editUserInfoPage
                .clickToEditBtn()
                .editFirstName(fakeFirstName)
                .editLastName(fakeLastName)
                .editUserName(fakeUserName)
                .editUserEmail(fakeEmail)
                .editBio(BIO)
                .userTypeSelected()
                .timeZoneChosen()
                .timeZoneSelect()
                .languageChosenClick()
                .languageSelect()
                .clickActivateCheckBox()
                .clickDeactivateCheckBox()
                .selectDeactivate()
                .clickExcludeCheckBox()
                .updateBtn();

        Assert.assertNotNull(editUserInfoPage.updatedMessage.getAttribute("innerText"));
        Assert.assertEquals(editUserInfoPage.firsName.getAttribute("value"), fakeFirstName);
        Assert.assertEquals(editUserInfoPage.lastName.getAttribute("value"), fakeLastName);
        Assert.assertEquals(editUserInfoPage.getInputBio.getAttribute("value"), BIO);
        Assert.assertEquals(editUserInfoPage.userEmail.getAttribute("value"), fakeEmail);
        Assert.assertNotNull(editUserInfoPage.dropdownToggle.getAttribute("innerText"), "это not null");
        Assert.assertEquals(editUserInfoPage.dropDown1.getAttribute("innerText"), "GO TO   ");
        Assert.assertEquals(editUserInfoPage.dropDown2.getAttribute("innerText"), "MESSAGES ");
        Assert.assertEquals(editUserInfoPage.dropDown3.getAttribute("innerText"), "HELP ");
        Assert.assertEquals(editUserInfoPage.dropDown4.getAttribute("innerText"), "UPGRADE NOW");
        Assert.assertEquals(editUserInfoPage.dropDown5.getAttribute("placeholder"), "Search");
        Assert.assertEquals(editUserInfoPage.dropDown6.getAttribute("innerText"), " The system is currently locked");
        Assert.assertEquals(editUserInfoPage.dropDown7.getAttribute("title"), "Home");
        Assert.assertEquals(editUserInfoPage.dropDown8.getAttribute("title"), "Users");
        Assert.assertNotNull(editUserInfoPage.dropDown9.getAttribute("innerText"), "это не null");
        Assert.assertEquals(editUserInfoPage.dropDown10.getAttribute("innerText"), "Info");
        Assert.assertEquals(editUserInfoPage.dropDown11.getAttribute("innerText"), "Courses");
        Assert.assertEquals(editUserInfoPage.dropDown12.getAttribute("innerText"), "Groups");
        Assert.assertEquals(editUserInfoPage.dropDown13.getAttribute("innerText"), "Branches");
        Assert.assertEquals(editUserInfoPage.dropDown14.getAttribute("innerText"), "Files");
        Assert.assertEquals(editUserInfoPage.dropDown15.getAttribute("innerText"), "Profile");
        Assert.assertEquals(editUserInfoPage.dropDown16.getAttribute("innerText"), "Progress");
        Assert.assertEquals(editUserInfoPage.dropDown17.getAttribute("innerText"), "Infographic");
        Assert.assertEquals(editUserInfoPage.dropdown18.getAttribute("innerText"), "First name");
        Assert.assertEquals(editUserInfoPage.dropDown19.getAttribute("innerText"), "Last name");
        Assert.assertEquals(editUserInfoPage.dropDown20.getAttribute("innerText"), "Email address");
        Assert.assertEquals(editUserInfoPage.dropDown21.getAttribute("innerText"), "Username");
        Assert.assertEquals(editUserInfoPage.dropDown22.getAttribute("innerText"), "Password");
        Assert.assertEquals(editUserInfoPage.dropDown23.getAttribute("innerText"), "Bio");
        Assert.assertEquals(editUserInfoPage.dropDown24.getAttribute("innerText"), "User type");
        Assert.assertEquals(editUserInfoPage.dropDown25.getAttribute("innerText"), "Time zone");
        Assert.assertEquals(editUserInfoPage.dropDown26.getAttribute("innerText"), "Language");
        Assert.assertEquals(editUserInfoPage.dropDown27.getAttribute("innerText"), "Active");
        Assert.assertEquals(editUserInfoPage.dropDown28.getAttribute("innerText"), "Deactivate at ");
        Assert.assertEquals(editUserInfoPage.dropDown29.getAttribute("innerText"), "Exclude from emails ");
    }
}
