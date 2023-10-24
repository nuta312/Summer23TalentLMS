package com.digital;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class SauceLab {
    @Test
    void test11() throws MalformedURLException, InterruptedException {
        ChromeOptions browserOptions = new ChromeOptions();
        browserOptions.setPlatformName("Windows 11");
        browserOptions.setBrowserVersion("latest");
        Map<String, Object> sauceOptions = new HashMap<>();
        sauceOptions.put("username", "oauth-jilduz0-d5f78");
        sauceOptions.put("accessKey", "47a95e4f-3915-4d53-b1aa-94a2234204a8");
        sauceOptions.put("build", "<your build id>");
        sauceOptions.put("name", "<your test name>");
        browserOptions.setCapability("sauce:options", sauceOptions);

        URL url = new URL("https://ondemand.eu-central-1.saucelabs.com:443/wd/hub");
        RemoteWebDriver driver = new RemoteWebDriver(url, browserOptions);
        driver.get("https://demoqa.com/text-box");
        WebElement firstName = driver.findElement(By.id("userName"));
        firstName.sendKeys("Hello");
        Thread.sleep(5000);
        driver.close();
        driver.quit();
    }
}
