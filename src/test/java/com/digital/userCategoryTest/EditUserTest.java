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
        String BIO = "Вы помните,\n" +
                "Вы всё, конечно, помните,\n" +
                "Как я стоял,\n" +
                "Приблизившись к стене,\n" +
                "Взволнованно ходили вы по комнате\n" +
                "И что-то резкое\n" +
                "В лицо бросали мне.\n" +
                "Вы говорили:\n" +
                "Нам пора расстаться,\n" +
                "Что вас измучила\n" +
                "Моя шальная жизнь,\n" +
                "Что вам пора за дело приниматься,\n" +
                "А мой удел —\n" +
                "Катиться дальше, вниз.\n" +
                "Любимая!\n" +
                "Меня вы не любили.\n" +
                "Не знали вы, что в сонмище людском\n" +
                "Я был как лошадь, загнанная в мыле,\n" +
                "Пришпоренная смелым ездоком.\n" +
                "Не знали вы,\n" +
                "Что я в сплошном дыму,\n" +
                "В развороченном бурей быте\n" +
                "С того и мучаюсь, что не пойму —\n" +
                "Куда несет нас рок событий.\n" +
                "Лицом к лицу\n" +
                "Лица не увидать.\n" +
                "Большое видится на расстоянье.\n" +
                "Когда кипит морская гладь —\n" +
                "Корабль в плачевном состоянье.\n" +
                "Земля — корабль!\n" +
                "Но кто-то вдруг\n" +
                "За новой жизнью, новой славой\n" +
                "В прямую гущу бурь и вьюг\n" +
                "Ее направил величаво.\n" +
                "Ну кто ж из нас на палубе большой\n" +
                "Не падал, не блевал и не ругался?\n" +
                "Их мало, с опытной душой,\n" +
                "Кто крепким в качке оставался.\n" +
                "Тогда и я,\n" +
                "Под дикий шум,\n" +
                "Но зрело знающий работу,\n" +
                "Спустился в корабельный трюм,\n" +
                "Чтоб не смотреть людскую рвоту.\n" +
                "Тот трюм был —\n" +
                "Русским кабаком.\n" +
                "И я склонился над стаканом,\n" +
                "Чтоб, не страдая ни о ком,\n" +
                "Себя сгубить\n" +
                "В угаре пьяном.\n" +
                "Любимая!\n" +
                "Я мучил вас,\n" +
                "У вас была тоска\n" +
                "В глазах усталых:\n" +
                "Что я пред вами напоказ\n" +
                "Себя растрачивал в скандалах.\n" +
                "Но вы не знали,\n" +
                "Что в сплошном дыму,\n" +
                "В развороченном бурей быте\n" +
                "С того и мучаюсь,\n" +
                "Что не пойму,\n" +
                "Куда несет нас рок событий…\n" +
                "Теперь года прошли.\n" +
                "Я в возрасте ином.\n" +
                "И чувствую и мыслю по-иному.\n" +
                "И говорю за праздничным вином:\n" +
                "Хвала и слава рулевому!\n" +
                "Сегодня я\n" +
                "В ударе нежных чувств.\n" +
                "Я вспомнил вашу грустную усталость.\n" +
                "И вот теперь\n" +
                "Я сообщить вам мчусь,\n" +
                "Каков я был,\n" +
                "И что со мною сталось!\n" +
                "Любимая!\n" +
                "Сказать приятно мне:\n" +
                "Я избежал паденья с кручи.\n" +
                "Теперь в Советской стороне\n" +
                "Я самый яростный попутчик.\n" +
                "Я стал не тем,\n" +
                "Кем был тогда.\n" +
                "Не мучил бы я вас,\n" +
                "Как это было раньше.\n" +
                "За знамя вольности\n" +
                "И светлого труда\n" +
                "Готов идти хоть до Ла-Манша.\n" +
                "Простите мне…\n" +
                "Я знаю: вы не та —\n" +
                "Живете вы\n" +
                "С серьезным, умным мужем;\n" +
                "Что не нужна вам наша маета,\n" +
                "И сам я вам\n" +
                "Ни капельки не нужен.\n" +
                "Живите так,\n" +
                "Как вас ведет звезда,\n" +
                "Под кущей обновленной сени.\n" +
                "С приветствием,\n" +
                "Вас помнящий всегда\n" +
                "Знакомый ваш\n" +
                "Сергей Есенин.";

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
                .clickExcludeCheckBox()
                .updateBtn();

        Assert.assertEquals(editUserInfoPage.firsName.getAttribute("value"), fakeFirstName);
        Assert.assertEquals(editUserInfoPage.lastName.getAttribute("value"), fakeLastName);
//        Assert.assertEquals(editUserInfoPage.getInputBio.getAttribute("innerText"), BIO);
    }
}
