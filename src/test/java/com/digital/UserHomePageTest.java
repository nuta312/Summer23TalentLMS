package com.digital;

import com.digital.pages.HomePage;
import com.digital.pages.usersPage.UserHomePage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class UserHomePageTest extends BaseTest{
    public HomePage homePage;

    @BeforeClass
    void setHomePage(){
        userHomePage = new UserHomePage();
    }

    @Test
    void  checkTableOptions(){
        homePage = new HomePage();
        homePage.openUserCategory();
    }



}
