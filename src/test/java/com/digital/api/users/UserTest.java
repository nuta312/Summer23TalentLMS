package com.digital.api.users;

import com.digital.api.BaseApiTest;
import com.digital.api.controllers.UserController;
import com.digital.config.ConfigReader;
import com.digital.models.User;
import com.digital.utils.EntityManager;
import org.junit.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import static com.digital.api.controllers.UserController.By.ID;
import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertNotNull;

public class UserTest extends BaseApiTest {
        User user;
    @BeforeClass(alwaysRun = true)
    public void beforeClass(){
        userController = new UserController(ConfigReader.getProperty("url"));
    }

    @Test()
    public void userTest(){
        user = userController.receiveUser(ID, "2");
        assertEquals("User not", "Kanzada", user.getUserFirstName());
    }

    @Test
    public void createUser(){
        user = EntityManager.generateUser();
        user = userController.createUser(user);
        assertNotNull(user.getId());
    }
}
