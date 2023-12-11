package com.digital.bdd.step_defs;

import com.digital.pages.LoginPage;
import io.cucumber.java.en.Given;

public class ScenarioOutline_step_defs {

    LoginPage loginPage = new LoginPage();
    @Given("user should enter email {string}")
    public void user_should_enter_email(String email) {
        loginPage.loginInput.sendKeys(email);

    }
    @Given("user should enter password {string}")
    public void user_should_enter_password(String password) {
        loginPage.loginInput.sendKeys(password);

    }

}
