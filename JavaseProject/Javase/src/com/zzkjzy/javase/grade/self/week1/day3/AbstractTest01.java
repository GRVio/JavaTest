package com.zzkjzy.javase.grade.self.week1.day3;


// 抽象类中的抽象方法
public abstract class AbstractTest01 {
    public abstract void doSome();
}
// 抽象类可以被抽象类继承
abstract class AbstractTest02 extends AbstractTest01{

}
// 类继承抽象类时，必须将抽象方法实现。
class A01 extends AbstractTest02{
    public void doSome(){

    }
}
