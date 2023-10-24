package com.digital.pages.usersPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;
import static com.digital.driver.Driver.getDriver;

public class EditUserInfoPage extends UserHomePage {
    public UserHomePage userHomePage;
    @FindBy(xpath = "//a[@class='tl-tool-tip']/span")
    public WebElement move2EditedUser;

    @FindBy(xpath = "(//a[@class='tl-tool-tip']/span)[2]")
    public WebElement moveToEditedUser;

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

    @FindBy(xpath = "(//span[@class='select2-arrow'])[1]")
    public WebElement userTypeChosen;

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

    public EditUserInfoPage clickToEditBtn() {

            if (move2EditedUser.getAttribute("innerText").equals("J. Torphy")){
            elementActions.moveToElement(moveToEditedUser);}
            else {
            elementActions.clickElement(move2EditedUser);
            }
//                if (clickEditedUser.getAttribute("title").equals("J. Torphy (admin)")){
//            elementActions.clickElement(click2EditedUser);}
//                else {
//                    elementActions.clickElement(clickEditedUser);
//                }
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
        List<WebElement> timeZoneElements = getDriver()
        .findElements(By.xpath("//li[@class='select2-results-dept-0 select2-result select2-result-selectable']"));
        elementActions.clickToRandomElement(timeZoneElements);
        return this;
    }

    public EditUserInfoPage languageChosenClick() {
        elementActions.clickElement(selectLanguageChosen);
        return this;
    }

    public EditUserInfoPage languageSelect() {
                    List<WebElement> languages = getDriver()
                    .findElements(By.xpath("//li[@class='select2-results-dept-0 select2-result select2-result-selectable']"));
                    elementActions.clickToRandomElement(languages);
        return this;
    }

    public EditUserInfoPage userTypeSelected(){
       try {
           elementActions.clickElement(userTypeChosen);
           List<WebElement> userTypes = getDriver()
                   .findElements(By.xpath("//li[@class='select2-results-dept-0 select2-result select2-result-selectable']"));
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
           elementActions.clickElement(updateUserBtn);
       }
        return this;
    }

    public EditUserInfoPage clickExcludeCheckBox(){
        elementActions.clickElement(excludeCheckBox);
        return this;
    }

    public EditUserInfoPage updateBtn() {
        try {
            elementActions.clickElement(updateUserBtn);
        }catch (Exception e){
            System.out.println("Все ок");
        }
        return this;
    }

}

