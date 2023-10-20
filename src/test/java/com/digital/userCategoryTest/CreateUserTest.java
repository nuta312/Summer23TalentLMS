package com.digital.userCategoryTest;

import com.digital.models.User;
import com.digital.utils.FakeDataProvider;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateUserTest extends UserHomePageTest {
    @Test(priority = 1)
    void userAddTest() {
        fakeDataProvider = new FakeDataProvider();
        User user = fakeDataProvider.createFakeUser();
        createUser
                .clickAddUserBtn()
                .fillUpFirstNameInput(user.getUserName())
                .fillUpLastNameInput(user.getUserLastName())
                .fillUpEmailInput(user.getUserEmail())
                .fillUpUsernamenput(user.getUserUsername())
                .fillUpPasswordInput(user.getUserPass())
                .fillUpBioInput(user.getUserBio())
                .clickToRandomUserTypeMenu()
                .clickToRandomTimeZoneMenu()
                .clickToRandomLang()
                .clickToActivateInput(true)
                .clickToExludeFromEmailsInput(true)
                .clickToSubmitFormBtn()
                .navigateToUserHomePage()
                .getAllUsersInTable();
    }

    @Test(priority = 2, description = "This test verifies if a new user is added to the table")
    void checkForAddingUserToTable() {
        String expectedString = (createUser.expectedUserInfo.get(2));
        boolean isContained = false;
        for (String user : createUser.getAllUsersInTable()) {
            if (user.toLowerCase().contains(expectedString)) {
                isContained = true;
                break;
            }
        }
        Assert.assertTrue(isContained);
    }


    @Test(description = "This test checks if the active input is selected")
    void checkActiveInputIsSelected(){
        Assert.assertFalse(createUser.isActiveInputSelected);
    }

    @Test(description = "This test checks if the exludeFromEmail input is selected")
    void checkExludeFromEmailInputIsSelected(){
        Assert.assertFalse(createUser.isExludeFromEmailInputSelected);
    }

    //поправить метод, добавить клик
    //по умолчанию не отображен
    @Test(description = "This test checks if the deactive input is displayed")
    void checkDisplayedDeactiveInput(){
        Assert.assertFalse(createUser.isDeactiveInputDisplayed());
    }

}
