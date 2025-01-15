package com.cgt.day6.day61interface;

public class Demo {
    public static void main(String[] args){
//        DaYan daYan = new DaYan();
//        daYan.fly();
//        daYan.show();
//        daYan.egg();
        IFly iFly = new DaYan();
        iFly.fly();
//        iFly.egg();
//        iFly.show();
        AbstractBird bird = new DaYan();
        bird.egg();
//        bird.show();
//        bird.fly();
        bird = new QiEr();
        bird.egg();

    }
}
