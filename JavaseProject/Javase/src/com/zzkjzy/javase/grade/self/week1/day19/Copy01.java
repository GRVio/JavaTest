package com.zzkjzy.javase.grade.self.week1.day19;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 文件的拷贝
 */
public class Copy01 {
    public static void main(String[] args) {

        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {

            // 创建数组
            byte[] bytes = new byte[1024 * 1024 * 20];
            // 源文件读取至内存中
            fis = new FileInputStream("D:\\Download\\[HYSUB]Kaifuku Jutsushi no Yarinaoshi[10][GB_MP4][1920X1080].mp4");
            // 将内存中文件存入新地址
            fos = new FileOutputStream("D:/1.mp4");

            int readCount = 0;
            while ((readCount = fis.read(bytes)) != -1) {
                fos.write(bytes,0,readCount);
            }
            // 写入文件要刷新
            fos.flush();

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
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
