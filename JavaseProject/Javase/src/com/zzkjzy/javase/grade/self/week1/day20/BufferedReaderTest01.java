package com.zzkjzy.javase.grade.self.week1.day20;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * BufferedReader
 *      为了加快效率，不再对异常进行try...catch处理
 */
public class BufferedReaderTest01 {
    public static void main(String[] args) throws Exception{

        // 创建流
        FileReader fr = new FileReader("tempTest");
        BufferedReader br = new BufferedReader(fr);

        /*// 读一行
        String firstLine = br.readLine();
        System.out.println(firstLine);*/

        // 使用循环读取整个文件
        String s = null;
        while ((s = br.readLine()) != null){
            System.out.println(s);
        }

        // 关闭 只关闭包装流即可。
        br.close();
    }
}
