package com.learn.oop;



public class Dev extends Employees{
    Integer Bonus = 20000;
    Integer Total = Bonus + BaseSalary;

    public static void main(String[] args) {
        Dev virat = new Dev();

        System.out.println("Total Salary of Virat is " + virat.Total );
    }

}


