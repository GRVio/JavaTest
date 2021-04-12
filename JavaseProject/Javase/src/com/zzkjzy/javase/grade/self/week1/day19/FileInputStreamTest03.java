package com.zzkjzy.javase.grade.self.week1.day19;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 使用read(byte[] b)方法读取文件
 * 绝对路径与相对路径
 *      这个学过了，不需赘述。
 *      但问题在于，IDEA的默认当前位置路径在哪？
 *      在当前“工程”的目录下。不是包下。不是src下，不是模块下，而是工程下。
 *      当前工程为“Project”，模块为“Javase”，注意区分
 */
public class FileInputStreamTest03 {
    public static void main(String[] args) {

        FileInputStream fis = null;

        try {

            fis = new FileInputStream("tempTest");

            // 使用read(byte[] b)读取
            byte[] bytes = new byte[5];
            // 这个方法返回的是读取到的字节的数量
            // 文件字节数为7
            int readCount = fis.read(bytes);// 第一次读，把数组读满，返回值为5
            System.out.println(readCount);// 5
            // 将数组转换为字符串，读到哪转到哪
            System.out.println(new String(bytes,0,readCount));

            readCount = fis.read(bytes);// 第二次读，只剩下了两个字符，这两个字符会覆盖掉之前数组中的字符，但返回值仍为2
            System.out.println(readCount);// 2
            System.out.println(new String(bytes,0,readCount));

            readCount = fis.read(bytes);// 再次读取，空，返回值-1
            System.out.println(readCount);// -1

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
