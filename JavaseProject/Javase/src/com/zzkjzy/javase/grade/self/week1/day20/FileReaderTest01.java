package com.zzkjzy.javase.grade.self.week1.day20;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * FileReader
 */
public class FileReaderTest01 {
    public static void main(String[] args) {

        FileReader fr = null;
        try {

            fr = new FileReader("tempTest");
            // 准备一个char数组
            char[] chars = new char[3];
            fr.read(chars);
            // 遍历数组来读取文件
            for (char c : chars){
                System.out.println(c);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
