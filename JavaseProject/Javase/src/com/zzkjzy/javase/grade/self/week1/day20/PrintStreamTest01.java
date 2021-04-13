package com.zzkjzy.javase.grade.self.week1.day20;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 * 标准输出流
 * 改变它的输出方向
 */
public class PrintStreamTest01 {
    public static void main(String[] args) throws FileNotFoundException {

        // 默认输出方向
        System.out.println("Hello World!");
        PrintStream a = System.out;
        a.println("Hello World!");

        // 改变输出方向
        // 为方便学习，直接抛出异常
        PrintStream printStream = new PrintStream(new FileOutputStream("log"));
        System.setOut(printStream);
        System.out.println("Hello World!");
        System.out.println(123546);
        System.out.println("It's a Demo!");
    }
}
