package com.zzkjzy.javase.grade.self.week1.day13;

import java.math.BigDecimal;

/**
 * BigDecimal属于大数据，精度极高。不属于基本数据类型。
 * 这是SUN公司提供的类，用于财务软件当中。
 *
 */
public class BigDecimalTest {
    public static void main(String[] args) {

        BigDecimal bg = new BigDecimal(100);
        BigDecimal bg2 = new BigDecimal(200);

        // 怎么进行求和？
        // 都是引用数据类型，只能调用方法求和。
        System.out.println(bg.add(bg2));
    }
}
