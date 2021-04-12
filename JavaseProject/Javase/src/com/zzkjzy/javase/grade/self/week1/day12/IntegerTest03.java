package com.zzkjzy.javase.grade.self.week1.day12;

/**
 * 总结一下之前遇到的异常：
 *  空指针异常
 *  类型转换异常
 *  数组下表越界异常
 *  数字格式化异常(本案例中出现的异常)
 *
 *  Integer类中的常用方法：
 */
public class IntegerTest03 {
    public static void main(String[] args) {

        // 手动装箱
        Integer a1 = 1000;
        // 手动拆箱
        int i = a1.intValue();
        System.out.println(i);

        // 编译时不会出问题，符合java语法，但运行时会出现异常：NumberFormatException
        // Integer a2 = new Integer("这是一个包装类？");
        // System.out.println(a2);

        // 重点方法！
        // static int parseInt(String s)
        // 静态方法，传参String，返回int
        // 将字符串转化为数字
        int a2 = Integer.parseInt("456");
        System.out.println(a2 + 124);


    }
}
