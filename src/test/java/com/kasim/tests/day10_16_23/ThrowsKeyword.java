package com.kasim.tests.day10_16_23;

public class ThrowsKeyword {

    public static void main(String[] args) throws Exception {


        System.out.println("Program Started");

        method1();
        method2();
        method3();

        System.out.println("Program Ended");
    }

    public static void method1() throws InterruptedException {

        
        Thread.sleep(3000);
        System.out.println("Wooden Spoon");
    }
    public static void method2(){

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Cydeo School");
    }

    public static void method3(){

        throw new RuntimeException("");
    }
}
