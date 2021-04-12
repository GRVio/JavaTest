package com.zzkjzy.javase.teach.class11;

import java.io.*;

/**
 * IO流
 */
public class Demo2 {
    public static void main(String[] args) {
            BufferedWriter writer = null;
        try {
            // 创建缓冲字节输出流
            writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("temp")));

            // 写入
            writer.write("写入一个字符串。");

            // 刷新
            writer.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
