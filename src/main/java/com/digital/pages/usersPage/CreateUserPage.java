package com.digital.pages.usersPage;

import com.digital.driver.Driver;
import com.digital.pages.BasePage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class CreateUserPage extends BasePage {
    //aibike

    @FindBy(xpath = "//a[contains(text(), 'Add user')]")
    public WebElement addUserBtn;
    @FindBy(xpath = "//input[@name='name']")
    public WebElement firstNameInput;
    @FindBy(xpath = "//input[@name='surname']")

    public WebElement lastNameInput;
    @FindBy(xpath = "//input[@name='email']")

    public WebElement emailInput;
    @FindBy(xpath = "//input[@name='login']")

    public WebElement usernameInput;
    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordInput;

    @FindBy(xpath = "//textarea[@name='description']")

    public WebElement bioInput;

    @FindBy(xpath = "//label[contains(text(),'User type')]/../div/div")
    public WebElement userTypeInput;

    @FindBy(xpath = "//select[@name='acl_user_type_id']")
    public WebElement userTypeSelectOptions;
    public List<String> expectedUserInfo;


    public CreateUserPage clickAddUserBtn() {
        elementActions.clickElement(addUserBtn);
        expectedUserInfo = new ArrayList<>();
        return this;
    }

    public CreateUserPage fillUpFirstNameInput(String txt) {
        elementActions.writeText(firstNameInput, txt);
        expectedUserInfo.add(txt);
        return this;
    }

    public CreateUserPage fillUpLastNameInput(String txt) {
        elementActions.writeText(lastNameInput, txt);
        expectedUserInfo.add(txt);
        return this;
    }

    public CreateUserPage fillUpEmailInput(String txt) {
        elementActions.writeText(emailInput, txt);
        expectedUserInfo.add(txt);
        return this;
    }

    public CreateUserPage fillUpUsernamenput(String txt) {
        elementActions.writeText(usernameInput, txt);
        expectedUserInfo.add(txt);
        return this;
    }

    public CreateUserPage fillUpPasswordInput(String txt) {
        elementActions.writeText(passwordInput, txt);
        expectedUserInfo.add(txt);
        return this;
    }

    public CreateUserPage fillUpBioInput(String txt) {
        elementActions.writeText(bioInput, txt);
        expectedUserInfo.add(txt);
        return this;
    }

    public CreateUserPage clickToRandomUserTypeMenu() {
        elementActions.clickElement(userTypeInput);
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        String optionValue = "Admin-Type";
        js.executeScript("arguments[0].dispatchEvent(new Event('change', { bubbles: true }));", userTypeSelectOptions);
        js.executeScript("arguments[0].value = '" + optionValue + "';", userTypeSelectOptions);
        return this;
    }

}
