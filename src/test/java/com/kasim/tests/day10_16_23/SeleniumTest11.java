package com.kasim.tests.day10_16_23;

import com.kasim.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SeleniumTest11 {

    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("https://practice.cydeo.com/dropdown");

        Select select = new Select(driver.findElement(By.id("dropdown")));

        List<WebElement> selectOptions = select.getOptions();

        for (WebElement selectOption : selectOptions) {

            System.out.println(selectOption.getText());
        }

        WebElement dropDown = driver.findElement(By.xpath("//a[@id='dropdownMenuLink']"));
        dropDown.click();
        WebElement element = driver.findElement(By.xpath("//a[.='Yahoo']"));
        element.click();

        Thread.sleep(5000);

        driver.quit();

    }
}
