package com.digital.asserts;

import com.digital.api.ApiRequest;
import com.digital.enums.StatusCodes;
import com.digital.models.BaseEntity;
import com.digital.models.User;
import io.restassured.response.Response;
import lombok.extern.slf4j.Slf4j;
import org.assertj.core.api.Assertions;

import static org.testng.Assert.assertTrue;

@Slf4j

public class ApiAssert {
    Response response;

    public ApiAssert(Response response) {
        this.response = response;
    }

    public static ApiAssert asserThat(Response response) {
        return new ApiAssert(response);
    }

    public ApiAssert isCorrectStatusCode(StatusCodes expectedStatusCode) {
        if (this.response == null) assertTrue(false, "response is null");
        Assertions.assertThat(this.response.getStatusCode())
                .withFailMessage("Response code is not correct Actual %s, Expected %s", this.response.getStatusCode(), expectedStatusCode)
                .isEqualTo(expectedStatusCode.getStatus());
        log.info("Status code is correct Actual {}, Expected {}", this.response.getStatusCode(), expectedStatusCode);
        return this;
    }
    public UserAssert assertUser(){
        return UserAssert.assertThat(this.response.as(User.class));

    }
}
