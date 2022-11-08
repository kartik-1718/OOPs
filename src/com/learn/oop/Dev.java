package com.learn.oop;


class Employees{
    Integer baseSalary = 50000;
}
public class Dev extends Employees{
    Integer Bonus = 20000;
    Integer Total = Bonus + baseSalary;

    public static void main(String[] args) {
        Dev virat = new Dev();

        System.out.println("Total Salary of Virat is " + virat.Total );
    }

}


