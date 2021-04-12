package com.zzkjzy.javase.grade.self.week1.day13;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * java中对日期的处理
 *      1、Date与String之间的转换
 *      2、获取系统当前时间
 *      3、格式化日期
 */
public class DateTest01 {
    public static void main(String[] args) throws Exception {

        // 获取系统当前时间
        Date nowTime = new Date();
        // toString方法已经被重写了
        // 输出的是一个日期字符串
        System.out.println(nowTime);

        // 对日期进行格式化
        // 将Date类型的日期转换成具有一定格式的日期字符串
        // SimpleDateFormat 是java.text包下的一个类，专门负责日期格式化。
        // 使用指定的格式来进行日期格式化
        // 格式具体见帮助文档
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd/HH.mm.ss.SSS");
        // 将日期对象传入simpleDateFormat中的format方法
        String nowDate = simpleDateFormat.format(nowTime);
        System.out.println(nowDate);

        // 怎么将字符串格式转换为Date类型？
        String time = "2002.03.20 22.22.22 222";
        // 此处的格式要与字符串的格式一致
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH.mm.ss SSS");
        Date myDate = sdf.parse(time);
        System.out.println(myDate);
    }
}
