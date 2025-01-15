package com.cgt.day6.day62static;

import org.junit.Test;

import java.util.Arrays;

public class Demo {
    @Test
    public void test1(){
        Student student = new Student();
        student.name = "zs";
//        student.show();
        System.out.println(student.country);
        student.print();
        System.out.println(Student.country);
        Student.print();
    }

    @Test
    public void test2() {
        int max = Math.max(3, 5);
        System.out.println(max);
        //Math math = new Math();
        int[] array = {34, 45, 7, 89};
        System.out.println(array);
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        //[7, 34, 45, 89]
        int index = Arrays.binarySearch(array, 7);
        System.out.println(index);
    }

}
