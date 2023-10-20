package com.digital.pages.usersPage;

import com.digital.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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

    public List<String> expectedUserInfo;

    public List<String> usersListInTable;
    @FindBy(xpath = "(//div[@class='select2-container tl-select2'])[1]")
    public WebElement openUserType;
    @FindBy(xpath = "(//div[@class='select2-container tl-select2'])[2]")
    public WebElement openTimeZone;
    @FindBy(xpath = "//input[@id='status']/..")
    public WebElement activeInput;
    @FindBy(xpath = "//input[@id='deactivate_user']/..")
    public WebElement deactiveInput;
    @FindBy(xpath = "//label[contains(text(),'User type')]/..//span")
    public WebElement spanOfUserType;
    @FindBy(xpath = "//label[contains(text(),'Time zone')]/..//span")
    public WebElement spanOfTimezone;
    @FindBy(xpath = "//label[contains(text(),'Language')]/..//span")
    public WebElement spanOfLanguage;
    @FindBy(xpath = "//input[@name='restrict_email']/..")
    public WebElement exludeFromEmailsInput;
    @FindBy(xpath = "//input[@value='Add user']")
    public WebElement submitBtn;
    @FindBy(xpath = "//a[@title='Users']")
    public WebElement linkToNavigateUserHomePage;
    @FindBy(xpath = "//div[@id='tl-users-grid_wrapper']//tbody/tr")
    public List<WebElement> allUsersInTable;
    public boolean isActiveInputSelected;
    public boolean isExludeFromEmailInputSelected;
    public boolean isDeactiveInputDisplayed;
    @FindBy(xpath = "//div[@class='select2-result-label']/..")
    List<WebElement> listDropsMenu;

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
        elementActions.clickElement(openUserType);
        elementActions.clickToRandomElement(listDropsMenu);
        expectedUserInfo.add(spanOfUserType.getAttribute("innerText"));
        return this;
    }

    public CreateUserPage clickToRandomLang() {
        elementActions.clickElement(openTimeZone);
        elementActions.clickToRandomElement(listDropsMenu);
        expectedUserInfo.add(spanOfTimezone.getAttribute("innerText"));
        return this;
    }

    public CreateUserPage clickToRandomTimeZoneMenu() {
        elementActions.clickElement(openTimeZone);
        elementActions.clickToRandomElement(listDropsMenu);
        expectedUserInfo.add(spanOfLanguage.getAttribute("innerText"));
        return this;
    }

    public CreateUserPage clickToActivateInput(boolean isActive) {
        if (isActive) {
            elementActions.clickElement(activeInput);
        }
        isActiveInputActivated();
        return this;
    }

    public boolean isActiveInputActivated() {
        isActiveInputSelected = activeInput.isSelected();
        return isActiveInputSelected;
    }


    public CreateUserPage clickToExludeFromEmailsInput(boolean isExlude) {
        if (isExlude) {
            elementActions.clickElement(exludeFromEmailsInput);
        }
        isExludeFromEmailsInputActivated();
        return this;
    }

    public boolean isExludeFromEmailsInputActivated() {
        isExludeFromEmailInputSelected = exludeFromEmailsInput.isEnabled();
        return isExludeFromEmailInputSelected;
    }

    public CreateUserPage navigateToUserHomePage() {
        elementActions.clickElement(linkToNavigateUserHomePage);
        return this;
    }

    public CreateUserPage clickToSubmitFormBtn() {
        elementActions.clickElement(submitBtn);
        return this;
    }

    public boolean isDeactiveInputDisplayed() {
        isDeactiveInputDisplayed = false;
        return isDeactiveInputDisplayed;
    }

    public List<String> getAllUsersInTable() {
        usersListInTable = new ArrayList<>();
        for (WebElement el : allUsersInTable) {
            String userText = el.getText();
            usersListInTable.add(userText);
        }
        return usersListInTable;
    }


}
