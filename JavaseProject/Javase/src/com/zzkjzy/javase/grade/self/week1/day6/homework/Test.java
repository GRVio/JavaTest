package com.zzkjzy.javase.grade.self.week1.day6.homework;

public class Test {

    public static void main(String[] args) {

        // 新建外设对象
        InsertDrawable k = new Keyboard();
        InsertDrawable m = new Mouse();

        // 新建电脑对象
        Computer computer = new Computer(m);
        computer.main();
    }
}
