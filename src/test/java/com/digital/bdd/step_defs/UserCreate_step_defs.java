package com.digital.bdd.step_defs;

import com.digital.config.ConfigReader;
import com.digital.driver.Driver;
import com.digital.pages.HomePage;
import com.digital.pages.LoginPage;
import com.digital.pages.usersPage.CreateUserPage;
import io.cucumber.java.en.Given;

public class UserCreate_step_defs {
    LoginPage loginPage = new LoginPage();
    CreateUserPage createUserPage = new CreateUserPage();
    @Given("go to login page and login")
    public void go_to_login_page_and_login() {
        Driver.getDriver().get(ConfigReader.getProperty("BASE_URL"));
        loginPage.logIn();
    }
    @Given("click add user button")
    public void click_add_user_button() {
        createUserPage.addUserBtn.click();

    }
    @Given("enter firstname {string}")
    public void enter_firstname(String firstName) {
        createUserPage.firstNameInput.sendKeys(firstName);

    }
    @Given("enter lastname {string}")
    public void enter_lastname(String lastName) {
        createUserPage.lastNameInput.sendKeys(lastName);

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
