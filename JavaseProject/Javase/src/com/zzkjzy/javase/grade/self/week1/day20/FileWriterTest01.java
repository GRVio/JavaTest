package com.zzkjzy.javase.grade.self.week1.day20;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest01 {
    public static void main(String[] args) {

        FileWriter writer = null;
        try {
            writer = new FileWriter("tempTest");

            // 写入
            // 直接写一个字符串
            writer.write("可以直接写入一个字符串！");
            // 换行
            writer.write("\r\n");
            // 写一个char/char数组
            char[] chars = {'这','是','一','个','数','组'};
            writer.write(chars);
            // 换行
            writer.write("\r\n");
            // 写一部分数组
            writer.write(chars,0,2);

            // 输出流要刷新
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
