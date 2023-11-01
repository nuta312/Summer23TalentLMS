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

        Assert.assertEquals(editUserInfoPage.firsName.getAttribute("value"), fakeFirstName);
        Assert.assertEquals(editUserInfoPage.lastName.getAttribute("value"), fakeLastName);
//        Assert.assertEquals(editUserInfoPage.getInputBio.getAttribute("innerText"), BIO);
    }
}
