package com.kasim.tests.day10_16_23;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest3 {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://cydeo.com");

       // Thread.sleep(5000);

        //driver.close();

        String title = driver.getTitle();

        if(driver.getTitle().equals("Cydeo")){
            System.out.println(true);
        }else{
            System.out.println(false);
        }

        driver.quit();




    }
}
