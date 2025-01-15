package com.cgt.day3;

import org.junit.Test;

import java.util.Random;
import java.util.Scanner;

public class Homework {
    //随机生成一个整数1-1000
    @Test
    public void test7() {
        Scanner scanner = new Scanner(System.in);
        //params  parameter:参数   negative
        Random random = new Random();
        //the upper bound (exclusive). Must be positive.
        //exclude：排除、不包含
        //include:
        //value between zero (inclusive) and bound (exclusive)
        // [0,100) + 1
        // 1-100
        int num = random.nextInt(100) + 1;
        System.out.println("num: " + num);
        while (true) {
            System.out.println("猜一猜");
            int guess = scanner.nextInt();
            if (guess == 0) {
                break;
            }

            if (guess < num) {
                System.out.println("太小了");
            } else if (guess > num) {
                System.out.println("太大了");
            } else {
                System.out.println("恭喜你，猜对了");
                break;
            }
        }
    }
//    之前用if-else做的程序，使用switch完成：
//    >=90    <=100    优秀
//    >=80    <90      良好
//    >=70    <80      一般
//    >=60    <70      及格
//    >=0     <60      不及格
//    >100    <0       非法
    @Test
    public void test1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入成绩：");
        int score = scanner.nextInt();

        if (score < 0 ||score > 100) {
            System.out.println("这是非法输入");
            return;
        }

        switch (score / 10) {
            case 9:
            case 10:
                System.out.println("优秀");
                break;
            case 8:
                System.out.println("良好");
                break;
            case 7:
                System.out.println("一般");
                break;
            case 6:
                System.out.println("及格");
                break;
            default:
                System.out.println("不及格");
                break;
        }
    }
}
