package com.kasim.tests.day10_16_23;

import com.kasim.utilities.BrowserUtils;
import com.kasim.utilities.ConfigPropReader;
import com.kasim.utilities.Driver;
import com.kasim.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class FileUpload {

    @Test
    public void testFileUpload() {

        //WebDriver driver = WebDriverFactory.getDriver("chrome");
        //driver.get(ConfigPropReader.getProperty("url")+"/upload");

        Driver.getDriver().get(ConfigPropReader.getProperty("url")+"/upload");
        WebElement chooseFileButton = Driver.getDriver().findElement(By.id("file-upload"));
        chooseFileButton.sendKeys("/Users/safamac/Desktop/TestFolder/TestFile.txt");

        Driver.getDriver().findElement(By.id("file-submit")).click();

        BrowserUtils.sleep(3);


        Driver.getDriver().quit();



    }
}
