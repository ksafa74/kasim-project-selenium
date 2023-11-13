package com.kasim.tests.day10_16_23;

import com.kasim.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeleniumTest7 {

    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://practice.cydeo.com");

        WebElement radioLink = driver.findElement(By.xpath("//a[@href=\"/radio_buttons\"]"));
        radioLink.click();

        WebElement blue = driver.findElement(By.id("blue"));
        System.out.println(blue.isSelected());
        WebElement red = driver.findElement(By.id("red"));
        red.click();
        System.out.println(red.isSelected());
        WebElement green = driver.findElement(By.id("green"));
        green.click();
        System.out.println("green.isSelected() = " + green.isSelected());
        System.out.println("green.isEnabled() = " + green.isEnabled());
    }
}
