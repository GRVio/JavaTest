package com.zzkjzy.javase.grade.self.week1.day13;

/**
 * 获取指定时间到当前系统时间的总毫秒数
 *      1s = 1000ms
 */
public class DateTest02 {
    public static void main(String[] args) {

        // 获取自1970年1月1日 00:00:00到当前系统时间的总毫秒数
        long ms = System.currentTimeMillis();
        System.out.println(ms);

        // 统计执行某个方法所使用的时间
        long begin = System.currentTimeMillis();
        doSome();
        long end = System.currentTimeMillis();
        System.out.println("执行该方法耗费了" + (end - begin) + "毫秒");
    }
    public static void doSome(){
        for (int i = 0; i < 1000000000; i++) {
            System.out.println(i);
        }
    }
}
