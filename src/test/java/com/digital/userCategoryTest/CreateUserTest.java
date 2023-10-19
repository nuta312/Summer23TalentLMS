package com.digital.userCategoryTest;

import com.digital.BaseTest;
import com.digital.models.User;
import com.digital.utils.FakeDataProvider;
import org.testng.annotations.Test;

public class CreateUserTest extends BaseTest {
    @Test
    void userAddTest(){
        fakeDataProvider = new FakeDataProvider();
        User user = fakeDataProvider.createFakeUser();


    }

}
