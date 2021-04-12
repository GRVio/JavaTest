package com.zzkjzy.javase.grade.self.week1.day7;

/**
 * String类：
 *  String类重写了 toString()、equals() 方法
 *  String是一个类，不是基本数据类型，所以String是有构造方法的。
 *      用构造方法创建的String 不能使用"=="去判断是否相等
 *      只能去调用equals()方法判断
 *  String类重写toString()方法的证明：
 *      调用toString()方法的时候，只输出字符串
 *      输出引用时，默认调用toString()方法，依然输出字符串
 */

public class StringTest01 {

    public static void main(String[] args) {

        // 可以使用双等号
        String a1 = "123";
        String a2 = "123";
        System.out.println(a1 == a2);

        // 不能使用双等号
        String a3 = new String("123");
        String a4 = new String("123");
        System.out.println(a3 == a4);
        System.out.println(a3.equals(a4));

        // 重写toString()方法的证明
        System.out.println(a1.toString());
        System.out.println(a1);
    }
}
