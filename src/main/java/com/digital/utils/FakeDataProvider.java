package com.digital.utils;

import com.digital.models.User;
import com.github.javafaker.Faker;
import org.apache.commons.lang3.RandomStringUtils;

public class FakeDataProvider {
    static Faker faker = new Faker();

    public static String generateRandomBio() {
        return faker.lorem().paragraph();
    }

    public static String generateLogin() {
        return faker.name().username();
    }

    public static String generatePassword() {
        return faker.internet().password(5, 10);
    }

    public static int generateAge() {
        return faker.number().numberBetween(18, 60);
    }

    public static int generateSalary() {
        return faker.number().numberBetween(1000, 10000);
    }

    public static String generateFakeFirstName() {
        return faker.name().firstName();
    }

    public static String generateFakeLastName() {
        return faker.name().lastName();
    }

    public static String generateFakeEmail() {
        return faker.internet().emailAddress();
    }

    public static String generateMobilePhone() {
        return faker.regexify("[0-9]{10}");
    }

    public static String generateFakeUserCurrentAddress() {
        return faker.address().fullAddress();
    }

    public static String generateFakeUserPermanentAddress() {
        return faker.address().streetName() + " " + faker.address().streetAddressNumber();
    }

    public static String generateFakeUserName(){

        return faker.name().username();
    }

    public static String generateStrongPassword() {
        String upperCase = RandomStringUtils.randomAlphabetic(1).toUpperCase(); // Минимум 1 заглавная буква
        String lowerCase = RandomStringUtils.randomAlphabetic(1).toLowerCase(); // Минимум 1 строчная буква
        String digit = RandomStringUtils.randomNumeric(1); // Минимум 1 цифра
        String middle = RandomStringUtils.randomAlphanumeric(5); // Дополнительные 5 символов
        String password = upperCase + lowerCase + digit + middle;
        // Перемешиваем символы в пароле для большей безопасности
        password = shuffleString(password);
        return password;
    }

    public static String shuffleString(String input) {
        char[] characters = input.toCharArray();
        for (int i = 0; i < characters.length; i++) {
            int randomIndex = (int) (Math.random() * characters.length);
            char temp = characters[i];
            characters[i] = characters[randomIndex];
            characters[randomIndex] = temp;
        }
        return new String(characters);
    }

    public static String generateLongText(int wordCount) {
        StringBuilder longTextBuilder = new StringBuilder();
        while (longTextBuilder.toString().split("\\s+").length < wordCount) {
            longTextBuilder.append(faker.lorem().sentence());
            longTextBuilder.append(" ");
        }
        return longTextBuilder.toString();
    }


    public User createFakeUser() {
        User user = new User();
//      user.setUserName(generateFakeFirstName());
        user.setUserLastName(generateFakeLastName());
        user.setUserEmail(generateFakeEmail());
        user.setUserUsername(generateLogin());
        user.setUserPass(generateStrongPassword());
        user.setUserBio(generateRandomBio());
        return user;
    }

}

