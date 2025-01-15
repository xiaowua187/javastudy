package com.cgt.day3;

import org.junit.Test;

public class ArrayDemo {
    @Test
    public void test1() {
        int num = 3;
        int[] array = new int[4];
        System.out.println(array.length);
        array[0] = 23;
        array[1] = 3;
        array[2] = 4;
        array[3] = 24;
//        System.out.println(array[0]);
//        System.out.println(array[1]);
//        System.out.println(array[2]);
//        System.out.println(array[3]);
//        System.out.println("-----------------");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    @Test
    public void test2() {
        int[] array1 = {2, 45, 56, 78, 9};
        System.out.println(array1.length);
        int[] array2 = new int[]{2, 45, 56, 78, 9};
        System.out.println(array2.length);
    }

    @Test
    public void test3() {
        int[] array = new int[4];
        array[0] = 23;
        array[1] = 3;
        array[2] = 4;
        array[3] = 24;

        //数组下标越界异常   Runtime
//        java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
//        for (int i = 0; i <= array.length; i++) {
//            System.out.println(array[i]);
//        }
    }

    @Test
    public void test4() {
        int num1;
        int num2;
        int[] array = new int[4];
        array[0] = 23;
        array[1] = 3;
        array[2] = 4;
        array[3] = 24;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("sum: " + sum);

    }

    @Test
    public void test5() {
        int[] array = new int[4];
        array[0] = 23;
        array[1] = 63;
        array[2] = 74;
        array[3] = 24;
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("max: " + max);

        int max1 = getMax(array);
        System.out.println("max1: " + max1);
    }

    public int getMax(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    @Test
    public void test6() {
        int[] array = {40, 17, 21, 1};
        //外层循环控制轮数
        for (int i = 1; i <= array.length - 1; i++) {
            for (int j = 0; j < array.length - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    @Test
    public void test7() {
        int[] array = {40, 17, 21, 1};
        sort(array);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public void sort(int[] array) {
        for (int i = 1; i <= array.length - 1; i++) {
            for (int j = 0; j < array.length - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    @Test
    public void test8() {
        int num1 = 3;
        int num2 = 5;
        int temp = num2;
        num2 = num1;
        num1 = temp;
        System.out.println(num1);
        System.out.println(num2);
    }

    @Test
    public void test9() {
        int[] source = {41, 2, 63, 4, 5};
        int[] dest = new int[5];
        System.arraycopy(source, 0, dest, 0, source.length);

        for (int i = 0; i < dest.length; i++) {
            System.out.println(dest[i]);
        }
        System.out.println("-------------");
        //增强的for循环
        for (int item : dest) {
            System.out.println(item);
        }
    }

}
