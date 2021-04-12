package com.zzkjzy.javase.grade.self.week1.day15;

/**
 * 异常对象中，有两个重要的方法：
 *
 *      获取异常简单的描述信息：
 *      String s1 = no.getMessage();
 *
 *      打印异常追踪的堆栈信息：
 *      no.printStackTrace();
 *
 */
public class ExceptionTest06 {
    public static void main(String[] args) {

        // 异常对象的getMessage()方法
        // 实际获取的是异常的构造方法传入的字符串
        NullPointerException no =   new NullPointerException("这是异常的简单描述。");
        String s1 = no.getMessage();
        System.out.println(s1);

        // 异常对象的printStackTrace()方法
        // 为什么此处打印的异常信息在HelloWorld上面？
        // 因为异常信息是由另一个线程来负责打印的，因此结果可能会在‘HelloWorld’下，也可能在‘HelloWorld’上
        no.printStackTrace();
        System.out.println("Hello World!");

    }
}
