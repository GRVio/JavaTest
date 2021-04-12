package com.zzkjzy.javase.grade.self.week1.day15;

/**
 * 对异常进行处理
 */
public class ExceptionTest04 {

//    // 第一种方法：在方法声明位置再次使用throws，继续将异常上抛
//    public static void main(String[] args) throws ClassNotFoundException{
//        doSome();
//    }

    // 第二种方法：使用try...catch进行异常捕捉,快捷键：ALT + 回车
    public static void main(String[] args) {

        try {
            doSome();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


    public static void doSome() throws ClassNotFoundException{

    }
}
