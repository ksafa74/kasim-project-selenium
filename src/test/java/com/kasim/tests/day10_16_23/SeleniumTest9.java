package com.kasim.tests.day10_16_23;

import com.kasim.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SeleniumTest9 {


    WebDriver driver;
    @BeforeClass
    public void init(){

        driver = WebDriverFactory.getDriver("chrome");
    }

    @BeforeMethod
    public void get(){

        driver.get("https://www.google.com");


    }
    @Test(priority = 2)
    public void test1(){

        Assert.assertEquals(driver.getTitle(),"Google","Test Failed");

    }

    @Test(priority = 1)
    public void test2(){

        Assert.assertTrue(5+5==10,"Test failed");
    }
    @AfterClass
    public void killIt(){
        driver.quit();
    }
}
