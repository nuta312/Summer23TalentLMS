package com.digital.utils;

import com.digital.models.User;

import static com.digital.utils.FakeDataProvider.*;

public class EntityManager {

    public static User generateUser() {
        return User.builder()
                .userFirstName(generateFakeFirstName())
                .userLastName(generateFakeLastName())
                .userEmail(generateFakeEmail())
                .userUsername(generateLogin())
                .userPass(generateStrongPassword())
                .build();
    }
}
