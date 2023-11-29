package com.digital.userCategoryTest;

import com.digital.BaseTest;
import com.digital.models.User;
import com.digital.utils.FakeDataProvider;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.function.Consumer;

public class CreateUserTest extends UserHomePageTest {
    @Test(priority = 1,groups = "SmokeTests")
    void userAddTest() {
        fakeDataProvider = new FakeDataProvider();
        User user = fakeDataProvider.createFakeUser();
        createUser
                .clickAddUserBtn()
//                .fillUpFirstNameInput(user.getUserName())
                .fillUpLastNameInput(user.getUserLastName())
                .fillUpEmailInput(user.getUserEmail())
                .fillUpUsernamenput(user.getUserUsername())
                .fillUpPasswordInput(user.getUserPass())
                .fillUpBioInput(user.getUserBio())
                .clickToRandomUserTypeMenu()
                .clickToRandomTimeZoneMenu()
                .clickToRandomLang()
                .clickToActivateInput(true)
                .clickToExludeFromEmailsInput(true)
                .clickToSubmitFormBtn()
                .navigateToUserHomePage()
                .getAllUsersInTable();
    }

    @Test(priority = 2, description = "This test verifies if a new user is added to the table",groups = "SmokeTests")
    void checkForAddingUserToTable() {
        String expectedString = (createUser.expectedUserInfo.get(2));
        boolean isContained = false;
        for (String user : createUser.getAllUsersInTable()) {
            if (user.toLowerCase().contains(expectedString)) {
                isContained = true;
                break;
            }
        }
        Assert.assertTrue(isContained);
    }

    @Test(priority = 3, description = "This test checks if the active input is selected", groups = "RegressionTests")
    void checkActiveInputIsSelected() {
        Assert.assertFalse(createUser.isActiveInputSelected);
    }

    @Test(priority = 4, description = "This test checks if the exludeFromEmail input is selected", groups = "RegressionTests")
    void checkExludeFromEmailInputIsSelected() {
        Assert.assertTrue(createUser.isExludeFromEmailInputSelected);
    }

    @Test(priority = 5, description = "This test checks if the deactive input is displayed",groups = "RegressionTests")
    void checkDisplayedDeactiveInput() {
        Assert.assertFalse(createUser.isDeactiveInputDisplayed());
    }

    @Test(priority = 6, description = "This test checks validation for empty fields",groups = "SmokeTests")
    void checkEmptyFieldValidation() {
        driver.get("https://nbu111.talentlms.com/user/create");
        checkFieldValidation(createUser.firstNameInputError, "'First name' is required", createUser::fillUpFirstNameInput);
        checkFieldValidation(createUser.lastNameInputError, "'Last name' is required", createUser::fillUpLastNameInput);
        checkFieldValidation(createUser.emailInputError, "'Email address' is required", createUser::fillUpEmailInput);
        checkFieldValidation(createUser.usernameInputError, "'Username' is required", createUser::fillUpUsernamenput);
    }

    private void checkFieldValidation(WebElement errorElement, String expectedErrorMessage, Consumer<String> inputMethod) {
        inputMethod.accept("");
        createUser.clickToSubmitFormBtn();
        Assert.assertTrue(isValidationErrorDisplayed(errorElement, expectedErrorMessage));
    }

    private boolean isValidationErrorDisplayed(WebElement errorElement, String expectedErrorMessage) {
        return errorElement.isDisplayed() && errorElement.getText().contains(expectedErrorMessage);
    }

    @Test(priority = 7, description = "This test checks validation for limit characters fields",groups = "SmokeTests")
    void checkInputsCharactersLimit() {
        driver.get("https://nbu111.talentlms.com/user/create");
//        checkCharactersLimitValidationMessage(createUser.firstNameInputError, "'First name' cannot exceed 50 characters", createUser::fillUpFirstNameInput);
        checkCharactersLimitValidationMessage(createUser.lastNameInputError, "'Last name' cannot exceed 50 characters", createUser::fillUpLastNameInput);
        checkCharactersLimitValidationMessage(createUser.emailInputError, "This is not a valid 'Email address", createUser::fillUpEmailInput);
        checkCharactersLimitValidationMessage(createUser.passwordInputError, "'Password' cannot exceed 30 characters", createUser::fillUpPasswordInput);
        checkCharactersLimitValidationMessage(createUser.bioInputError, "'Bio' cannot exceed 800 characters", this::fillBioInputWithLongText);
    }

    private void checkCharactersLimitValidationMessage(WebElement errorElement, String expectedErrorMessage, Consumer<String> inputMethod) {
        fakeDataProvider = new FakeDataProvider();
        String randomText = "ThisIsALongStringWithMoreThan50CharactersToExceedTheLimit";
        inputMethod.accept(randomText);
        createUser.clickToSubmitFormBtn();
        Assert.assertTrue(isValidationErrorDisplayed(errorElement, expectedErrorMessage));
    }

    private void fillBioInputWithLongText(String longText) {
        String randomTextForBioField = FakeDataProvider.generateLongText(810);
        createUser.fillUpBioInput(randomTextForBioField);
    }


}




