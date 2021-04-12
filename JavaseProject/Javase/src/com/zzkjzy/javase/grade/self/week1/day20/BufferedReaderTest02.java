package com.zzkjzy.javase.grade.self.week1.day20;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 * 使用转换流将字节流转换为字符流
 *      为加快学习效率，直接抛出异常
 */
public class BufferedReaderTest02 {
    public static void main(String[] args) throws Exception{

        /*// 注意下面的节点流和包装流。
        // 节点流和包装流是相对而言的，没有一个固定的流。注意区分。
        // 创建字节流
        FileInputStream fis = new FileInputStream("tempTest");
        // 转换！
        InputStreamReader isr = new InputStreamReader(fis);
        // 创建字符流
        BufferedReader br = new BufferedReader(isr);
        */

        // 合并以上代码
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("tempTest")));

        // 读取
        String line = null;
        while ((line = br.readLine()) != null){
            System.out.println(line);
        }

        // 记得关闭！
        br.close();
    }
}
