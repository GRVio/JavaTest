package com.zzkjzy.javase.grade.self.week1.day6;

// import java.util.Scanner;
import java.util.*;
/**
 *  对 Scanner 进行解释
 */

public class ScannerTest01 {

    public static void main(String[] args) {

        // 为什么要这样写？
        // 因为Scanner和ScannerTest01不在同一个包下
        // java.util就是Scanner的包
        // 使用import导包
        // java.util.Scanner s = new java.util.Scanner(System.in);
        Scanner s  = new Scanner(System.in);

        String str = s.next();
        System.out.println("您输入的字符串是：" + str);
    }
}
