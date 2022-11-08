package com.learn.exceptionHandling;

public class TestingFinallyBlock {
    public static void main(String[] args) {

        try{
            System.out.println("inside Try Block");
            int num = 100/0;
            System.out.println(num);
        }catch(NullPointerException e){
            System.out.println(e);
        }
        finally{
            System.out.println("This Finally Block will be executed regardless of exception occuring or not ");
        }
            System.out.println("Continue.....");
    }
}
