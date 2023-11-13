package com.kasim.tests.sami;

import com.kasim.utilities.ConfigPropReader;
import com.kasim.utilities.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class WebTable {

    public static void main(String[] args) {

        String email ="fbach@yahoo.com";

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();


        driver.get(ConfigPropReader.getProperty("url"));



        WebElement dues = Driver.getDriver().findElement(By.xpath("//table[@id='table2']//tr/td[.='"+email+"']/following-sibling::td[contains(text(),'$')]"));

        System.out.println("dues.getText() = " + dues.getText());

        List<WebElement> allDues = Driver.getDriver().findElements(By.xpath("//table[@id='table2']//td[contains(text(),'$')]"));

        for (WebElement eachDue : allDues) {
            System.out.println("eachDue.getText() = " + eachDue.getText());

        }
    }

}
