package com.zzkjzy.javase.grade.self.week1.day19;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * FileInputStream中其他的方法
 *      1、int available()
 *      返回流中剩余没有读取的字节数量。
 *      使用这个方法，可以在最开始返回总字节数量
 *      或直接创建对应长度数组，一次读取完文件
 *      2、skip(long n)
 *      跳过几个字节进行读取
 */
public class FileInputStreamTest05 {
    public static void main(String[] args) {

        FileInputStream fis = null;
        try {

            // 文件
            fis = new FileInputStream("tempTest");
            // 总字节数量为
            System.out.println("总字节数量为：" + fis.available());
            //// 读取一个字节
            //int readByte = fis.read();
            //// 剩余的字节数量
            //System.out.println("剩余的字节数量为：" + fis.available());

            //// 准备一个与文件字节数相同长度的数组
            //byte[] bytes = new byte[fis.available()];
            //// 不需要循环了，一次就可以读取
            //int readCount = fis.read(bytes);
            //System.out.println(readCount);
            //System.out.println(new String(bytes));

            // skip跳过几个字节读取
            fis.skip(3);
            System.out.println(fis.read());



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
