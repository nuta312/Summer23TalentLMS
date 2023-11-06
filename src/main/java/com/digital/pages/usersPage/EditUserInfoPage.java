package com.digital.pages.usersPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EditUserInfoPage extends UserHomePage {
    @FindBy(xpath = "(//td[@class=' tl-align-left'])[2]")
    public WebElement move2EditedUser;

    @FindBy(xpath = "//a[@class='tl-tool-tip']")
    public List<WebElement> moveToEditedUser;

    @FindBy(xpath = "//a[@class='tl-tool-tip']")
    public WebElement allUsers;

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

    @FindBy(xpath = "//div[@class='toast-message']")
    public WebElement updatedMessage;

    @FindBy(xpath = "//input[@name='login']")
    public WebElement userEmail;

    @FindBy(xpath = "//img[@class='avatar-square']")
    public WebElement avatareSquare;

    @FindBy(xpath = "//a[@class='dropdown-toggle tl-nabvar-roles-button']/b")
    public WebElement dropdownToggle;

    @FindBy(xpath = "(//a[@class='dropdown-toggle'])[1]")
    public WebElement dropDown1;

    @FindBy(xpath = "(//a[@class='dropdown-toggle'])[2]")
    public WebElement dropDown2;

    @FindBy(xpath = "(//a[@class='dropdown-toggle'])[3]")
    public WebElement dropDown3;

    @FindBy(xpath = "//a[@id='tl-upgrade-link']")
    public WebElement dropDown4;

    @FindBy(xpath = "//input[@id='tl-spotlight']")
    public WebElement dropDown5;

    @FindBy(xpath = "//div[@class='alert alert-info fade in out']/h4")
    public WebElement dropDown6;

    @FindBy(xpath = "(//span[@class='tl-box-title-options']/a)[1]")
    public WebElement dropDown7;

    @FindBy(xpath = "(//span[@class='tl-box-title-options']/a)[2]")
    public WebElement dropDown8;

    @FindBy(xpath = "(//div[@class='tl-title tl-ellipsis']/span)[2]")
    public WebElement dropDown9;

    @FindBy(xpath = "//li[@class='active']/a")
    public WebElement dropDown10;

    @FindBy(xpath = "(//ul[@class='nav nav-tabs']/li/a)[2]")
    public WebElement dropDown11;

    @FindBy(xpath = "(//ul[@class='nav nav-tabs']/li/a)[3]")
    public WebElement dropDown12;

    @FindBy(xpath = "(//ul[@class='nav nav-tabs']/li/a)[4]")
    public WebElement dropDown13;

    @FindBy(xpath = "(//ul[@class='nav nav-tabs']/li/a)[5]")
    public WebElement dropDown14;

    @FindBy(xpath = "//a[@class='btn active']")
    public WebElement dropDown15;

    @FindBy(xpath = "(//a[@class='btn'])[1]")
    public WebElement dropDown16;

    @FindBy(xpath = "(//a[@class='btn'])[2]")
    public WebElement dropDown17;

    @FindBy(xpath = "(//label[@class='control-label tl-mandatory-label'])[1]")
    public WebElement dropdown18;

    @FindBy(xpath = "(//label[@class='control-label tl-mandatory-label'])[2]")
    public WebElement dropDown19;

    @FindBy(xpath = "(//label[@class='control-label tl-mandatory-label'])[3]")
    public WebElement dropDown20;

    @FindBy(xpath = "(//label[@class='control-label tl-mandatory-label'])[4]")
    public WebElement dropDown21;

    @FindBy(xpath = "(//label[@class='control-label'])[1]")
    public WebElement dropDown22;

    @FindBy(xpath = "(//label[@class='control-label'])[2]")
    public WebElement dropDown23;

    @FindBy(xpath = "(//label[@class='control-label'])[3]")
    public WebElement dropDown24;

    @FindBy(xpath = "(//label[@class='control-label'])[4]")
    public WebElement dropDown25;

    @FindBy(xpath = "(//label[@class='control-label'])[5]")
    public WebElement dropDown26;

    @FindBy(xpath = "(//label[@class='checkbox inline'])[1]")
    public WebElement dropDown27;

    @FindBy(xpath = "(//label[@class='checkbox inline'])[2]")
    public WebElement dropDown28;

    @FindBy(xpath = "(//label[@class='checkbox inline'])[3]")
    public WebElement dropDown29;

    @FindBy(xpath = "//div[@id='tl-user-deactivate-wrapper']")
    public WebElement deactivateCheckBox;

    @FindBy(xpath = "//span[@id='tl-user-deactivate-more']")
    public WebElement deactivateDate;

//    public EditUserInfoPage clickToEditBtn() {
//        if (!move2EditedUser.getAttribute("title").contains("Torphy") && move2EditedUser.getAttribute("innerText").contains("inactive")) {
//            elementActions.clickElement(move2EditedUser);
//        } else {
//            elementActions.clickToRandomElement(moveToEditedUser);
//        }
//        return this;
//    }

    public EditUserInfoPage clickToEditBtn() {
        List<WebElement> selectedElements = new ArrayList<>();
        for (WebElement element : moveToEditedUser) {
            String innerText = element.getText();
            if (innerText != null && !innerText.contains("Torphy")){
                selectedElements.add(element);
            }
        }
        if (!selectedElements.isEmpty()) {
          elementActions.clickToRandomElement(selectedElements);
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

    public EditUserInfoPage editUserEmail(String txt){
        elementActions.writeText(userEmail, txt);
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
        if(!deactivateCheckBox.getAttribute("style").contains("display: none;")){
            System.out.println("user activated");
        }else{
            elementActions.clickElement(clickActivateCheckbox);
        }
        return this;
    }

    public EditUserInfoPage clickDeactivateCheckBox(){
        if(deactivateDate.getAttribute("style").contains("display: none;")){
            System.out.println("deactivate date selected");
        }else {
            elementActions.clickElement(deactivateUser);
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

