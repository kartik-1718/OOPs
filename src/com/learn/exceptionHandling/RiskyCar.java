package com.learn.exceptionHandling;

import java.io.IOException;


class Car1{
    void breakdown() throws IOException{
        throw new IOException("This Car is broken down");
    }
}

public class RiskyCar {
    public static void main(String[] args) {

        try {
            Car1 c1 = new Car1();
            c1.breakdown();
        } catch (Exception e) {
            System.out.println("Exception is handled " + e);
        }
        System.out.println("Continue.....");
    }
}