package com.kasim.tests.day10_16_23;

import com.github.javafaker.Faker;
import com.kasim.utilities.BrowserUtils;
import com.kasim.utilities.WebDriverFactory;
import org.openqa.selenium.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Alerts {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {

        driver = WebDriverFactory.getDriver("chrome");
    }

    @Test
    public void test1() throws InterruptedException {

        driver.get("https://practice.cydeo.com/javascript_alerts");



        WebElement jsAlert = driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
        WebElement confirm = driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
        WebElement prompt = driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));

        Faker faker = new Faker();
        String name = faker.name().firstName()+" "+faker.name().lastName();


        prompt.click();
        BrowserUtils.sleep(3);
        Alert alert = driver.switchTo().alert();
        alert.sendKeys(name);
        BrowserUtils.sleep(3);
        alert.accept();
        BrowserUtils.sleep(3);
        driver.quit();

    }


}
