package com.zzkjzy.javase.grade.self.week1.day12;

/**
 * 包装类：
 *      如下列代码，doSome方法需要传入一个object参数，
 *      若此时调用doSome方法时，需要向里面传入一个int类型参数时，就可以使用包装类完成此操作。
 *
 * 基本数据类型对应的包装类型是什么？
 *
* 基本数据类型                        包装数据类型
 * -----------------------------------------------------
 * byte                             java.lang.Byte
 * short                            java.lang.Short
 * int                              java.lang.Integer
 * long                             java.lang.Long
 * float                            java.lang.Float
 * double                           java.lang.Double
 * boolean                          java.lang.Boolean
 * char                             java.lang.Character
 *
 */
public class IntegerTest01 {
    public static void main(String[] args) {

        // Ctrl点过去，发现Integer是一个Class类，且继承Number
        Integer i = 123;

        // 此处，123是一个基本数据类型，进行构造方法的包装达到了：基础数据类型向引用数据类型的转换
        // 基本数据类型 --(转换为)-> 引用数据类型      这个操作被称为“装箱”
        Integer ii = new Integer(123);
        Integer iii = new Integer("123");

        // 此处，引用数据类型被分别转换成了三种不同的基础数据类型
        // 这个过程叫做拆箱，调用的方法是Number类中的方法
        System.out.println(ii.floatValue());
        System.out.println(ii.intValue());
        System.out.println(ii.longValue());

        // 通过方法包装类中的常量，来获取最大值和最小值
        System.out.println("Integer的最大值" + Integer.MAX_VALUE);
        System.out.println("Integer的最小值" + Integer.MIN_VALUE);
        System.out.println("Byte的最大值" + Byte.MAX_VALUE);
        System.out.println("Byte的最小值" + Byte.MIN_VALUE);

    }

    public static void doSome(Object obj){
        System.out.println("doSome!");
    }
}
