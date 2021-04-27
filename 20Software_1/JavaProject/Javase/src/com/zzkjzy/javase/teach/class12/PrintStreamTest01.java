package com.zzkjzy.javase.teach.class12;

import java.io.PrintStream;

/**
 * 标准输出流
 */
public class PrintStreamTest01 {
    public static void main(String[] args) {

        System.out.println("Hello World!");
        PrintStream a = System.out;
        a.println("Hello World!");
    }
}
