package com.digital.utils;


import com.digital.models.Course;
import com.digital.models.User;
import io.restassured.response.Response;




public class EntityManager {
    public static User generateUser() {
        return User.builder()
                .userFirstName(FakeDataProvider.generateFakeFirstName())
                .userLastName(FakeDataProvider.generateFakeLastName())
                .userEmail(FakeDataProvider.generateFakeEmail())
                .userUsername(FakeDataProvider.generateLogin())
                .userPass(FakeDataProvider.generateStrongPassword()).build();
    }

     public static Course generateCourse(){
        return Course.builder()
                .name(FakeDataProvider.generateCourseName())
                .code(FakeDataProvider.generateAge())
                .creatorId(1)
                .description(FakeDataProvider.generateLongText(10))
                .price(String.valueOf(FakeDataProvider.generateSalary()))
                .build();
     }

}

