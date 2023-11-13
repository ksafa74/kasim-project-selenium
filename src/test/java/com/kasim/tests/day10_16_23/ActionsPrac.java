package com.kasim.tests.day10_16_23;

import com.kasim.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsPrac {

    @Test
    public void testHoverOver() {

        Driver.getDriver().get("https://practice.cydeo.com/hovers");
        WebElement img1 = Driver.getDriver().findElement(By.xpath("(//img)[2]"));

        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(img1).perform();




    }
}
