package com.digital.pages.usersPage;

import com.digital.pages.BasePage;
import org.openqa.selenium.WebElement;

public class CreateUserPage extends BasePage {
    //aibike

    public WebElement addUserBtn;

    public CreateUserPage clickAddUserBtn(){
        elementActions.clickElement(addUserBtn);
        return this;
    }

    public CreateUserPage fillUpFirstNameInput(){
        return this;
    }
    public CreateUserPage fillUpLastNameInput(){
        return this;
    }
    public CreateUserPage fillUpEmailInput(){
        return this;
    }
    public CreateUserPage fillUpUsernamenput(){
        return this;
    }
    public CreateUserPage fillUpPasswordInput(){
        return this;
    }
    public CreateUserPage fillUpBioInput(){
        return this;
    }

}
