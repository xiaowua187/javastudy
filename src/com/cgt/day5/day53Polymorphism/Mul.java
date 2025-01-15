package com.cgt.day5.day53Polymorphism;

public class Mul extends Cal1 {

    public Mul() {
    }

    public Mul(int num1, int num2) {
        super(num1, num2);
    }

    @Override
    public int getResult() {
        return num1 * num2;
    }
}
