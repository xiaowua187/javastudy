package com.cgt.day5;

import org.junit.Test;

import java.util.Scanner;

public class Homework {

    @Test
    public void test1(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入年份 :");
        int num = scanner.nextInt();
        while(num!=0) {
//            多次输入年份进行判断
            if ((num % 4 == 0 && num % 100 != 0) || (num % 400) == 0) {
                System.out.println(num + "是闰年");
            }
            else System.out.println("不是闰年");
            System.out.println();
            System.out.println("请输入年份 :");
            num = scanner.nextInt();
        }
    }

    @Test
    public  void test2(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter num1 & num2 :");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 =0;
        System.out.println(num1 + " " + num2);
        num3=num1;
        num1=num2;
        num2=num3;
        System.out.println(num1 + " " + num2);

    }

    @Test
    public void test3(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入单价:");
        double unitPrice = scanner.nextDouble();

        System.out.println("请输入数量:");
        double count = scanner.nextDouble();

        System.out.println("请输入金额:");
        double price  = scanner.nextDouble();

        double sum = unitPrice * count;

        if(sum >= 500)    sum *= 0.8;

        if (sum > price) System.out.println("钱不够,差" + (sum - price) + "元");
        else {
            System.out.println("应收" + sum + "元");
            System.out.println("找零" + (price - sum) + "元");
        }
    }

//    1
//    12
//    123
//    1234
//    12345
    @Test
    public  void test64(){
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

//   -----*         i=1,j=5,k=1
//   ----***        i=2,j=4,k=3
//   ---*****       i=3,j=3,k=5
//   --*******
//   -*********
//   ***********
//    j=num-i,k=2*i-1

    @Test
    public void  test5() {
        int num = 6;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num - i; j++) System.out.print(" ");
            for (int k = 1; k <= (2 * i - 1); k++)    System.out.print("*");
            System.out.println();
        }
    }

    @Test
    public  void    test51(){
        int num = 6;
        for (int i = num; i >= 1 ; i--) {
            for (int j = num-i; j >=1 ; j--) {
                System.out.print(" ");
            }
            for (int j = (2 * i - 1); j >=1 ; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

//  6、计算1-100以内所有奇数的和以及所有偶数的和，分别打印出来。
    @Test
    public void test6(){
        int oddsum = 0;
        int evensum = 0;
        int sum = 100;

        for (int i = 1; i <= sum; i++) {
            if(i % 2 == 0)  evensum++;
            else oddsum++;
        }
        System.out.println("奇数：" + oddsum);
        System.out.println("偶数：" + evensum);
    }

//    7.用for循环输出1—1000之间能被5整除的数，且每行输出3个
    @Test
    public  void test7() {
        int temp = 0;
        for (int i = 1; i <= 1000; i++) {
            if(i % 5 ==0){
                System.out.print(i + "\t");
                temp++;
            }
            if(temp == 3) {
                temp = 0;
                System.out.println();
            }
        }
    }
//    8.计算9的阶乘  9!=9*8*7*6*5*...*3*2*1
    @Test
    public void test8(){
        int sum  = 1;
        for (int i = 9; i >=1 ; i--) sum *= i;
        System.out.println(sum);
    }

//  1、int[] scores={0,0,1,2,3,5,4,5,2,8,7,6,9,5,4,8,3,1,0,2,4,8,7,9,5,2,1,2,3,9};
//  求出上面数组中0-9分别出现的次数
    @Test
    public void test11() {
        int[] scores={0,0,1,2,3,5,4,5,2,8,7,6,9,5,4,8,3,1,0,2,4,8,7,9,5,2,1,2,3,9};
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        for (int i = 0; i < scores.length; i++) {
            switch (scores[i]) {
                case 0:
                    count0++;
                    break;
                case 1:
                    count1++;
                    break;
                case 2:
                    count2++;
                    break;
                case 3:
                    count3++;
                    break;
            }
        }

        System.out.println("0出现"+count0+"次");
        System.out.println("1出现"+count1+"次");
        System.out.println("2出现"+count2+"次");
        System.out.println("3出现"+count3+"次");
    }

    @Test
    public void test12() {
        int[] scores = {0,0,1,2,3,5,4,5,2,8,7,6,9,5,4,8,3,1,0,2,4,8,7,9,5,2,1,2,3,9};
        int[] counts = new int[10];
        for (int i = 0; i < scores.length; i++) {
            counts[scores[i]]++;
        }

        for (int i = 0; i < counts.length; i++) {
            System.out.println(i + "出现了" + counts[i] + "次");
        }
    }

//  2、int[] scores={0,0,1,2,3,5,4,5,2,8,7,6,9,5,4,8,3,1,0,2,4,8,7,9,5,2,1,2,3,9};
//  要求求出其中的奇数个数和偶数个数。
    @Test
    public void test21(){
        int evencounts = 0;
        int oddcounts = 0;
        int[] scores={0,0,1,2,3,5,4,5,2,8,7,6,9,5,4,8,3,1,0,2,4,8,7,9,5,2,1,2,3,9};
        for (int i = 0; i < scores.length; i++) {
            if(scores[i] % 2 == 0)  evencounts++;
            else    oddcounts++;
        }
        System.out.println("偶数数量:" + evencounts);
        System.out.println("奇数数量:" + oddcounts);
    }
//  3.题目：一个任意一个字符串，判断它是不是回文。
    @Test
    public void test31(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String str = scanner.next();
        char [] array=str.toCharArray();
        boolean isHuiWen = true;
//        开始默认它是回文
        for (int i = 0; i < array.length / 2; i++) {
            if(array[i] != array[array.length  - i - 1]) {
                isHuiWen = false;
                break;
            }
        }
        if(isHuiWen)    System.out.println(str + "是回文");
        else    System.out.println(str + "不是回文");
    }

//    4.输入一行字符串，分别统计出其中英文字母、空格、数字和其它字符的个数。
    @Test
    public void test41(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String str = scanner.nextLine();
        System.out.println(str);
        char [] array = str.toCharArray();
        int letterCount = 0;
        int spaceCount = 0;
        int digitCount = 0;
        int otherCount = 0;
        for (int i = 0; i < array.length; i++) {
            if((array[i] >='A'&& array[i] <= 'Z')||(array[i] >= 'a' && array[i] <= 'z'))    letterCount++;
            else if(array[i] == ' ')    spaceCount++;
            else if (array[i] >= '0' && array[i] <= '9')    digitCount++;
            else    otherCount++;
        }
        System.out.println("字母出现次数：" + letterCount);
        System.out.println("空格出现次数：" + spaceCount);
        System.out.println("数字出现次数：" + digitCount);
        System.out.println("其他出现次数：" + otherCount);
    }
}
