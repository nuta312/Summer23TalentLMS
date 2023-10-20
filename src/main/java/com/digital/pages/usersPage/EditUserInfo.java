package com.digital.pages.usersPage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import java.util.List;

import static com.digital.driver.Driver.driver;
import static com.digital.driver.Driver.getDriver;

public class EditUserInfo extends UserHomePage {
    public UserHomePage userHomePage;
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

    @FindBy(xpath = "(//span[@class='select2-chosen'])[3]")
    public WebElement selectLanguageChosen;

    @FindBy(xpath = "//input[@name='restrict_email']")
    public WebElement clickCheckbox;

    @FindBy(xpath = "//span[@class='preview']")
    public WebElement imageLoader;

    @FindBy(xpath = "//input[@id='user_update_submit']")
    public WebElement updateUserBtn;

    public EditUserInfo clickToEditBtn(){
        userHomePage = new UserHomePage();
        elementActions.moveToElement(userHomePage.firstTableRow);
        elementActions.clickElement(userHomePage.editBtn);
        return this;
    }

    public EditUserInfo editFirstName(){
        elementActions.writeText(inputfFirstName, fakeDataProvider.generateFirstName());
        return this;
    }

    public EditUserInfo editLastName(){
        elementActions.writeText(inputLastName, fakeDataProvider.generateLastName());
        return this;
    }

    public EditUserInfo editBio(){
        elementActions
                .writeText(inputBio,
                "Много боли, горя и лишений,\n" +
                "Нам с тобой сготовила судьба,\n" +
                "Редкие минуты откровений,\n" +
                "Ты найдешь с людьми уж иногда.\n" +
                "\n" +
                "Никогда не падай духом зная,\n" +
                "Зная, что есть верные друзья,\n" +
                "Вспомни их, и Ад вдруг станет Раем.\n" +
                "Боль уйдет как талая вода.\n" +
                "\n" +
                "И когда страданьям нет предела,\n" +
                "И померкло солнце для тебя,\n" +
                "Не забудь, что где-то бьется сердце,\n" +
                "Сердце друга . друга навсегда.\n" +
                "\n" +
                "И собравшись мы за чашкой чая,\n" +
                "Начав откровенный разговор,\n" +
                "Боль свою развеем мы, печали,\n" +
                "Навсегда покинув этот дом.");
        return this;
    }

    public EditUserInfo timeZoneChosen(){
        elementActions.clickElement(selectTimeZoneChosen);
        return this;
    }

    public EditUserInfo timeZoneSelect(){
        List<WebElement> timeZoneElements = getDriver().findElements(By.xpath("//div[@class='select2-result-label']"));
            elementActions.clickToRandomElement(timeZoneElements);
        Assert.assertNotNull(timeZoneElements);
        return this;
    }

    public EditUserInfo languageChosenClick(){
        elementActions.clickElement(selectLanguageChosen);
        return this;
    }

    public EditUserInfo languageSelect(){
        List<WebElement> languages = getDriver().findElements(By.xpath("//li[@class='select2-results-dept-0 select2-result select2-result-selectable']"));
        elementActions.clickToRandomElement(languages);
        Assert.assertNotNull(languages);
        return this;
    }

    public EditUserInfo clickCheckBox(){
        elementActions.moveToElement(clickCheckbox).clickElement(clickCheckbox);
        return this;
    }

    public EditUserInfo imageLoad(){
        WebElement imgElement = getDriver().findElement(By.xpath("//img[@class='image80x80']"));
        String newImageUrl = "https://media.istockphoto.com/id/1213485485/vector/generational-and-retirement-icon-set-showing-considerations-retirement.jpg?s=2048x2048&w=is&k=20&c=I4YNTKK34832EzCfjz4uswcHKcx1vcqHXQYiy1vnt5I=";

        ((JavascriptExecutor) driver).executeScript("arguments[0].src = arguments[1];", imgElement, newImageUrl);
        return this;
    }




    public EditUserInfo updateBtn(){
        elementActions.clickElement(updateUserBtn);
        return this;
    }

}
