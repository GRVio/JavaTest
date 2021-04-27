package com.zzkjzy.javase.teach.class2;

public class Test {
    public static void main(String[] args) {

        // 使用多态新建对象
        Animal bird = new Bird("a",23);
        // 调用不同参数的方法
        bird.id();
        bird.id("新的id",0);
        // 调用子类重写的方法
        bird.move();
    }
}
