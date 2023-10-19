package com.digital.userCategoryTest;

import com.digital.BaseTest;
import com.digital.models.User;
import com.digital.utils.FakeDataProvider;
import org.testng.annotations.Test;

public class CreateUserTest extends UserHomePageTest {
    @Test
    void userAddTest(){
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
                .clickToRandomUserTypeMenu();

    }

}
