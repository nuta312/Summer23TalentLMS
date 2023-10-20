package com.digital;

import com.digital.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

import static com.digital.driver.Driver.getDriver;

public class Main {
  static   WebDriver driver;

    public static void main(String[] args) {

        driver = Driver.getDriver();
        driver.get("https://nbu111.talentlms.com/index");
        List<WebElement> timeZoneElements = getDriver().findElements(By.xpath("//span[@class='select2-match']"));
        List<String> timeZone = new ArrayList<>();
        for (WebElement time : timeZoneElements){
            timeZone.add(time.getText());
        }
        System.out.println(timeZone);

    }
}