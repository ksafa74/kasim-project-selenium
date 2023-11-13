package com.kasim.tests.day10_16_23;

import com.kasim.tests.base.TestBase;
import com.kasim.utilities.BrowserUtils;
import com.kasim.utilities.ConfigPropReader;
import com.kasim.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ConfigReaderPractice extends TestBase {



    @Test
    public void test1() {

        driver.get(ConfigPropReader.getProperty("url")+"tables");
        BrowserUtils.sleep(2);

    }
}
