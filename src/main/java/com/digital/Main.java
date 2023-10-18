package com.digital;

import com.digital.driver.Driver;
import org.openqa.selenium.WebDriver;

public class Main {
  static   WebDriver driver;

    public static void main(String[] args) {

        driver = Driver.getDriver();
        driver.get("https://nbu111.talentlms.com/index");

    }
}