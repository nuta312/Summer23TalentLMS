package com.digital.bdd.step_defs;

import com.digital.driver.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;

public class Hooks {

    @Before // бефор cucumber.io.java, котрый будет работать перед каждым сценарием

    public void setUp(){
        System.out.println("Before hook started");
    }

    @After
    public void tearDown(Scenario scenario){ // в тирдавн например прописать скриншоты
        if (scenario.isFailed()){
            try{
                byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
                scenario.attach(screenshot, "image/png", "screenshot");
            }catch (WebDriverException e){
                e.printStackTrace();
            }
        }
        Driver.closeDriver();
    }
}
