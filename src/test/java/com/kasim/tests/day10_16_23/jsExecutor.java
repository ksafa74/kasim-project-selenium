package com.kasim.tests.day10_16_23;

import com.kasim.utilities.BrowserUtils;
import com.kasim.utilities.ConfigPropReader;
import com.kasim.utilities.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class jsExecutor {
    @Test
    public void testJSEx() {

        Driver.getDriver().get(ConfigPropReader.getProperty("url"));
        WebElement cydeoLink = Driver.getDriver().findElement(By.linkText("CYDEO"));

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        BrowserUtils.sleep(3);

        js.executeScript("arguments[0].scrollIntoView(true)",cydeoLink);

        BrowserUtils.sleep(3);

        Driver.closeDriver();




    }
}
