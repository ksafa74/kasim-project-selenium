package com.kasim.tests.day10_16_23;

import com.kasim.utilities.ConfigPropReader;
import com.kasim.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class RightClick {

    @Test
    public void testRight_Click() {

        Driver.getDriver().get(ConfigPropReader.getProperty("url"));
        WebElement abLink = Driver.getDriver().findElement(By.linkText("A/B Testing"));

        Actions actions = new Actions(Driver.getDriver());
        actions.contextClick(abLink).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.RETURN).perform();

    }
}
