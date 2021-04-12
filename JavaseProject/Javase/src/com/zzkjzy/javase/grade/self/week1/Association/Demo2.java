package com.zzkjzy.javase.grade.self.week1.Association;

/**
 * while循环
 *      介绍while循环的基本格式
 *      写一个简单的while循环
 *
 */
public class Demo2 {
    public static void main(String[] args) {

        // 这是一个while循环
        // 首先，写一个while关键字，然后在后面跟一个括号，括号内写循环条件
        int a = 1;
//        while (a <= 5){
//            System.out.println("Hello World!");
//            a = a + 1;
//        }
        int b = 1;
        while (a<=9){
            while (b <= a){
                System.out.print(b + "*" + a + "=" +(a*b));
                b = b + 1;
                System.out.print(" ");
            }
            System.out.println();
            b = 1;
            a = a + 1;
        }
    }
}
