package com.kasim.tests.day10_16_23;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.Key;

public class SeleniumTest4 {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://google.com");

        WebElement searchBox = driver.findElement(By.name("q"));

        searchBox.sendKeys("java executor"+Keys.ENTER);

        WebElement element = driver.findElement(By.xpath("//a[@jsname='UWckNb']"));

        element.click();

    }
}
