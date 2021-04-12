package com.zzkjzy.javase.grade.self.week1.day15;

/**
 * 自定义异常在具体场景的使用
 */
public class MyExceptionTest02 {
    public static void main(String[] args) throws MyException {

        int a = 5;
        if (a > 1){
/*
            // 这里可以使用异常进行对程序的处理
            // 抛异常可以终止程序，并抛出异常信息
            MyException e = new MyException("a不能大于1！！！");
            // 将异常抛出
            // 由于抛出的是一个编译时异常，所以要进行异常处理
            // 必须使用throws，为什么？
            // 因为这个异常是自己手动抛出的，是希望调用者能够看到！
            // 如果使用try...catch进行处理，毫无意义！
            throw e;

 */
            // 将上面两行代码进行合并（手动抛出异常）
            throw new MyException("a不能大于1！！");
            
        }else {
            System.out.println("a不大于1");
        }
    }
}
