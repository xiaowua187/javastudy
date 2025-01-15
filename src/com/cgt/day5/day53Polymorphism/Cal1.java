package com.cgt.day5.day53Polymorphism;

public abstract class Cal1 {
    protected int num1;
    protected int num2;

    public Cal1(){

    }
    public Cal1(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

//    public int getResult(){
//
//        return 0;
//    }
    public abstract int getResult();
    //抽象方法
}
