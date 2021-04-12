package com.zzkjzy.javase.grade.self.week1.day4;

public class InterfaceTest02 {
    public static void main(String[] args) {

        // 可以使用多态
        MyMath02 mm = new MyMathImpl();
        // 调用接口中的方法(面向接口编程)
        System.out.println(mm.sum(1,2));
        System.out.println(mm.sub(1,2));
    }
}

interface MyMath02{
    double PI = 3.1415926;
    int sum(int a,int b);
    int sub(int a,int b);
}

// 编写一个类
// 类名无实际意义

/*
// 错误，未将接口中方法重写
class MyMathImpl implements MyMath02{
}
*/

/*
// 抽象类可以直接“实现”接口且不对抽象方法进行重写
abstract class MyMathImpl implements MyMath02{
}
 */

// 实现/重写/覆盖 接口中的方法(通常称为实现)
class MyMathImpl implements MyMath02{
    public int sum(int a,int b){
        return a + b;
    }
    public int sub(int a,int b){
        return a - b ;
    }
}
