package com.zzkjzy.javase.grade.self.week1.day8;

/**
 * 匿名内部类：
 *      实例内部类
 *      静态内部类
 *      局部内部类
 *
 * 匿名内部类是局部内部类的一种
 *
 * 例子实现过程：
 *      先定义出接口；
 *      在计算类中调用接口中的方法，实现加法计算
 *      在main方法中进行运算，由于无法实例化接口，于是需要编写接口的实现类
 *      这里，实例化接口的方法不需要传入参数
 *
 *      接下来，使用匿名内部类实现该方法
 *      不需要实现接口，直接new一个接口
 *      在小括号后加入方法体并将其实现
 *
 *      由于代码太乱，可读性很差，且不能复用。所以不建议使用匿名内部类
 */

public class Test01 {
    // 实例变量
    // 实例内部类
    int a;
    class A{

    }

    // 静态变量
    // 静态内部类
    static int b;
    static class B{

    }

    // 局部变量
    // 局部内部类
    public void main(){
        int a = 100;
        class c{

        }
    }

    public static void main(String[] args) {

        MyMath mm = new MyMath();
        // 使用匿名内部类的方法：
        mm.plus(new Sum(){
            @Override
            public int sum(int a, int b) {
                return 0;
            }
        },5,6);
    }
}


// 加法接口
interface Sum{
    int sum(int a,int b);
}

/*
// 实现接口的方法
// 这个方法不需要传入任何参数，只是在类中进行加法运算
class SumImpl implements Sum{
    public int sum(int a,int b){
        return a + b;
    }
}*/

// 运算类
// 实现一个加法运算
class MyMath{
    public void plus(Sum s,int a,int b){
        int result = s.sum(a,b);
        System.out.println("计算结果为：" + result);
    }
}
