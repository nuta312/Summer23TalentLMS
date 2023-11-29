package com.digital.pages.accountSettingsPage;

import com.digital.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Optional;

import java.util.List;



public class CertificatesPage extends BasePage {


    @FindBy(xpath="//li/a[@href='https://kanzada.talentlms.com/account/certifications_index']")
    public WebElement enterCertificates;
    @FindBy(xpath = "//span[@class='select2-arrow']")
    public WebElement dropdownCertificate;
    @FindBy(xpath = "//ul[@class='select2-results']")
    public WebElement certificateOptions;

    public CertificatesPage enterCertificatesPage(){
        elementActions.clickElement(enterCertificates);
        return this;

    }
    public CertificatesPage clickDropdown(){
        elementActions.clickElement(dropdownCertificate);
        return this;
    }

    public CertificatesPage selectCertificate() {
        for (int i = 0; i < 4; i++) {
            List<WebElement> options = certificateOptions.findElements(By.tagName("li"));
            if (i < options.size()) {
                options.get(i).click();
                clickDropdown();
            }
        }
        return this;
    }
}
