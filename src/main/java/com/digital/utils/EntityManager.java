package com.digital.utils;

import com.digital.models.User;

public class EntityManager {
    public static User generateUser() {
        return User.builder()
                .userFirstName(FakeDataProvider.generateFakeFirstName())
                .userLastName(FakeDataProvider.generateFakeLastName())
                .userEmail(FakeDataProvider.generateFakeEmail())
                .userUsername(FakeDataProvider.generateLogin())
                .userPass(FakeDataProvider.generateStrongPassword()).build();
    }
}
