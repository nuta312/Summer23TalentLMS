package com.digital.pages.accountSettings;

import com.digital.driver.Driver;
import com.digital.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Themes extends BasePage {


    @FindBy(xpath = "//a[@href='https://nbu111.talentlms.com/account/themes_index']")
    public WebElement openTheme;

    public Themes openThemes() {
        elementActions.clickElement(openTheme);
        return this;
    }

    @FindBy(xpath = "(//*[@id='s2id_select-theme'])[1]")
    public WebElement openDropDown;

    public Themes clickDropDown() {
        elementActions.clickElement(openDropDown);
        return this;
    }

    @FindBy(xpath = "//span[@class='select2-match' and text()='Tropic Zone']")
    public WebElement clickTropicZone;

    public Themes chooseTropicZone() {
//        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10)); // Создаем экземпляр WebDriverWait
//        By locator = By.xpath("//div[@class='select2-result-label']//span[@class='select2-match'][text()='Tropic Zone']");
//        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
//        actions.moveToElement(clickTropicZone).perform();
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",clickTropicZone);
        clickTropicZone.click();
        return this;
    }
}
