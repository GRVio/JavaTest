package com.zzkjzy.javase.grade.self.week1.day15;

/**
 * 自定义异常
 *      直接继承Exception或者RunTimeException并提供无参构造、有参构造即可
 */
public class MyException extends Exception{
    public MyException() {
        super();
    }

    public MyException(String s) {
        super(s);
    }
}

