package com.learn.oop;

public class HR extends Employees {
    Integer Bonus = 15000;
    //Integer Total = bonus + baseSalary;

    public static void main(String[] args) {
        HR rahul = new HR();

        //System.out.println("Total Salary of Rahul  is " + rahul.Total );

        rahul.TotalSalary(rahul.BaseSalary , rahul.Bonus);
    }

}
