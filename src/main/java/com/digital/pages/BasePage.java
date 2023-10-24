package com.digital.pages;

import com.digital.driver.Driver;
import com.digital.helper.AlertHelper;
import com.digital.helper.ElementActions;
import com.digital.helper.FramesHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    //Page Object Pattern;

    public WebDriver driver;
   public   ElementActions elementActions = new ElementActions();
   public   AlertHelper alertHelper = new AlertHelper(Driver.getDriver());
    public  FramesHelper framesHelper = new FramesHelper(Driver.getDriver());
    public BasePage() {           //принимает драйвер   //экземпляр текущей страницы
        PageFactory.initElements(Driver.getDriver(), this);
    }
    //PageFactory - pattern облегчает работу с page object pattern
    // инициализирует веб элементы работая в паре с @FindBy
    //Без использования @FindBy, Page Factory не сможет определить, какие именно элементы инициализировать на странице

}
