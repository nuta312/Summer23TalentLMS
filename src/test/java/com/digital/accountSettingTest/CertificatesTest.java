package com.digital.accountSettingTest;

import com.digital.pages.accountSettingsPage.CertificatesPage;
import io.qameta.allure.Description;
import org.testng.annotations.Test;

public class CertificatesTest {

    @Test (groups = "regression")
    @Description ("Testing dropdown list of Certificates")
    public void dropdownMenuOfCertificates(){
        CertificatesPage certificates = new CertificatesPage();
        certificates.enterCertificatesPage().clickDropdown().selectCertificate();
    }
}
