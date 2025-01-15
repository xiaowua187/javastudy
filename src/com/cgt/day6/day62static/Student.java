package com.cgt.day6.day62static;

public class Student {
    public int id;
    public  String name;
    public static String country = "china";

    public void show(){
        System.out.println("Student.show");
        System.out.println(country);
        print();
        System.out.println(this.name);
    }
    public static void print(){
        System.out.println("Student.print");
        System.out.println(country);
//        show();
//        System.out.println(this.name);
    }
}
