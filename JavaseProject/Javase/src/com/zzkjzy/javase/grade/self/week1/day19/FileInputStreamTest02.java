package com.zzkjzy.javase.grade.self.week1.day19;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 改造一下之前编写的while循环
 */
public class FileInputStreamTest02 {
    public static void main(String[] args) {

        // 输入流
        FileInputStream fis = null;
        try {

            fis = new FileInputStream("D:\\JavaseProject\\Javase\\src\\com\\zzkjzy" +
                    "\\javase\\grade\\self\\week1\\day19\\temp");

            /*
            * 改造刚刚编写的while循环
            *   先给readData赋一个初始值
            *   然后由于括号内先运算，直接为readData赋值为fis.read
            *   后面跟判断条件即可
            */
            int readData = 0;
            while ((readData = fis.read()) != -1){
                System.out.println(readData);
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
