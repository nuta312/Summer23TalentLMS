package com.digital.driver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class SauceLabsChromeWindows {
    @Test
    public void  loadSauceLabWindowsChromeDriver() throws MalformedURLException, InterruptedException {
        ChromeOptions browserOptions = new ChromeOptions();
        browserOptions.setPlatformName("Windows 11");
        browserOptions.setBrowserVersion("latest");
        Map<String, Object> sauceOptions = new HashMap<>();
        sauceOptions.put("username", "oauth-aibikekimanbaeva-4953c");
        sauceOptions.put("accessKey", "*****a0fb");
        sauceOptions.put("build", "selenium-build-5UJMH");
        sauceOptions.put("name", "<your test name>");
        browserOptions.setCapability("sauce:options", sauceOptions);
        URL url = new URL("https://ondemand.eu-central-1.saucelabs.com:443/wd/hub");
        RemoteWebDriver driver = new RemoteWebDriver(url, browserOptions);
        Thread.sleep(5000);
        driver.close();
        driver.quit();
}
}
