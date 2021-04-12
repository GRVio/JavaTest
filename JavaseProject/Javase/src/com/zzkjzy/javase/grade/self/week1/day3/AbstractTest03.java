package com.zzkjzy.javase.grade.self.week1.day3;

/**
 * 例子：
 *  使用多态来实例化继承抽象类的子类
 */

public class AbstractTest03 {

    public static void main(String[] args) {
        // 父类型引用指向子类型对象
        Animal a = new Bird();
        a.move();
    }
}

abstract class Animal{
    public abstract void move();
}

class Bird extends Animal{
    public void move(){
        System.out.println("Bird is flying");
    }
}
