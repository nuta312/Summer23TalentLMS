package com.digital;

import com.digital.api.controllers.UserController;
import com.digital.config.ConfigReader;
import com.fasterxml.jackson.databind.JsonSerializable;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class UserTests extends BaseApiTest {
    @BeforeClass (alwaysRun = true)
    public void beforeClass(){
        userController= new UserController(ConfigReader.getProperty("url"));

    }
    @Test
    public void userTest(){

    }
}
