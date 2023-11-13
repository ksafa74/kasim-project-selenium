package com.kasim.tests.day10_16_23;

import com.kasim.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SeleniumTest6 {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://practice.cydeo.com");
        List<WebElement> links = driver.findElements(By.tagName("a"));

        System.out.println(links.size());

        for (WebElement link : links) {
            System.out.println(link.getText());
            System.out.println(link.getAttribute("href"));

        }

        driver.quit();


    }
}
