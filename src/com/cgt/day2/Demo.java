package com.cgt.day2;

import org.junit.Test;

public class Demo {
    @Test
    public void test1(){
        char ch0 = 'A';
        System.out.println(ch0);
        System.out.println(ch0+1);
        System.out.println((char)(ch0+1));
        char ch1 = 'a';
        System.out.println(ch1);
        System.out.println(ch1+1);

        double d0 =3.14;
        float d1 = 3.14f;
        int num =(int) d0;

        System.out.println(num);
    }

    @Test
    public void test2() {
        int num1 = 3;
        int num2 = 5;
        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2);

        System.out.println(8 / 2);//4
        System.out.println(8 % 2);//0
        System.out.println(8 / 5);//1
        System.out.println(8 % 5);//3

    }
        @Test
        public void test3() {
            int i = 1;
            ++i;// ++i;  i = i + 1;
            System.out.println(i);//2
            System.out.println(i++);//2
            System.out.println(i);//3
            System.out.println(++i);//4
        }

        @Test
        public void test4() {
            System.out.println(3 >= 5);
            System.out.println(5 < 10);
            System.out.println(5 <= 10);//true
            int num1 = 3;
            int num2 = 5;
            System.out.println(num1 != num2);//true
        }

        @Test
        public void test5() {
            int score1 = 78;
            int score2 = 380;
            //=、>=、&& 优先级关系：>=、&&、=
            boolean result1 = (score1 >= 60) && (score2 >= 400);
            System.out.println(result1);
            boolean result2 = (score1 >= 60) || (score2 >= 400);
            System.out.println(result2);

            //短路
            int num1 = 3;
            int num2 = 5;
            //&&短路
            System.out.println(num1 < 0 & num1++ < num2);//false
            System.out.println(num1);//3
            System.out.println(num2);//5

            //||短路
            System.out.println(num1 > 0 || num1++ < num2);//true
            System.out.println(num1);//3
            System.out.println(num2);//5
            System.out.println(num2);//5
        }

}
