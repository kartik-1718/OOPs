package com.learn.oop;


class Emplyees{
    Integer baseSalary = 50000;
}
public class Dev extends Emplyees{
    Integer Bonus = 20000;
    Integer Total = Bonus + baseSalary;

    public static void main(String[] args) {
        Dev vilas = new Dev();

        System.out.println("Total Salary of Vilas is " + vilas.Total );
    }

}


