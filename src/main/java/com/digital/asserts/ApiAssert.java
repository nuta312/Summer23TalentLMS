package com.digital.asserts;

import com.digital.enums.StatusCodes;
import com.digital.models.BaseEntity;
import com.digital.models.User;
import com.google.protobuf.Api;
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

    public static ApiAssert assertThat(Response response) {
        return new ApiAssert(response);
    }

    public ApiAssert isCorrectStatusCode(StatusCodes expectedStatusCode) {
        if (this.response == null) assertTrue(false, "Response is null");
        Assertions.assertThat(this.response.getStatusCode())
                .withFailMessage("Response code is not correct Actual %s, Expected %s", this.response.getStatusCode(), expectedStatusCode)
                .isEqualTo(expectedStatusCode.getStatus());
        log.info("Status code is correct Actual {}, Expected {}", this.response.getStatusCode(), expectedStatusCode);
        return this;
    }

    public UserAssert assertUser(User user) {
        return UserAssert.assertThat(user);
    }
}
