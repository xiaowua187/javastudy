package com.cgt.day5.day53Polymorphism;

public class Add extends Cal1 {

    public Add() {
    }

    public Add(int num1, int num2) {
        super(num1, num2);
    }

    @Override
    public int getResult() {
        return num1 + num2;
    }

    public void show(){

    }
}
