package com.zzkjzy.javase.grade.self.week1.day13;

import java.util.Random;

/**
 * 随机数：
 */
public class RandomTest01 {
    public static void main(String[] args) {

        // 创建随机数对象
        Random r1 = new Random();
        // 随机产生一个int类型取值内的随机数。
        int number1 = r1.nextInt();
        System.out.println(number1);

        // 随机产生一个0-100范围内的随机数
        int number2 = r1.nextInt(101);
        System.out.println(number2);
    }
}
