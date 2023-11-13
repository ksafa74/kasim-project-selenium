package com.kasim.tests.day10_16_23;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class SeleniumTest5 {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://practice.cydeo.com");
        WebElement homeLink = driver.findElement(By.cssSelector("a[class='nav-link']"));

       if( homeLink.getText().equals("Home")){
           System.out.println(true);
       }else{
           System.out.println(false);
       }
       driver.quit();
    }
}
