package com.digital;

import com.digital.pages.HomePage;
import org.testng.annotations.Test;

public class EditUserTest extends BaseTest{
    public HomePage homePage;
    @Test
    void editUserInfo(){
        homePage = new HomePage();
        homePage.openUserCategory();
        editUserInfo
                .clickToEditBtn()
                .editFirstName()
                .editLastName()
                .editBio()
                .timeZoneChosen()
                .timeZoneSelect()
                .languageChosenClick()
                .languageSelect()
                .clickCheckBox()
                .imageLoad()
                .updateBtn();

    }
}
