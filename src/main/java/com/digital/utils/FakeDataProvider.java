package com.digital.utils;

import com.digital.models.User;
import com.github.javafaker.Faker;

public class FakeDataProvider {
    static Faker faker = new Faker();

    public User createFakeUser(){
        User user = new User();
        user.setUserName(generateFakeFirstName());
        user.setUserLastName(generateFakeLastName());
        user.setUserEmail(generateFakeEmail());
        user.setUserUsername(generateLogin());
        user.setUserPass(generatePassword());
        user.setUserBio(generateRandomBio());
        return user;
    }
    public static String generateRandomBio() {
        return faker.lorem().paragraph();
    }


    public static String generateLogin(){
        return faker.name().username();
    }
    public static String generatePassword(){
        return faker.internet().password(5,10);
    }

    public static  int generateAge(){
        return faker.number().numberBetween(18,60);
    }


    public static  int generateSalary(){
        return faker.number().numberBetween(1000,10000);    }


    public static String generateFakeFirstName(){
        return faker.name().firstName();


    } public static String generateFakeLastName(){
        return faker.name().lastName();
    }


    public static String generateFakeEmail(){
        return faker.internet().emailAddress();
    }

    public static String generateMobilePhone(){
        return faker.regexify("[0-9]{10}") ;
    }

    public static String generateFakeUserCurrentAddress(){
        return faker.address().fullAddress();
    }
    public static String generateFakeUserPermanentAddress(){
        return faker.address().streetName() + " " + faker.address().streetAddressNumber();
    }
}
