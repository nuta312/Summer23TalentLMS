# Summer23TalentLMS Automated Testing

![Java](https://img.shields.io/badge/Java-17-brightgreen)
![Selenium](https://img.shields.io/badge/Selenium-4.12.1-brightgreen)
![TestNG](https://img.shields.io/badge/TestNG-7.8.0-brightgreen)
![Allure](https://img.shields.io/badge/Allure-2.20.0-brightgreen)

This project is an automated testing framework for the TalentLMS platform, utilizing Java, Selenium WebDriver, TestNG, and other dependencies to automate various interactions with the TalentLMS website.

## Prerequisites

Before you get started, ensure you have the following prerequisites in place:

- Java 17 or higher
- Maven
- Chrome or Firefox browser (configurable)
- ChromeDriver or GeckoDriver
- [Allure](https://docs.qameta.io/allure/)

## Project Structure

- `src/main/java`: This directory should contain any production code or utilities you may need.
- `src/test/java`: Here you can create your test classes. Sample test classes are provided.
- `src/test/resources`: You can place configuration files or test data here.
- `testng.xml`: Configure your test suites and include/exclude tests here.

## Configuration

Customize your test configuration by editing the `src/test/resources/config.properties` file:

```properties
# Browser Configuration
browser=firefox
headless=true

# TalentLMS URL
BASE_URL=https://nbu111.talentlms.com/dashboard
Hello World!
