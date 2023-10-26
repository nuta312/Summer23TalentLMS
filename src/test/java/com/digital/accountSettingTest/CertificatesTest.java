package com.digital.accountSettingTest;

import com.digital.BaseTest;
import com.digital.pages.accountSettingsPage.AccountSettingsPage;
import com.digital.pages.accountSettingsPage.CertificatesPage;
import org.testng.annotations.Test;

public class CertificatesTest extends AccountSettingsEnter {

    @Test
    public void CertificatesList () {
        certificatesPage = new CertificatesPage();
        certificatesPage.clickDropdown();
    }
}
