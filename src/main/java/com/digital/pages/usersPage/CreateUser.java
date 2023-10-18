package com.digital.pages.usersPage;

import com.digital.pages.BasePage;
import org.openqa.selenium.WebElement;

public class CreateUser extends BasePage {
    //aibike

    public WebElement addUserBtn;

    public CreateUser clickAddUserBtn(){
        elementActions.clickElement(addUserBtn);
        return this;
    }

    public CreateUser fillUpFirstNameInput(){
        return this;
    }
    public CreateUser fillUpLastNameInput(){
        return this;
    }
    public CreateUser fillUpEmailInput(){
        return this;
    }
    public CreateUser fillUpUsernamenput(){
        return this;
    }
    public CreateUser fillUpPasswordInput(){
        return this;
    }
    public CreateUser fillUpBioInput(){
        return this;
    }

}
