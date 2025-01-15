package com.cgt.day5.day52;

public class Student extends Person {
    //private int id;
    //private String name;
    //private int age;
    private  String className;
//    private  int age = 22;

    public Student() {
        super();//new Person();
    }


    public Student(int id, String name, int age, String className) {
        super(id, name, age);
//        this.id = id;
//        this.name = name;
//        this.age = age;
        this.className = className;
    }

    public void study(){
        System.out.println(age);
        System.out.println(super.age);
    }

//    @Override
//    public String toString() {
//        return "Student{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", age=" + age +
//                ", className='" + className + '\'' +
//                '}';
//    }

    @Override
    public void show() {
        System.out.println("Student.show");
        super.show();
    }
}