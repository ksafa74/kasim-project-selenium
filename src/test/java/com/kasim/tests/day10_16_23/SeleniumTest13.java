package com.kasim.tests.day10_16_23;

import com.github.javafaker.Faker;
import com.kasim.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SeleniumTest13 {

    @Test
    public void test1() {
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("http://uitestingplayground.com/dynamictable");

        String browser = "Chrome";

        WebElement browserCPU = driver.findElement(By.xpath("//span[.='" + browser + "']/following-sibling::span[contains(text(),'%')]"));

        String actualValue = browser + " CPU: " + browserCPU.getText();

        WebElement element = driver.findElement(By.xpath("//p[@class='bg-warning']\n"));

        String expectedValue = element.getText();


        Assert.assertEquals(expectedValue, actualValue);

        System.out.println("expectedValue = " + expectedValue);
        System.out.println("actualValue = " + actualValue);



        driver.quit();
    }
}
