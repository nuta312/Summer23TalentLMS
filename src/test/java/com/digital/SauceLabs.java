package com.digital;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariOptions;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class SauceLabs {
    @Test
    void test() throws MalformedURLException, InterruptedException {
        SafariOptions browserOptions = new SafariOptions();
        browserOptions.setPlatformName("macOS 13");
        browserOptions.setBrowserVersion("latest");
        Map<String, Object> sauceOptions = new HashMap<>();
        sauceOptions.put("username", "oauth-aibikekimanbaeva-4953c");
        sauceOptions.put("accessKey", "4c36ce86-0d10-48ce-ae19-1a73cfada0fb");
        sauceOptions.put("build", "<your build id>");
        sauceOptions.put("name", "<your test name>");
        browserOptions.setCapability("sauce:options", sauceOptions);

        URL url = new URL("https://ondemand.eu-central-1.saucelabs.com:443/wd/hub");
        RemoteWebDriver driver = new RemoteWebDriver(url, browserOptions);
        driver.get("https://demoqa.com/text-box");
        WebElement firstNameInput = driver.findElement(By.id("userName"));
        firstNameInput.sendKeys("hello");

        Thread.sleep(5000);
        driver.close();
        driver.quit();
    }
}
