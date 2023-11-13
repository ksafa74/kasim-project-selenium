package com.kasim.tests.day10_16_23;

import com.kasim.utilities.BrowserUtils;
import com.kasim.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class ExWait {
    @Test
    public void testExWait() {

        Driver.getDriver().get("https://practice.cydeo.com/dynamic_loading/2");
        WebElement start = Driver.getDriver().findElement(By.xpath("//button[.='Start']"));

        start.click();


        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        WebElement loading = Driver.getDriver().findElement(By.id("loading"));

        wait.until(ExpectedConditions.invisibilityOf(loading));
        WebElement h4Text = Driver.getDriver().findElement(By.xpath("//h4[.='Hello World!']"));

        Assert.assertTrue(h4Text.isDisplayed());

    }
}
