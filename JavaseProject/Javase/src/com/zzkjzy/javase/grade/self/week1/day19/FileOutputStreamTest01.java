package com.zzkjzy.javase.grade.self.week1.day19;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 文件字节输出流
 */
public class FileOutputStreamTest01 {
    public static void main(String[] args) {

        FileOutputStream fos = null;
        try {
            // 文件不存在会新建
            // 谨慎使用这种方法！
            //// 这是将原文件清空后再进行写入的
            //fos = new FileOutputStream("myTemp");
            // 在原文件的末尾追加写入（不清空原文件）
            // 调用构造方法，在文件名后加一个Boolean值，true代表追加，false代表从头开始写。
            fos = new FileOutputStream("myTemp",false);
            // 写文件
            byte[] bytes = {97,98,99,100,101};
            // 全部写入
            fos.write(bytes);
            // 部分写入
            fos.write(bytes,0,3);
            // 写入字符串：将字符串转换为byte数组
            String s = "这是一句话！";
            byte[] bytes1 = s.getBytes();
            fos.write(bytes1);
            // 写完之后一定要刷新！
            fos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
