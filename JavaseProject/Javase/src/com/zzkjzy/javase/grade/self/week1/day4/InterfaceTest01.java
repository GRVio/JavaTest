package com.zzkjzy.javase.grade.self.week1.day4;

/**
 * 接口的基本语法01
 */

public class InterfaceTest01 {

    public static void main(String[] args) {
        System.out.println(MyMath.PI);
        System.out.println(MyMath.PI_TWO);
    }
}
// 定义一个接口
interface A{
}
// 接口支持继承
interface B extends A{
}
// 接口支持多继承
interface C extends A,B{
}

interface MyMath{

    // 定义一个常量
    public static final double PI = 3.1415926;
    // 常量前的public static final也可以省略
    double PI_TWO = 3.1415926;

    // 定义一个抽象方法
    public abstract int sum(int a, int b);
    // 接口中的抽象方法前的修饰符可以省略
    // 因为接口是完全抽象的，接口中的代码默认都为抽象的。
    int sum(int a,int b,int c);
}
