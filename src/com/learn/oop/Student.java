package com.learn.oop;

public class Student {

    Integer id;
    String name;
    Address address;


    void addStudent (Integer id , String name ,Address address){
        this.id=id;
        this.name=name;
        this.address= address;

    }

    void displayStudent(){
        System.out.println(name+ " " + address.city+ " "+ address.country);
    }

    public static void main(String[] args) {
        Address Johnaddress = new Address("Bangalore"," karnataka", "India ");

        Student John = new Student();
        John.addStudent(101,"John Philip",Johnaddress);
        John.displayStudent();


    }
}
