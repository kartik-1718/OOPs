package com.learn.exceptionHandling;

public class Eligibility {

    public static void Eligible (Integer exp){
            if (exp < 10) {
                throw new ArithmeticException("This person is not eligible for this job ");
            } else {
                System.out.println("This person is eligible for this job");
            }
        }

    public static void main(String[] args) {
        Eligible(19);
    }
    }

