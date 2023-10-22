package com.digital.pages.accountSettingsPage;

import com.digital.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CertificatesPage extends BasePage {

    @FindBy(xpath = "//span[@class='select2-arrow']")
    public WebElement dropdownCertificate;

    public CertificatesPage clickDropdown(){
        elementActions.clickElement(dropdownCertificate);
        return this;
    }

}
