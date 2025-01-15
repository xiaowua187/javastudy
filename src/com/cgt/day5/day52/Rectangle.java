package com.cgt.day5.day52;

public class Rectangle {
    private int width;
    private int height;

    public Rectangle(){
        //width = 1;
        //high = 1;
        //this.width = 2;
        //this.high = 2;
        //new Rectangle(2,2);
        this(3,3);
    }
    public Rectangle(int num){
        this.width=num;
        this.height =num;
    }
    public Rectangle(int width,int high){
        this.width=width;
        this.height =high;
    }
}
