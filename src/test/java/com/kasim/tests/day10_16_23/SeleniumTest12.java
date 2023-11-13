package com.kasim.tests.day10_16_23;

import com.kasim.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SeleniumTest12 {

    WebDriver driver;


    @BeforeMethod
    public void init() {
         driver = WebDriverFactory.getDriver("chrome");
    }

    @Test
    public void test1() {

        Select select = new Select(driver.findElement(By.name("Languages")));



    }
}
