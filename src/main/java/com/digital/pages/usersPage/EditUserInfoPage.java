package com.digital.pages.usersPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

public class EditUserInfoPage extends UserHomePage {
    @FindBy(xpath = "//a[@class='tl-tool-tip']/span")
    public WebElement move2EditedUser;

    @FindBy(xpath = "//a[@class='tl-tool-tip']/span")
    public List<WebElement> moveToEditedUser;

    @FindBy(xpath = "//td[@class=' tl-align-left']")
    public List<WebElement> allUsers;

    @FindBy(xpath = "//a[@rel='tooltip']/span")
    public WebElement clickEditedUser;

    @FindBy(xpath = "(//a[@rel='tooltip']/span)[2]")
    public WebElement click2EditedUser;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement inputfFirstName;

    @FindBy(xpath = "//input[@name='surname']")
    public WebElement inputLastName;

    @FindBy(xpath = "//input[@name='login']")
    public WebElement inputUserName;

    @FindBy(xpath = "//textarea[@name='description']")
    public WebElement inputBio;

    @FindBy(xpath = "(//span[@class='select2-chosen'])[2]")
    public WebElement selectTimeZoneChosen;

    @FindBy(xpath = "(//span[@class='select2-arrow'])[3]")
    public WebElement selectLanguageChosen;

    @FindBy(xpath = "//li[@class='select2-results-dept-0 select2-result select2-result-selectable']")
    public List<WebElement> languages;

    @FindBy(xpath = "(//span[@class='select2-arrow'])[1]")
    public WebElement userTypeChosen;

    @FindBy(xpath = "//li[@class='select2-results-dept-0 select2-result select2-result-selectable']")
    public List<WebElement> userTypes;

    @FindBy(xpath = "//li[@class='select2-results-dept-0 select2-result select2-result-selectable']")
    public List<WebElement> timeZoneElements;

    @FindBy(xpath = "//input[@id='status']")
    public WebElement clickActivateCheckbox;

    @FindBy(xpath = "//input[@name='restrict_email']")
    public WebElement excludeCheckBox;

    @FindBy(xpath = "//a[@id='fileupload_input']")
    public WebElement loadImageBTN;

    @FindBy(xpath = "(//input[@type='file'])[2]")
    public WebElement imageInput;

    @FindBy(xpath = "//input[@id='user_update_submit']")
    public WebElement updateUserBtn;

    @FindBy(id = "deactivate_user")
    public WebElement deactivateUser;

    @FindBy(xpath = "(//th[@class='next'])[1]")
    public WebElement clickNextDate;

    @FindBy(xpath = "//td[@class='day ']")
    public List<WebElement> selectDeactivateDate;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement firsName;

    @FindBy(xpath = "//input[@name='surname']")
    public WebElement lastName;

    @FindBy(xpath = "//textarea[@class='span6']")
    public WebElement getInputBio;

    @FindBy(xpath = "(//span[@class='help-inline'])[1]")
    public WebElement popUpWarningFirstName;

    @FindBy(xpath = "(//span[@class='help-inline'])[2]")
    public WebElement popUpWarningLastName;

    @FindBy(xpath = "(//span[@class='help-inline'])[3]")
    public WebElement popUpWarningUserName;

    @FindBy(xpath = "//span[text()=\"'Bio' cannot exceed 800 characters\"]")
    public WebElement popUpWarningBIO;

    @FindBy(xpath = "//h4[@style='padding: 10px 0px;']")
    public WebElement popUpWarningSystem;

    public EditUserInfoPage clickToEditBtn() {
        if (move2EditedUser.getAttribute("title").contains("Torphy")) {
            elementActions.clickToRandomElement(moveToEditedUser);
        } else {
            elementActions.clickElement(move2EditedUser);
        }
        return this;
    }

    public EditUserInfoPage editFirstName(String firstName) {
        elementActions.writeText(inputfFirstName, firstName);
        return this;
    }

    public EditUserInfoPage editLastName(String txt) {
        elementActions.writeText(inputLastName, txt);
        return this;
    }

    public EditUserInfoPage editUserName(String txt){
        elementActions.writeText(inputUserName, txt);
        return this;
    }

    public EditUserInfoPage editBio(String txt){
        elementActions.writeText(inputBio, txt);
        return this;
    }

    public EditUserInfoPage timeZoneChosen() {
        elementActions.clickElement(selectTimeZoneChosen);
        return this;
    }

    public EditUserInfoPage timeZoneSelect() {
        elementActions.clickToRandomElement(timeZoneElements);
        return this;
    }

    public EditUserInfoPage languageChosenClick() {
        elementActions.clickElement(selectLanguageChosen);
        return this;
    }

    public EditUserInfoPage languageSelect() {
                    elementActions.clickToRandomElement(languages);
        return this;
    }

    public EditUserInfoPage userTypeSelected(){
       try {
           elementActions.clickElement(userTypeChosen);
           elementActions.clickToRandomElement(userTypes);
       }catch (Exception e){
           elementActions.clickElement(excludeCheckBox);
       }
        return this;
    }

    public EditUserInfoPage clickActivateCheckBox() {
        try {
            elementActions.clickElement(clickActivateCheckbox);
        }catch (Exception e){
            elementActions.clickElement(excludeCheckBox);
        }

        return this;
    }

    public EditUserInfoPage clickDeactivateCheckBox(){
        try{
        elementActions.clickElement(deactivateUser);
        }catch (Exception e){
            elementActions.clickElement(clickActivateCheckbox).clickElement(deactivateUser);
        }
        return this;
    }

    public EditUserInfoPage selectDeactivate(){
        try {
            elementActions.clickElement(clickNextDate).clickToRandomElement(selectDeactivateDate);
        }catch (Exception e){
            elementActions.clickElement(excludeCheckBox);
        }
        return this;
    }

    public EditUserInfoPage clickExcludeCheckBox(){
        elementActions.clickElement(excludeCheckBox).clickElement(excludeCheckBox);
        return this;
    }

    public EditUserInfoPage updateBtn() {
            elementActions.clickElement(updateUserBtn);
        return this;
    }

}

