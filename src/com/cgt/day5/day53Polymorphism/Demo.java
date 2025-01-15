package com.cgt.day5.day53Polymorphism;

import com.cgt.day5.day52.Cal;

public class Demo {
    public static void main(String[] args){

        Add add = new Add(3,5);
        int result1 = add.getResult();
        System.out.println(result1);
//        jiSuan(add);
//        Sub sub = new Sub(3,5);
//        jiSuan(sub);

//        Cal1 cal1 = new Cal1(3,5);
//'Cal1' is abstract; cannot be instantiated
//        int result4 = cal1.getResult();
//        System.out.println(result4);
        Cal1 cal = new Add(3,5);
        int result2 = cal.getResult();
        System.out.println(result2);
        cal = new Sub(3,5);
        int result3 = cal.getResult();
        System.out.println(result3);
    }

    public static void jiSuan(Cal cal) {
//        cal.show();
        cal.getResult();
    }

//    public static void jiSuan(Add add) {
//        add.getResult();
//    }
//
//    public static void jiSuan(Sub sub) {
//        sub.getResult();
//    }
//
//    public static void jiSuan(Mul mul) {
//        mul.getResult();
//    }
}
