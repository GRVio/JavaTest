package com.zzkjzy.javase.grade.self.week1.day20;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

/**
 * BufferedWriter、OutputStreamWriter
 */
public class BufferedWriterTest01 {
    public static void main(String[] args) throws Exception{

        /*// 创建字节输出流
        FileOutputStream fos = new FileOutputStream("tempTest02");
        // 转换 ！
        OutputStreamWriter osw = new OutputStreamWriter(fos);
        // 创建缓冲字节输出流
        BufferedWriter bw = new BufferedWriter(osw);*/
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("tempTest02")));

        // 写入
        bw.write("Hello World!");
        bw.write("\r\n");
        bw.write('a');
        bw.write("\r\n");
        bw.write(new char[]{'a','b','c'});

        // 刷新并关闭
        bw.flush();
        bw.close();
    }
}
