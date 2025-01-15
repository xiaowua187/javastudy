package com.cgt.day2;

import org.junit.Test;

import java.util.Random;
import java.util.Scanner;

public class IfWhileDemo {
    @Test
    public void test0(){
        int score = 2;
        if(3 >= 5){
            System.out.println("3 >= 5");
        }
        else {
            System.out.println("3 < 5");
        }
    }

//        >=90   <=100      优秀
//        >=80    <90       良好
//        >=70    <80       一般
//        >=60    <70      及格
//        <60              不及格

    @Test
    public void test1(){
        Scanner scanner =new Scanner(System.in);
        System.out.println("请输入成绩：:");
        int score = scanner.nextInt();
        if (score < 0 || score > 100) {
            System.out.println("请输入成绩：");
            return;
        }
        if (score >= 90 && score <= 100) {
            System.out.println("优秀");
        } else if (score >= 80 && score < 90) {
            System.out.println("良好");
        } else if (score >= 70 && score < 80) {
            System.out.println("一般");
        } else if (score >= 60 && score < 70) {
            System.out.println("及格");
        } else {
            System.out.println("不及格");
        }
    }

    @Test
    public void test2(){
        int num1 = 23;
        int num2 = 14;
        int max1 = 0;
        if (num1 >= num2) {
            max1 = num1;
        } else {
            max1 = num2;
        }

        System.out.println(max1);

        int  max2 = num1 >= num2 ? num1 : num2;
        System.out.println(max2);
    }

    @Test
    public void test3() {
        int age = 28;
        System.out.println("我的年龄是23岁");
        System.out.println("我的年龄是" + age + "岁");
        System.out.println(10 + 20 + "" + 30);//"3030"
        System.out.println("" + 10 + 20 + 30);//"102030"
    }

    @Test
    public void test4() {
        //while
        int i = 1;
        while (i <= 5) {
            System.out.println("HelloWorld");
            i++;
        }
        System.out.println("---------------------");
        // i,j,k
        for (int j = 1; j <= 5; j++) {
            System.out.println("HelloWorld");
        }
    }

    @Test
    public  void test5(){
        int i =10;
        while(i!=0){
            System.out.println(i);
            --i;
        }
    }

    @Test
    public void test6() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
            sum += i;
            System.out.println("sum: " + sum);
        }
        System.out.println("sum: " + sum);
    }

//    统计思想，数一下符合条件的有多少个（计算1-100以内7的倍数的个数）
    @Test
    public void test7() {
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("count: " + count);
    }

    @Test
    public void test8() {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println(i);
        }
    }

    @Test
    public void test9() {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                break;
            }
            System.out.println(i);
        }
    }

    @Test
    public void test10() {
        //i,j,k
        for (int i = 1; i <= 5; i++) {
            System.out.println("i: " + i);
            for (int j = 1; j <= 5; j++) {
                if (j == 3) {
                    break;
                }
                System.out.println("j: " + j);
            }
        }
    }

    @Test
    public  void  test11(){
        //parameter:参数
        //Params: bound – the upper bound (exclusive). Must be positive.
        //int value between zero (inclusive) and bound (exclusive)
        // [0,100) + 1 = [1,101)
        Random random =new Random();
        int i = random.nextInt(100);
        System.out.println(i);
    }

//    ****
//    ****
//    ****

    @Test
    public void test12() {
        //****
        for (int i = 1; i <= 4; i++) {
            System.out.print("*");
        }
        //单纯换行
        System.out.println();
        //*
        //*
        //*
        for (int i = 1; i <= 3; i++) {
            System.out.println("*");
        }
    }

    @Test
    public void test13() {
        //i:1
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 4; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

//    *
//    **
//    ***
//    ****
//    *****
    @Test
    public void test14() {
        // i:1  j:1
        // i:2  j:2
        // i:3  j:3
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    @Test
    public  void  test15(){
        for(int i=1;i<=9;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j + "*" + i + "=" + (i*j) + "\t");
            }
            System.out.println();
        }
    }

    @Test
    public void test16() {
        int num = 13;
        switch (num) {
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);
                break;
            case 3:
                System.out.println(3);
                break;
            default:
                System.out.println("default");
                break;
        }
    }

//    输入月份判断天数：
//    1、3、5、7、8、10、12  -------- 31天
//    4、6 、9、11--------------------30天
//    2----------------------------------28/29天
    @Test
    public void test17() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入月份：");
        int month = scanner.nextInt();
        switch (month) {
            case 1:
                System.out.println("31天");
                break;
            case 2:
                System.out.println("28/29天");
                break;
            case 3:
                System.out.println("31天");
                break;
            case 4:
                System.out.println("30天");
                break;
            case 5:
                System.out.println("31天");
                break;
            case 6:
                System.out.println("30天");
                break;
        }
    }

    @Test
    public void test18() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入月份：");
        int month = scanner.nextInt();
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31天");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30天");
                break;
            case 2:
                System.out.println("28/29天");

                break;
        }
    }

    @Test
    public void test61(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the year :");
        int num = scanner.nextInt();
        while(num!=0) {
            if ((num % 4 == 0 && num % 100 != 0) || (num % 400) == 0) {
                System.out.println(num + "是闰年");
                System.out.println();
                System.out.println("enter the year :");
                num = scanner.nextInt();
            }
        }
    }

    @Test
    public  void test62(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter num1 & num2 :");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 =0;
        System.out.println(num1);
        System.out.println(num2);
        num3=num1;
        num1=num2;
        num2=num3;
        System.out.println(num1);
        System.out.println(num2);

    }

    @Test
    public void test63(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入单价:");
        double unitPrice = scanner.nextDouble();

        System.out.println("请输入数量:");
        double count = scanner.nextDouble();

        System.out.println("请输入金额:");
        double price  = scanner.nextDouble();

        double sum=unitPrice * count;

        if(sum >= 500)    sum *= 0.8;

        if (sum > price) System.out.println("钱不够,差" + (sum-price) + "元");
        else {
            System.out.println("应收" + sum + "元");
            System.out.println("找零" + (price - sum) + "元");
        }
    }

    @Test
    public void  test65() {
        int num = 6;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num - i; j++) System.out.print(" ");
            for (int k = 1; k <= i; k++)    System.out.print("*");
            for (int l = 1; l <= i-1; l++) System.out.print("*");
            System.out.println();
        }
    }

    @Test
    public  void test64(){
        for (int i = 1; i <=5; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    @Test
    public void test66(){
        int num1 = 0;
        int num2 = 0;
        int sum = 100;
        for (int i = 1; i <= sum; i++) {
            if(i % 2 == 0)  num1++;
            else num2++;
        }
        System.out.println("偶数：" + num1);
        System.out.println("奇数：" + num2);
    }

    @Test
    public  void test67(){
        int temp = 0;
        for (int i = 1; i <= 1000; i++) {
            if(temp == 3) {
                temp = 0;
                System.out.println();
            }
            if(i % 5 ==0){
                System.out.print(i + "\t");
                temp++;
            }
        }
    }

    @Test
    public void test68(){
        int sum  = 1;
        for (int i = 9; i >=1 ; i--) sum *= i;
        System.out.println(sum);
    }


}