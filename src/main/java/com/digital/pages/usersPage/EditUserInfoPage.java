package com.digital.pages.usersPage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.io.IOException;
import java.util.List;

import static com.digital.driver.Driver.driver;
import static com.digital.driver.Driver.getDriver;

public class EditUserInfoPage extends UserHomePage {
    public UserHomePage userHomePage;
    @FindBy(xpath = "//tr[@class='even']")
    public WebElement moveToEditedUser;
    @FindBy(xpath = "(//a[@rel='tooltip'])[3]")
    public WebElement clickEditedUser;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement inputfFirstName;

    @FindBy(xpath = "//input[@name='surname']")
    public WebElement inputLastName;

    @FindBy(xpath = "//textarea[@name='description']")
    public WebElement inputBio;

    @FindBy(xpath = "(//span[@class='select2-chosen'])[2]")
    public WebElement selectTimeZoneChosen;

    @FindBy(xpath = "((//span[@class='select2-chosen'])[2]")
    public WebElement selectTimeZone;

    @FindBy(xpath = "(//span[@class='select2-arrow'])[3]")
    public WebElement selectLanguageChosen;

    @FindBy(xpath = "//input[@id='deactivate_user']")
    public WebElement clickDeactivateCheckbox;

    @FindBy(xpath = "//input[@name='restrict_email']")
    public WebElement clickExcludeCheckBox;

    @FindBy(xpath = "//a[@id='fileupload_input']")
    public WebElement loadImageBTN;

    @FindBy(xpath = "(//input[@type='file'])[2]")
    public WebElement imageInput;

    @FindBy(xpath = "//input[@id='user_update_submit']")
    public WebElement updateUserBtn;

    public EditUserInfoPage clickToEditBtn() {
        userHomePage = new UserHomePage();
        elementActions.moveToElement(moveToEditedUser);
        elementActions.clickElement(clickEditedUser);
        return this;
    }
    public String firstName = "";
    public EditUserInfoPage editFirstName() {
        elementActions.writeText(inputfFirstName, fakeDataProvider.generateFakeFirstName());
        firstName = fakeDataProvider.generateFakeFirstName().toString();
        return this;
    }

    public String lastName = "";
    public EditUserInfoPage editLastName() {
        elementActions.writeText(inputLastName, fakeDataProvider.generateFakeLastName());
        lastName = fakeDataProvider.generateFakeLastName().toString();
        return this;
    }

    public EditUserInfoPage editBio() {
        elementActions
                .writeText(inputBio,
                            "Я помню чудное мгновенье:\n" +
                                "Передо мной явилась ты,\n" +
                                "Как мимолетное виденье,\n" +
                                "Как гений чистой красоты.\n" +
                                "В томленьях грусти безнадежной,\n" +
                                "В тревогах шумной суеты,\n" +
                                "Звучал мне долго голос нежный\n" +
                                "И снились милые черты.\n" +
                                "Шли годы. Бурь порыв мятежный\n" +
                                "Рассеял прежние мечты,\n" +
                                "И я забыл твой голос нежный,\n" +
                                "Твои небесные черты.\n" +
                                "В глуши, во мраке заточенья\n" +
                                "Тянулись тихо дни мои\n" +
                                "Без божества, без вдохновенья,\n" +
                                "Без слез, без жизни, без любви.\n" +
                                "Душе настало пробужденье:\n" +
                                "И вот опять явилась ты,\n" +
                                "Как мимолетное виденье,\n" +
                                "Как гений чистой красоты.");
        return this;
    }

    public EditUserInfoPage timeZoneChosen() {
        elementActions.clickElement(selectTimeZoneChosen);
        return this;
    }

    public String timeZone = "";
    public EditUserInfoPage timeZoneSelect() {
        List<WebElement> timeZoneElements = getDriver()
        .findElements(By.xpath("//li[@class='select2-results-dept-0 select2-result select2-result-selectable']"));
        elementActions.clickToRandomElement(timeZoneElements);
//        timeZone = elementActions.clickToRandomElement(timeZoneElements).toString();
        return this;
    }

    public EditUserInfoPage languageChosenClick() {
        elementActions.clickElement(selectLanguageChosen);
        return this;
    }

    public String usedLanguage = "";
    public EditUserInfoPage languageSelect() {
                     List<WebElement> languages = getDriver()
                    .findElements(By.xpath("//li[@class='select2-results-dept-0 select2-result select2-result-selectable']"));
                    elementActions.clickToRandomElement(languages);
        return this;
    }

    public EditUserInfoPage clickDeactivateCheckBox() {
        elementActions.moveToElement(clickDeactivateCheckbox).clickElement(clickDeactivateCheckbox);
        return this;
    }

    public EditUserInfoPage clickExcludeCheckBox(){
        elementActions.clickElement(clickExcludeCheckBox);
        return this;
    }

//    public EditUserInfoPage imageLoad() throws InterruptedException {
//        elementActions.clickElement(loadImageBTN);
//        elementActions.waitElementToBeVisible(imageInput);
//        String filePath = "src/main/resources/Тест.png";
//        imageInput.sendKeys(filePath);
//        return this;
//    }


    public EditUserInfoPage updateBtn() {
        elementActions.clickElement(updateUserBtn);
        return this;
    }

}

