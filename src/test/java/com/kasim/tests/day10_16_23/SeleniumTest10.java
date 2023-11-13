package com.kasim.tests.day10_16_23;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SeleniumTest10 {

    @Test
    public void hard(){

        System.out.println("hard assertion");

        Assert.assertEquals("apple","app" );

        System.out.println("after failed hard assertion");


    }

    @Test
    public void soft(){

        System.out.println("soft assertion");
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals("apple","app" );
        System.out.println("after failed soft assertion");
        softAssert.assertAll();
    }
}
