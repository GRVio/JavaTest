package com.zzkjzy.javase.grade.self.week1.day2;

public class superTest01 {
    public static void main(String[] args){
        System.out.println("Hello World!");
        new B1();
    }
}
class A1{
    public A1(){
        super();
        System.out.println("A的无参数构造方法");
    }
}

class B1 extends A1{
        public B1(){
            super();
            System.out.println("B的无参数构造方法");
        }
}