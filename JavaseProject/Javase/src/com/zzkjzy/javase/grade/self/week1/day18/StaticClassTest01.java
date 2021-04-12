package com.zzkjzy.javase.grade.self.week1.day18;

/**
 * 静态内部类
 */
public class StaticClassTest01 {

    private static class MyClass{
        public static void m1() {
            System.out.println("m1方法执行！");
        }
        public void m2(){
            System.out.println("m2方法执行！");
        }
    }

    public static void main(String[] args) {

        // 调用静态内部类中的m1方法
        StaticClassTest01.MyClass.m1();
        // 创建静态内部类对象
        StaticClassTest01.MyClass mc = new StaticClassTest01.MyClass();
        // 调用实例方法
        mc.m2();
    }
}
