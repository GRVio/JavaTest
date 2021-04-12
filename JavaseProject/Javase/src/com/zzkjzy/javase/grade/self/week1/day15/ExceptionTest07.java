package com.zzkjzy.javase.grade.self.week1.day15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * 异常对象的两个方法：
 *      在查看异常的追踪信息时，怎么看？
 *
 */
public class ExceptionTest07 {
    public static void main(String[] args) {

        //java.io.FileNotFoundException: qwe (系统找不到指定的文件。)
        //	at java.io.FileInputStream.open0(Native Method)
        //	at java.io.FileInputStream.open(FileInputStream.java:195)
        //	at java.io.FileInputStream.<init>(FileInputStream.java:138)
        //	at java.io.FileInputStream.<init>(FileInputStream.java:93)
        //	at com.zzkjzy.javase.grade.self.week1.day15.ExceptionTest07.m3(ExceptionTest07.java:30)
        //	at com.zzkjzy.javase.grade.self.week1.day15.ExceptionTest07.m2(ExceptionTest07.java:26)
        //	at com.zzkjzy.javase.grade.self.week1.day15.ExceptionTest07.m1(ExceptionTest07.java:22)
        //	at com.zzkjzy.javase.grade.self.week1.day15.ExceptionTest07.main(ExceptionTest07.java:13)
        try {
            m1();
        } catch (FileNotFoundException e) {

            // 打印异常堆栈信息！
            // 在开发中使用这个，方便查看异常
            e.printStackTrace();
        }

        // 此处的代码不会被异常所影响执行，因为异常已经被try...catch所捕捉到了
        // 这就是异常处理机制对程序带来的健壮性（服务器不会宕机）。
        System.out.println("Hello World!");
    }

    private static void m1() throws FileNotFoundException {
        m2();
    }

    private static void m2() throws FileNotFoundException {
        m3();
    }

    private static void m3() throws FileNotFoundException {
        new FileInputStream("qwe");
    }

}
