package com.zzkjzy.javase.grade.self.week1.day15;

/**
 * 异常
 */
public class ExceptionTest01 {
    public static void main(String[] args) {

        int a = 10;
        int b = 0;
        // 由于除数为0，程序执行到此处会发生异常
        // 而这个异常，是程序在此处创建了一个异常对象，并抛出后，才能显示在控制台上的
        int c = a / b;
        System.out.println(c);
    }
}
