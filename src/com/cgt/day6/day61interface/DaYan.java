package com.cgt.day6.day61interface;

public class DaYan extends AbstractBird  implements IFly{
    @Override
    public void fly() {
        System.out.println("DaYan.fly");
    }

    @Override
    void egg() {
        System.out.println("DaYan.egg");
    }
    public void show(){
        System.out.println("DaYan.show");
    }
}
