package com.digital.utils;

import com.github.javafaker.Faker;
import lombok.Data;

@Data
public class FakeDataProvider {

    static Faker faker = new Faker();

    public String generateFirstName(){
        return faker.name().firstName();
    }
    public String generateLastName(){return  faker.name().lastName();}

    public String generateFullName(){return faker.name().fullName();}

    public String generateFakeEmail(){
        return faker.internet().emailAddress();
    }
    public String generatePhoneNumber(){return faker.number().digits(10);}

    public String generateFakeCurrentAddress(){
        return faker.address().fullAddress();
    }

    public String generateFakePermanentAddress(){
        return faker.address().secondaryAddress();
    }
    public String generateFakeUserName(){return faker.name().username();}

    public String generateFakeUserPassword(){return faker.internet().password(8, 12);}


    }
