package com.cgt.day3;

import org.junit.Test;

import java.util.Scanner;

public class px {

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
        int[] scores={0,0,1,2,3,5,4,5,2,8,7,6,9,5,4,8,3,1,0,2,4,8,7,9,5,2,1,2,3,9};
        int[] counts = new int[10];
        for (int i = 0; i < scores.length; i++) {
            counts[scores[i]]++;
        }
        for (int i = 0; i < counts.length; i++) {
            System.out.println(i + "出现了"+counts[i]+"次");
        }
    }

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

    @Test
    public void test312(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String str = scanner.next();
        char [] array=str.toCharArray();
        boolean isHuiWen = true;
        for (int i = 0; i < array.length / 2; i++) {
                if(array[i] != array[array.length  - i - 1]) {
                    isHuiWen = false;
                    break;
                }
        }
        if(isHuiWen) System.out.println(str + "是回文");
        else System.out.println(str + "不是回文");
    }

    @Test
    public void test313(){
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
        System.out.println(letterCount + "\t" + spaceCount + "\t" + digitCount + "\t" + otherCount);
    }
}