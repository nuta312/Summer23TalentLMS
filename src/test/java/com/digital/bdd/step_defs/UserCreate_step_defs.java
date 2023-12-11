package com.digital.bdd.step_defs;

import com.digital.config.ConfigReader;
import com.digital.driver.Driver;
import com.digital.pages.LoginPage;
import com.digital.pages.usersPage.CreateUserPage;
import com.google.protobuf.StringValue;
import io.cucumber.java.en.Given;

public class UserCreate_step_defs {
    LoginPage loginPage = new LoginPage();
    CreateUserPage createUserPage = new CreateUserPage();

    @Given("go to login page and login")
    public void go_to_login_page_and_login() {
        Driver.getDriver().get(ConfigReader.getProperty("BASE_URL"));
        loginPage.logIn();

    }
    @Given("click and user button")
    public void click_and_user_button() {
        createUserPage.addUserBtn.click();

    }
    @Given("enter firstname {string}")
    public void enter_firstname(String firstname) {
        createUserPage.firstNameInput.sendKeys(firstname);

    }
    @Given("enter lastname {string}")
    public void enter_lastname(String lastname) {
        createUserPage.lastNameInput.sendKeys(lastname);
    }
    @Given("enter email {string}")
    public void enter_email(String email) {
        createUserPage.emailInput.sendKeys(email);

    }
    @Given("enter bio {int}")
    public void enter_bio(Integer number) throws InterruptedException {
        createUserPage.bioInput.sendKeys(String.valueOf(number));
        Thread.sleep(7000);

    }
}
