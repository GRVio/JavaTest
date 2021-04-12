package com.zzkjzy.javase.grade.self.week1.day9;

/**
 * 数组   main方法
 */

public class ArrayTest04 {
    public static void main(String[] args) {
        // JVM传入的String数组长度为0
        // 为什么不是null？   -因为null.length会出现空指针异常
        // 怎么样才能创建长度为0的数组？  想怎么创怎么创     int[] a = new int[0];

        System.out.println("JVM传入的String数组长度是" + args.length);

        // 这个数组什么时候会有值呢？
        // 这个数组是用来接收用户输入的，用户可以在控制台上输入参数，这个参数会被转换成String[] args数组
        // 当用户使用以下格式写时：java ArrayTest04 abc def xyz
        // 这时候JVM会自动将参数“abc def xyz”以空格的方式分离，并放到String[] args 数组里
        // "abc,def,xyz"  -->  {"abc","def","xyz"}
        // 所谓在控制台输入，，就是cmd，，在javac编译完之后 使用java运行时，在后面输入
    }
}
