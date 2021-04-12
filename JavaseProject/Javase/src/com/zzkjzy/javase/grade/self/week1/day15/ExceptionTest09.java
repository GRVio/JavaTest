package com.zzkjzy.javase.grade.self.week1.day15;

/**
 * 面试题：判断m1的返回值。
 *      ANSWER：返回值为100.
 *
 *      QUESTION：不是先执行finally再return吗？
 *      原因：
 *      在java中有一些规则是不能被改变的，如：
 *      1、方法体中的代码必须按照自上而下的顺序，依行执行！
 *      2、而且return语句是一定是最后执行的，return一旦执行，方法结束！
 *
 *      而java在编译时会为了遵循这些不会被改变的规则，去改变源代码
 *      因此返回值为100
 *
 *      具体可以看一下class文件的反编译，基本可以看懂
 *
 *

 */
public class ExceptionTest09 {
    public static void main(String[] args) {

        int result = m1();
        System.out.println(m1());
    }

    private static int m1() {
        int i = 100;
        try {
            return i;
        }finally {
            ++i;
        }
    }

}
