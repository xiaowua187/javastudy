package com.cgt.day5.day51;

import org.junit.Test;

public class OOPDemo {

    @Test
    public void test1(){
        Student student = new Student();
        //输出Student.Student，调用自定义的无参方法。

        student.setId(1);
        student.setName("zs");
        student.setAge(23);
//        student.setAge(223);//223显示为0
//        System.out.println(student.getAge());
        System.out.println(student);
//        Student{id=1, name='zs', age=23, gender='null'}

        Student student1 = new Student(2,"ww",22,"男");
        System.out.println(student1);
//       Student{id=2, name='ww', age=22, gender='男'}

        System.out.println(student1.toString());
//       Student{id=2, name='ww', age=22, gender='男'}
//        三种输出方法输出的结果一致
    }
}
