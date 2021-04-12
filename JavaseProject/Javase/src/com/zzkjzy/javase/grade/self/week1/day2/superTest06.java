package com.zzkjzy.javase.grade.self.week1.day2;

import javax.imageio.stream.ImageInputStream;
import java.util.function.DoubleToIntFunction;

public class superTest06 {

    public static void main(String[] args){
        Cat c = new Cat();
        c.yiDong();
    }
}

class Animal{
    public void move(){
        System.out.println("Animal move!");
    }
}

class Cat extends Animal{
    public void move(){
        System.out.println("Cat move!");
    }
    public void yiDong(){
        this.move();// Cat move!
        move();// Cat move!
        super.move();// Animal move!
    }
}