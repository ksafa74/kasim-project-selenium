package com.kasim.tests.day10_16_23;

import com.kasim.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragNDrop {

    @Test
    public void testDND() {

        Driver.getDriver().get("https://practice.cydeo.com/drag_and_drop_circles");

        WebElement draggable = Driver.getDriver().findElement(By.id("draggable"));
        WebElement dropTarget = Driver.getDriver().findElement(By.id("droptarget"));

        Actions actions = new Actions(Driver.getDriver());

        //actions.dragAndDrop(draggable,dropTarget).perform();

        actions.moveToElement(draggable)
                .pause(1000)
                .clickAndHold()
                .pause(1000)
                .moveToElement(dropTarget)
                .pause(1000)
                .release()
                .perform();





    }
}
