package com.learn.collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListEmp {


    public static void main(String[] args) {
        LinkedList<String> emp = new LinkedList<>();

        emp.add("HR");//index 0
        emp.add("Dev");//index 0
        emp.add("TEster");//index 0



      //  emp.add(1,"Guava");

        emp.removeFirst();
        emp.removeLast();

        emp.removeAll(emp);


        Iterator itr = emp.iterator();

        while(itr.hasNext()) {
            System.out.println(itr.next());
        }

    }
}
