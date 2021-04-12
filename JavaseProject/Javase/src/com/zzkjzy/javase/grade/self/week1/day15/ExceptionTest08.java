package com.zzkjzy.javase.grade.self.week1.day15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * try...catch语句中finally子句的使用
 *      finally语句是最后执行的，且一定会执行的一段代码，即使try中的代码出现了异常
 *      finally必须和try一起编写，不能单独编写。
 */
public class ExceptionTest08 {
    public static void main(String[] args) {

        // 创建一个输入流对象，并进行try...catch
        FileInputStream file = null;
        try {
            file = new FileInputStream("D:\\Demo.txt");

            // 这里一定会出现空指针异常!
            String s = null;
            s.toString();
            System.out.println("StepOne");

            } catch (FileNotFoundException e) {
            e.printStackTrace();
            } catch(NullPointerException e){
            e.printStackTrace();
            }finally {
            if (file != null){
                try {
                    file.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
