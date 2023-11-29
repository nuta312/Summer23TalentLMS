package com.digital.api.users;

import com.digital.api.BaseApiTest;
import com.digital.api.controllers.UserController;
import com.digital.config.ConfigReader;
import com.digital.models.User;
import com.digital.utils.EntityManager;
import org.testng.annotations.*;

import static com.digital.api.controllers.UserController.By.ID;
import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

public class UserTests extends BaseApiTest {
    User user;

    @BeforeClass(alwaysRun = true)
    public void beforeClass() {
        userController = new UserController(ConfigReader.getProperty("url"));
    }

    @Test()
    public void userTest() {
        user = userController.receiveUser(ID, "1");
        assertEquals("User first name is not correct", "Aidin", user.getUserFirstName());
    }

    @Test()
    public void createUser() {
        user = EntityManager.generateUser();
        user = userController.createUser(user);
        assertNotNull(user.getId());
    }
}
