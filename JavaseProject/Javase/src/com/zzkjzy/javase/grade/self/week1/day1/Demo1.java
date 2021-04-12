package com.zzkjzy.javase.grade.self.week1.day1;

public class Demo1 {

    // 静态变量
    static Student stu = new Student();

    public static void main(String[] args) {

        // 模仿println语句 写出的方法
        Demo1.stu.Test();

        System.out.println("Hello World!");

        // toString
        Demo1 dm = new Demo1();
        System.out.println(dm);
    }
}

// 学生类

class Student {

    public void Test(){
        System.out.println("正在考试！");
    }
}
