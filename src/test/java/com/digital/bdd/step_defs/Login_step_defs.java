package com.digital.bdd.step_defs;

import com.digital.config.ConfigReader;
import com.digital.driver.Driver;
import com.digital.enums.UserCredentials;
import com.digital.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.*;



public class Login_step_defs {

    LoginPage loginPage = new LoginPage();

    @Given("user is on login page")
    public void user_is_on_login_page() {
        Driver.getDriver().get(ConfigReader.getProperty("BASE_URL"));


    }
    @Given("user should enter username or email")
    public void user_should_enter_username_or_email() {
loginPage.loginInput.sendKeys(UserCredentials.ADMIN.getUsername());
    }
    @Given("user name should enter password")
    public void user_name_should_enter_password() {
        loginPage.passwordInput.sendKeys(UserCredentials.ADMIN.getPassword());

    }
    @When("user clicks the login button")
    public void user_clicks_the_login_button() {
        loginPage.submitBtn.click();
    }
    @Then("user should successfully login")
    public void user_should_successfully_login() {
        Assertions.assertEquals(Driver.getDriver().getCurrentUrl(),ConfigReader.getProperty("BASE_URL"));
    }

    @Given("user should enter valid username or email")
    public void user_should_enter_valid_username_or_email() {

        loginPage.loginInput.sendKeys(UserCredentials.ADMIN.getUsername());
    }

    @Given("user should invalid password")
    public void user_should_invalid_password() {
        loginPage.passwordInput.sendKeys("NotValidPassword");

    }
    @Then("user cant login")
    public void user_cant_login() {
        Assertions.assertFalse(Driver.getDriver().getCurrentUrl().equals(ConfigReader.getProperty("BASE_URL")));
    }
}
