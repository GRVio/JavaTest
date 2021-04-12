package com.zzkjzy.javase.grade.self.week1.day12;

/**
 * String类的测试
 */
public class StringTest01 {
    public static void main(String[] args) {

        String a1 = "hello";
        String a2 = "hello";
        // 双引号创建的字符串
        System.out.println(a1 == a2);

        String a3 = new String("123");
        String a4 = new String("123");
        // new出来的字符串只能使用equals进行比较
        System.out.println(a3.equals(a4));

        // 双引号字符串后面可以直接加"."
        // 因为双引号字符串 实质上是一个String对象
        
        System.out.println("为什么".equals(a3));
    }
}
