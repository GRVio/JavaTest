package com.zzkjzy.javase.grade.self.week1.day13;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Date类的构造方法
 */
public class DateTest03 {
    public static void main(String[] args) {
        // 有参构造：传入一个自1970.01.01 00:00:00的毫秒数
        // 判断当前时间：1970.01.01 00:00:00:001
        Date d = new Date(1);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH.mm.ss.SSS");
        String s = sdf.format(d);

        // 为什么结果为1970.01.01 08.00.00.001？
        // 因为我们在东八区
        System.out.println(s);
    }
}
