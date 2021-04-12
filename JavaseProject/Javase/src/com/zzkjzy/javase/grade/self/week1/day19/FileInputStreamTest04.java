package com.zzkjzy.javase.grade.self.week1.day19;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 改造上一个代码（最终版（真的吗））
 */
public class FileInputStreamTest04 {
    public static void main(String[] args) {

        FileInputStream fis = null;
        try {

            fis = new FileInputStream("tempTest");
            // 准备一个byte数组
            byte[] bytes = new byte[4];
            //// while死循环，直到读完文件。
            //while (true){
            //
            //    // 读取的数量
            //    int readCount = fis.read(bytes);
            //    // if判断，读到末尾退出循环。
            //    if (readCount == -1) {
            //        break;
            //    }
            //    // 转换成字符串
            //    System.out.print(new String(bytes,0,readCount));
            //}
            // 继续改进
            int readCount = 0;
            while ((readCount = fis.read(bytes)) != -1){
                System.out.print(new String(bytes,0,readCount));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
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
