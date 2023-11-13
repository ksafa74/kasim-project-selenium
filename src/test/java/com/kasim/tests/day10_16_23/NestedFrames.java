package com.kasim.tests.day10_16_23;

import com.kasim.utilities.ConfigPropReader;
import com.kasim.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class NestedFrames {

    @Test
    public void frames() {


        Driver.getDriver().get(ConfigPropReader.getProperty("url"));

        WebElement frameBottom = Driver.getDriver().findElement(By.name("frame-bottom"));
        Driver.getDriver().switchTo().frame(frameBottom);

        Driver.getDriver().switchTo().defaultContent();

        WebElement topFrame = Driver.getDriver().findElement(By.name("frame-top"));
        Driver.getDriver().switchTo().frame(topFrame);

        WebElement middleFrame = Driver.getDriver().findElement(By.name("frame-middle"));
        Driver.getDriver().switchTo().frame(middleFrame);

        Driver.getDriver().switchTo().parentFrame();

        WebElement rightFrame = Driver.getDriver().findElement(By.name("frame-right"));
        Driver.getDriver().switchTo().frame(rightFrame);

        Driver.getDriver().switchTo().defaultContent();
        Driver.getDriver().switchTo().frame(frameBottom);






    }
}
