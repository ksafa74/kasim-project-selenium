package com.kasim.tests.day10_16_23;

import com.kasim.tests.base.TestBase;
import com.kasim.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class Iframe2 extends TestBase {

    @Test
    public void test1() {

        driver.get("https://www.hyrtutorials.com/p/frames-practice.html");

        try {


        for (int i = 1; i < 3; i++) {

            driver.switchTo().frame("frm"+i);

            if(driver.findElement(By.id("chinesechbx")).isDisplayed()){

                driver.findElement(By.id("chinesechbx")).click();

            }
            driver.switchTo().defaultContent();}}catch (Exception e){

            e.printStackTrace();

        }

        BrowserUtils.sleep(3);
    }
}
