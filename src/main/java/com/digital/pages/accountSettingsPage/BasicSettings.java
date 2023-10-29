package com.digital.pages.accountSettingsPage;

import com.digital.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;
import java.util.Random;


import static org.testng.AssertJUnit.assertTrue;

public class BasicSettings extends AccountSettingsPage {

    Actions actions = new Actions(Driver.getDriver());

    /**
     * search for locators
     */

    @FindBy(xpath = "//input[@name='site_name']")
    public WebElement siteName;

    @FindBy(xpath = "//input[@name='site_description']")
    public WebElement siteDescription;
    @FindBy(id = "s2id_default_language")
    public WebElement defaultLanguage;

    @FindBy(xpath = "(//input[@class='select2-input select2-focused'])[1]")
    public WebElement searchLanguage;

    @FindBy(id = "s2id_default_timezone")
    public WebElement defaultTimeZone;

    @FindBy(xpath = "(//input[@class='select2-input select2-focused'])[1]") // проверить
    public WebElement searchTimeZone;

     @FindBy(xpath = "//a[text()='Internal']")
    public WebElement linkInternal;

    @FindBy(xpath = "//textarea[@name='announcement']")
    public WebElement internalAnnouncement;

    @FindBy(xpath = "(//div[@class='tl-js-tooltip-trigger'])[3]")
    public WebElement internalAnnouncementTool;

    @FindBy(xpath = "//a[text()='External']")
    public WebElement linkExternal;
    @FindBy(xpath = "//textarea[@name='external_announcement']")
    public WebElement externalAnnouncement;

    @FindBy(xpath = "(//div[@class='tl-js-tooltip-trigger'])[4]")
    public WebElement externalAnnouncementInfo;

    @FindBy(xpath = "//input[@id='api']")
    public WebElement checkboxEnableApi;

    @FindBy(xpath = "//i[@title='Refresh API key']")
    public WebElement btnRefreshApiKey;
    @FindBy(id = "tl-confirm-submit")
    public WebElement btnRefresh;
     @FindBy(xpath = "//input[@id='tincan_api']")
    public WebElement checkboxEnableXApi;

    @FindBy(xpath = "//input[@id='external_lrs']")
    public WebElement checkboxExternalLrs;

    @FindBy(xpath = "//input[@id='external_lrs_endpoint']")
    public WebElement inputXApiEndpoint;
    @FindBy(xpath = "//input[@id='external_lrs_key']")
    public WebElement inputXApiKey;

    @FindBy(xpath = "//input[@id='external_lrs_secret']")
    public WebElement inputXApiSecret;

    @FindBy(xpath = "//input[@id='registration_restriction']")
    public WebElement checkboxRegistration;

    @FindBy(xpath = "//input[@id='registration_email_restriction']")
    public WebElement inputDomainRegistration;

    @FindBy(xpath = "//input[@name='disallow_multiple_logins']")
    public WebElement checkboxDisallowMultipleLogins;

    @FindBy(xpath = "//input[@name='disallow_mobile_app']")
    public WebElement checkboxDisallowMobileApp;

    @FindBy(xpath = "//input[@name='intercom_identity_verification']")
    public WebElement checkboxIntercomIdentityVerification;

    @FindBy(xpath = "//input[@id='intercom_secret_key']")
    public WebElement inputIntercomSecretKey;
    @FindBy(xpath = "//input[@name='disable_video_transcoding']")
    public WebElement checkboxDisableVideoTranscoding;

    @FindBy(xpath = "//input[@name='video_watermark']")
    public WebElement checkboxVideoWatermark;

    @FindBy(xpath = "//input[@name='use_documents_viewer']")
    public WebElement checkboxUseDocumentsViewer;

    @FindBy(xpath = "//input[@name='load_in_frame']")
    public WebElement checkboxLoadInFrame;

    @FindBy(xpath = "//input[@name='lock_system']")
    public WebElement checkboxLockSystem;

    @FindBy(xpath = "//textarea[@name='lock_system_message']")
    public WebElement inputMessage;

