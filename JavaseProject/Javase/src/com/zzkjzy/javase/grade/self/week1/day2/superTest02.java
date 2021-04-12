package com.zzkjzy.javase.grade.self.week1.day2;

/**
 * 1、判断输出顺序
 *
 * 2、结论：Object是最后被调用，最先执行的
 *      Object始终处于栈的最上方
 */

public class superTest02 {
    public static void main(String[] args){
        new C2();
    }
}

class A2{
    public A2(){
        System.out.println("A的无参数构造方法执行");
    }
}

class B2 extends A2{
    public B2(){
        super();
        System.out.println("B的无参数构造方法执行");
    }
    public B2(String name){
        super();
        System.out.println("B的有参数构造方法执行(String)");
    }
}

class C2 extends B2{
    public C2(){
        this("zhangsan");
        System.out.println("C的无参数构造方法执行");
    }
    public C2(String name){
        this(name,18);
        System.out.println("C的有参数构造方法执行(String)");
    }
    public C2(String name,int age){
        super(name);
        System.out.println("C的有参数构造方法执行(String int)");
    }
}
