package com.digital.api.users;

import com.digital.api.BaseApiTest;
import com.digital.config.ConfigReader;
import com.digital.api.controllers.UserController;
import com.digital.models.User;
import com.digital.utils.EntityManager;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class UserTest extends BaseApiTest {
    User user;

    @BeforeClass(alwaysRun = true)
    public void beforeClass() {
        userController = new UserController(ConfigReader.getProperty("url"));
    }

    @Test()
    public void userTest() {
        user = userController.receiveUser(UserController.By.ID, "1");
        Assert.assertEquals(user.getUserFirstName(), "Adil");
    }


    @Test
    public void createUser() {
        user = EntityManager.generateUser();
        user = userController.createUser(user);
        Assert.assertNotNull(user.getId());
    }
}
