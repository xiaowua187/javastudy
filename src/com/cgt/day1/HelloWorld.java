package com.cgt.day1;

import org.junit.Test;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("helloworld");
        System.out.println("helloworld");
        System.out.println("helloworld");
        System.out.println("helloworld");
        System.out.println("HelloWorld.main");
        System.out.println();
//        类型 变量 赋值
        int age1 = 23;
        age1 = 24;
//        常量: 值不能改变
        final int age2 = 25;
//        Cannot assign a value to final variable 'age2'
//        age2 = 26;
    }

    @Test
    public void test(){
        System.out.println("HelloWorld.test");

        double pi = 3.14;

        boolean b1 = true;
        boolean b2 = false;

        char ch1 = 'H';
        char ch2 = '(';
        char ch3 = '@';
        char ch4 = '思';
    }

}
