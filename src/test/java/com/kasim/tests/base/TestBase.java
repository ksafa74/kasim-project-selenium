package com.kasim.tests.base;

import com.kasim.utilities.ConfigPropReader;
import com.kasim.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class TestBase {

    protected WebDriver driver;

    @BeforeMethod
    public void setUp() {

        driver = WebDriverFactory.getDriver(ConfigPropReader.getProperty("browser"));

    }

    @AfterMethod
    public void tearDown() {

        driver.quit();
    }
}
