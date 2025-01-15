package com.cgt.day5.day52;

public class Cal {
    private int num1;
    private int num2;

    public Cal() {
    }

    public Cal(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
//面向过程做法
//    public int Add(){
//        return num1 + num2;
//    }
//
//    public int sub() {
//        return num1 - num2;
//    }
//
//    public int mul() {
//        return num1 * num2;
//    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getResult() {
        return 0;
    }
}