    @FindBy(xpath = "//input[@name='hide_from_search_engines']")
    public WebElement checkboxHideFromSearchEngines;

    @FindBy(xpath = "//input[@name='external_catalog']")
    public WebElement checkboxExternalCatalog;
    @FindBy(xpath = "//input[@name='show_branch_courses_in_main_catalog']")
    public WebElement checkboxShowBranchCourses;

    @FindBy(xpath = "//input[@name='show_course_info_page']")
    public WebElement checkboxShowCourseInfoPage;

    @FindBy(xpath = "//input[@name='bamboohr']")
    public WebElement checkboxBambooHR;

    @FindBy(xpath = "//input[@name='bamboohr_import_users_as_inactive']")
    public WebElement checkboxInactiveUsers;

    @FindBy(xpath = "//input[@name='bamboohr_domain']")
    public WebElement inputSubdomain;


    @FindBy(xpath = "//input[@value='Save']")
    public WebElement saveBtn;


    public BasicSettings fillUpTheSiteName(String SiteName) {
        elementActions.writeText(siteName, SiteName);
        Assert.assertTrue(siteName.getText().contains((siteName).getText()));
        return this;
    }

    public BasicSettings displayIconText(WebElement element) {
        elementActions.moveToElement(element);
        return this;
    }

    public BasicSettings fillUpTheSiteDescription(String txt) {
        elementActions.writeText(siteDescription, txt);
        Assert.assertTrue(siteDescription.getText().contains((siteDescription).getText()));
        return this;
    }

    public BasicSettings selectFromDropDownMenu(WebElement element) {
        List<WebElement> list = element.findElements(By.tagName("option"));
        int randomIndex = new Random().nextInt(list.size());
        Select select = new Select(element);
        select.selectByIndex(1);
        return this;
    }

    public BasicSettings searchSelectLanguage() {
        List<String> listOfLanguage = List.of("English", "Serbian", "Finnish");
        int randomIndex = new Random().nextInt(listOfLanguage.size());
        defaultLanguage.click();
        elementActions.writeText(searchLanguage, listOfLanguage.get(2));
        searchLanguage.sendKeys(Keys.ENTER);
        return this;
    }

    public BasicSettings searchSelectTimeZone() {
        List<String> listOfTimeZone = List.of("London", "Paris", "Berlin");
        int randomIndex = new Random().nextInt(listOfTimeZone.size());
        defaultTimeZone.click();
        elementActions.writeText(searchTimeZone, listOfTimeZone.get(2));
        searchTimeZone.sendKeys(Keys.ENTER);
        return this;
    }

    public BasicSettings scrollDown() {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0,500)");
        return this;
    }

    public BasicSettings internalAnnouncementInput() {
        linkInternal.click();
        internalAnnouncement.clear();
        elementActions.writeText(this.internalAnnouncement, "Announcement");
        Assert.assertTrue(internalAnnouncement.getText().contains((internalAnnouncement).getText()));
        return this;
    }

    public BasicSettings externalAnnouncementInput() {
        linkExternal.click();
        externalAnnouncement.clear();
        elementActions.writeText(this.externalAnnouncement, "ExternalAnnouncement");
        Assert.assertTrue(externalAnnouncement.getText().contains((externalAnnouncement).getText()));
        return this;
    }

    public BasicSettings checkBoxWork(WebElement element) {
        if (!element.isSelected()) {
            element.click();
        }
        return this;
    }

    public BasicSettings removeCheckbox(WebElement element) {
        if (element.isSelected()) {
            element.click();
        }
        return this;
    }

    public BasicSettings refreshApiKey() {
        elementActions.clickElement(btnRefreshApiKey)
                .clickElement(btnRefresh);
        return this;
    }
    public BasicSettings inputDomainRegistration() {
        elementActions.writeText(inputDomainRegistration, "~mail.ru,~gmail.com");
        return this;
    }

    public BasicSettings inputMessage() {
        elementActions.writeText(this.inputMessage, "The system is currently locked");
        return this;
    }

    public BasicSettings clickSave() {
        saveBtn.click();
        return this;
    }

}


