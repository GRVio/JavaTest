package com.zzkjzy.javase.grade.self.week1.day20.homework;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 日志工具
 */
public class Logger {

    /**
     * 生成一行日志，记录当前时间与发生的事件
     * @param msg   事件信息
     */
    public static void log(String msg){

        try {
            // 创建标准输出流指向日志文件
            PrintStream print = new PrintStream(new FileOutputStream("log.txt",true));
            // 改变输出方向
            System.setOut(print);

            // 获取当前时间
            Date date = new Date();
            // 时间格式化
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
            String nowTime = sdf.format(date);

            // 记录
            System.out.println(nowTime + ":" + msg);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
