package com.zzkjzy.javase.grade.self.week1.day15;

/**
 * 仅展示抛出编译时异常后，不对异常进行处理时的结果
 */
public class ExceptionTest03 {
    public static void main(String[] args) {


//        doSome();
    }

    /**
     * doSome方法在这个位置上使用了：throw ClassNotFoundException
     * 代表我们在调用这个方法的过程中可能会出现ClassNotFoundException异常
     * 这个异常的父类是Exception，属于编译时异常，因此必须先对其进行预处理
     * @throws ClassNotFoundException
     */
    public static void doSome() throws ClassNotFoundException{

    }
}
