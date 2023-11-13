package com.kasim.tests.day10_16_23;

public class ExceptionHandling {
    public static void main(String[] args) {

        System.out.println("Program Started");

        String str = "Cydeo";

        try{
        //System.out.println(str.charAt(-20));
        System.out.println(20 / 0);}
        catch (RuntimeException e){
            System.out.println("Runtime exception!");
            e.printStackTrace();
        }

        System.out.println("Program Completed");

    }
}
