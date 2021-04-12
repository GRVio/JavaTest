package com.zzkjzy.javase.grade.self.week1.day17;

/**
 * 自定义泛型
 *  泛型名字只是一个标识符，没有任何意义，随便写
 */
public class GenericTest03 <qwfgwedfagyuiqhwd>{
    // 自定义一个泛型
    public void m1(qwfgwedfagyuiqhwd qwesd){
        System.out.println(123);
    }
    // 此处的泛型是一个返回值
    public qwfgwedfagyuiqhwd doSome(){
        return null;
    }

    public static void main(String[] args) {
        GenericTest03<String> a = new GenericTest03<>();
        a.m1("hello world");

    }
}
