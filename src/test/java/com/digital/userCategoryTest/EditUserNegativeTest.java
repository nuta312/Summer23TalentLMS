package com.digital.userCategoryTest;

import com.digital.BaseTest;
import com.digital.pages.HomePage;
import com.digital.pages.usersPage.EditUserInfoPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EditUserNegativeTest extends BaseTest {

    public HomePage homePage;
    public EditUserInfoPage editUserInfoPage;


    @Test
    void editAndAssertUserInfo() throws InterruptedException {
        homePage = new HomePage();
        homePage.openUserCategory();
        editUserInfoPage = new EditUserInfoPage();
        String fakeNegr = "popopopopopopopopopopopopopopopopopopopoppopopopopopopopopopopopopopopopoeproeproepro" +
                "eporpeoreproeporpeorpeoreproeproeproeproeproeproeproeproeporeproeproeproeproeproeproepropor";
        String BIO =   "Великая многогранность искусства, впитавшая в себя бесчисленные стили, направления и эпохи, представляет собой бескрайнее поле для исследования и вдохновения. Каждый художник, будь то мастер прошлых веков или современный авангардист, находит в искусстве свой уникальный язык, свое воплощение идей, свое видение мира. Искусство может быть порталом в другие измерения, где слова и формы могут уступить место чувствам, интуиции и внутренним переживаниям.\n" +
                "\n" + "Картины, скульптуры, музыка, литература, танец и театр - все они приглашают нас в свои миры, наполняют наши дни и ночи смыслом и эмоциями. Они способны вызвать в нас радость, грусть, восхищение и восторг. В них звучат голоса прошлых поколений, их мудрость и страсти. Они позволяют нам видеть мир под разными углами зрения, вдохновляют на новые свершения и приоткрывают завесу тайны перед нами.\n" +
                "\n" + "Искусство - это путь к самопознанию и самовыражению. Оно позволяет нам обнаруживать скрытые грани своей души и делиться ими с окружающими. Это средство коммуникации, способное преодолеть языковые и культурные барьеры. Великие художники, музыканты, писатели и артисты создают произведения, которые переживают поколения, вдохновляют новые поколения и формируют историю человечества.\n" +
                "\n" + "Искусство - это также зеркало общества и времени, в котором оно рождается. Оно отражает ценности, убеждения и противоречия общества, его духовные и материальные аспекты. Искусство может поднимать важные вопросы и вызывать обсуждения, оно может быть инструментом изменения и преобразования.\n" +
                "\n" + "Искусство - это навсегда живая и развивающаяся сфера, которая никогда не ограничивается рамками и ожиданиями. Она стремится к новым высотам, открывая перед нами бескрайние просторы для исследования и творчества. И, возможно, именно в этой бесконечной разнообразности искусства скрыто будущее человечества, где каждый может найти свое место и свой голос.\n" +
                "\n" + "Таким образом, искусство остается вечным источником вдохновения, истории и культуры, и его значение невозможно переоценить.";

        editUserInfoPage
                .clickToEditBtn()
                .editFirstName(fakeNegr)
                .editLastName(fakeNegr)
                .editUserName(fakeNegr)
                .editUserEmail(fakeNegr)
                .editBio(BIO)
                .userTypeSelected()
                .timeZoneChosen()
                .timeZoneSelect()
                .languageChosenClick()
                .languageSelect()
                .clickActivateCheckBox()
                .clickExcludeCheckBox()
                .updateBtn();

        String expectedWarningText = "The system is currently locked";
        String actualWarningText = editUserInfoPage.popUpWarningSystem.getText().trim();
        String expectedPopUpFirstNameText = "'First name' cannot exceed 50 characters";
        String actualPopUpFirstNameText = editUserInfoPage.popUpWarningFirstName.getAttribute("innerText");
        String expectedPopUpLastNameText = "'Last name' cannot exceed 50 characters";
        String actualPopUpLastNameText = editUserInfoPage.popUpWarningLastName.getAttribute("innerText");
        String expectedPopUpUserNameText = "'Email address' cannot exceed 150 characters";
        String actualPopUpUserNameText = editUserInfoPage.popUpWarningUserName.getAttribute("innerText");
        String expectedPopUpBIOText = "'Bio' cannot exceed 800 characters";
        String actualPopUpBIOText = editUserInfoPage.popUpWarningBIO.getAttribute("innerText");

        Assert.assertEquals(actualPopUpFirstNameText, expectedPopUpFirstNameText);
        Assert.assertEquals(actualPopUpLastNameText, expectedPopUpLastNameText);
        Assert.assertEquals(actualPopUpUserNameText, expectedPopUpUserNameText);
        Assert.assertEquals(actualPopUpBIOText, expectedPopUpBIOText);
        Assert.assertEquals(actualWarningText, expectedWarningText);

    }
}
