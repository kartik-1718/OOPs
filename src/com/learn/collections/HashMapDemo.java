package com.learn.collections;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapDemo {

    public static void main(String[] args) {
        HashMap<Integer, String> employee = new HashMap<>();

        employee.put(1,"HR");
        employee.put(2,"Dev");
        employee.put(3,"Tester");


        System.out.println("List of Employee"+ employee);

        employee.remove(1);
        System.out.println("List of Employee after removing HR");
        System.out.println("List Of Employee"+ employee);




    }
}
