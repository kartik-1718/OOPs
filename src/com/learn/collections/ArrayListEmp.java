package com.learn.collections;

import java.util.ArrayList;
import java.util.Iterator;


public class ArrayListEmp {
    public static void main(String[] args) {
        ArrayList<String> emp = new ArrayList<>();

        emp.add("Nishant");//index 0
        emp.add("Asif");//1
        emp.add("Akash");//2


        emp.remove("Asif");
        emp.removeAll(emp);

        Iterator itr = emp.iterator();

        while(itr.hasNext()) {
            System.out.println(itr.next());
        }

    }
}
