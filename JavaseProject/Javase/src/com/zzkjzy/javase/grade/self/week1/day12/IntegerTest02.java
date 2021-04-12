package com.zzkjzy.javase.grade.self.week1.day12;

/**
 * 自动拆箱与自动装箱：
 *
 */
public class IntegerTest02 {
    public static void main(String[] args) {

        //自动装箱
        // 左引用数据类型 右边基本数据类型
        Integer x = 100;
        System.out.println(x);

        // 自动拆箱
        // 同上
        int y = x;
        System.out.println(y);

        // 为什么不会报错？
        // 加号两边要求是基本类型的数字，z是包装类，不是基本数据类型
        // 因此，这里会自动拆箱，将a1转换为基础数据类型
        Integer a1 = 1234;
        // Integer a1  = new Integer(1234);
        System.out.println(a1 + 1);

        // 上面例子中a1仍然是一个引用数据类型，所以a1中保存的是对象的内存地址
        // 证明：
        // 注意：此处a2、a3的值若在byte的取值范围（-128~127）则为true
        // 并不代表保存的不是内存地址，而是因为Java中(-128~127)的数比较常用，所以储存在整数型常量池中
        // 因此，这个范围以内的数的内存地址不会改变。
        Integer a2 = 1000;
        Integer a3 = 1000;
        System.out.println(a2 == a3);



    }
}
