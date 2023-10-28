package com.digital.pages.accountSettingsPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
/**
 * @author Datkaeva Meervan
 */
public class AccountHomePage extends AccountSettingsPage {

    @FindBy(xpath = "//a[contains(text(),'Homepage')]")
    public WebElement openHomePage;

    @FindBy(xpath = "(//button[@type='button'])[1]")
    public WebElement playButton;

    @FindBy(xpath = "//button[@title='Fullscreen']")
    public WebElement fullScreenButton;

}
