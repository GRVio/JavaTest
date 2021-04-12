package com.zzkjzy.javase.grade.self.week1.day15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * 处理异常的第一种方式：throws
 *      每个调用的方法都要进行异常上抛，直至传给main方法，main方法会将异常上抛给JVM
 *      使用throws进行上抛时，可以上抛该异常的父类，也可以直接上抛Exception
 *      如需上抛多个异常时，使用逗号隔开
 */
public class ExceptionTest05 {

    public static void main(String[] args)  {
        m1();
    }

    private static void m1()  {

        /*
        使用try...catch语句完成异常处理
        注意语句格式！！
        
         */
        try{
            m2();
        }catch (FileNotFoundException file){
            System.out.println("文件不存在或被移动");
        }
    }

    private static void m2() throws FileNotFoundException{
        m3();
    }

    private static void m3() throws FileNotFoundException {
        /*
        为什么这里会报错？
            因为该方法的构造方法中含有throws FileNotFoundException
            通过集成关系看到：FileNotFoundException是编译时异常
            而这里没有对异常进行处理
        为什么要用两个斜杠？
            一个斜杠代表转义符，两个斜杠代表一个普通斜杠

        这里采用throws继续将异常上抛
         */
        new FileInputStream("123");
    }
}
