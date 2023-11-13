package com.kasim.tests.day10_16_23;

import com.kasim.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeleniumTest8 {

    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://practice.cydeo.com/checkboxes");

        WebElement checkbox1 = driver.findElement(By.id("box1"));
        checkbox1.click();
        System.out.println(checkbox1.isSelected());
        System.out.println(checkbox1.isEnabled());

        driver.quit();
    }
}
