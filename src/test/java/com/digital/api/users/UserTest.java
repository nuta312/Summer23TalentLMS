package com.digital.api.users;

import com.digital.api.BaseApiTest;
import com.digital.api.controllers.UserController;
import com.digital.asserts.ApiAssert;
import com.digital.config.ConfigReader;
import com.digital.models.User;
import com.digital.utils.EntityManager;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.util.Objects;
import static com.digital.enums.StatusCodes.HTTP_OK;
public class UserTest extends BaseApiTest {
    User expectedUser;

    @BeforeClass(alwaysRun = true)
    public void beforeClass() {
        userController = new UserController(ConfigReader.getProperty("url"));
        User [] users = userController.getUsers();
        if (users.length==5) {
            for (User userIn : users){
                if(!Objects.equals(userIn.getUserId(), "1")){
                    userController.deleteUser(userIn.getUserId());

                }
            }
        }
        Assert.assertEquals(userController.getResponse().getStatusCode(), 200);

    }

    @Test
    public void createUser() {
        expectedUser = EntityManager.generateUser();
        User actualUser = userController.createUser(expectedUser);
        ApiAssert.assertThat(userController.getResponse())
                .isCorrectStatusCode(HTTP_OK)
                .assertUser(actualUser)
                .isCorrectFirstName(expectedUser.getUserFirstName());
    }
}
