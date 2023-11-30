package com.digital.api;

import com.digital.api.controllers.UserController;
import com.digital.config.ConfigReader;

import com.digital.models.User;

import com.digital.utils.EntityManager;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Objects;

public class UserTest extends BaseApiTest {
    User user;

    @BeforeClass(alwaysRun = true)
    public void beforeClass() {
        userController = new UserController(ConfigReader.getProperty("url"));
        User [] users = userController.getUsers();
        if (users.length==5) {
            for (User userIn : users){
                if(!Objects.equals(userIn.getUserid(), "1")){
                    userController.deleteUser(userIn.getUserid());
                    break;
                }
            }
        }
        Assert.assertEquals(userController.getResponse().getStatusCode(), 200);
    }




    @Test
    public void createUser() {
        user = EntityManager.generateUser();
        user = userController.createUser(user);
        Assert.assertNotNull(user.getUserid());
        Assert.assertEquals(userController.getResponse().getStatusCode(), 201);
    }



}

