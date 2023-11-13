package com.kasim.tests.day10_16_23;

import com.kasim.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Iframes {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {

        driver = WebDriverFactory.getDriver("chrome");
    }

    @Test
    public void test1() {

        driver.get("https://practice.cydeo.com/iframe");

        WebElement id = driver.findElement(By.id("mce_0_ifr"));

        driver.switchTo().frame(id);

        WebElement message = driver.findElement(By.xpath("//p[.='Your content goes here.']"));
        Assert.assertTrue(message.isDisplayed());

        driver.switchTo().defaultContent();

        WebElement home = driver.findElement(By.xpath("//a[.='Home']"));

        Assert.assertEquals(home.getText(), "Home");
        Assert.assertTrue(home.isDisplayed());


        driver.quit();

    }
}
