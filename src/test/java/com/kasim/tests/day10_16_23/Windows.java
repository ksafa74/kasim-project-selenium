package com.kasim.tests.day10_16_23;

import com.kasim.utilities.BrowserUtils;
import com.kasim.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;

public class Windows {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {

        driver = WebDriverFactory.getDriver("chrome");
    }

    @Test
    public void test1() {

        driver.get("https://practice.cydeo.com/windows");
        String currentHandle = driver.getWindowHandle();

        WebElement clickHere = driver.findElement(By.xpath("//a[.='Click Here']"));

        clickHere.click();


        driver.switchTo().newWindow(WindowType.TAB);
        driver.switchTo().newWindow(WindowType.TAB);

        Set<String> allWindows = driver.getWindowHandles();

        System.out.println("allWindows = " + allWindows);

        for (String eachWindow : allWindows) {

            driver.switchTo().window(eachWindow);
            System.out.println("driver.getTitle() = " + driver.getTitle());

        }

        driver.switchTo().window(currentHandle);

        BrowserUtils.sleep(5);
        clickHere.click();




    }


    }




