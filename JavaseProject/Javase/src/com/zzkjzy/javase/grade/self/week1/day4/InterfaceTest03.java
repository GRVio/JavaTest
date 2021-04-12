package com.zzkjzy.javase.grade.self.week1.day4;

public class InterfaceTest03 {

    public static void main(String[] args){

        // 多态
        A1 a1 = new D1();
        a1.m1();
        // a1并不能调m2方法
        // a1.m2();

        // 将a1进行强制类型转换(向下转型)
        // 经过测试：接口与接口在没有继承关系时，也可以强制类型转换。
        // 但注意：程序在运行时，可能会出现ClassCastException
        B1 b1 = (B1) a1;
        b1.m2();
    }
}

interface A1{
    void m1();
}

interface B1{
    void m2();
}

interface C1{
    void m3();
}

// 类可以实现多个接口，但依然还是需要实现方法
class D1 implements A1,B1,C1{
    // 实现m1
    public void m1(){
        System.out.println("m1 is going");
    }
    // 实现m2
    public void m2(){
        System.out.println("m2 is going");
    }
    // 实现m3
    public void m3(){

    }
}