package com.learn.oop;

class Employees{
    Integer BaseSalary = 50000;

    void TotalSalary (Integer BS, Integer Bonus ){
        Integer total = BS + Bonus;
        System.out.println(total);
    }

    void TotalSalary (Integer BS, Integer Bonus ,Integer insentive){
        Integer total = BS + Bonus + insentive ;
        System.out.println(total);
    }

}