package com.learn.exceptionHandling;

public class TryTest {

    public static void main(String[] args) {
        try{
            Integer num = 100/0;


        }
        catch(ArithmeticException e) {
            System.out.println(e);
        }
        System.out.println("continue");
    }
}
