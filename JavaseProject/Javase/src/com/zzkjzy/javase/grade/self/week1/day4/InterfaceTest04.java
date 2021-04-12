package com.zzkjzy.javase.grade.self.week1.day4;

/**
 * 当extends和implements同时出现时：
 *      extends在前，implements在后
 *      即使没有继承任何一个类，也会默认继承Object类
 *      依然是extends在前implements在后
 */

public class InterfaceTest04 {

    public static void main(String[] args) {
        // 多态
        Flyable f = new Cat();
        f.fly();

        // 调用同一个fly方法，却能出现不同的结果。
        Flyable f1 = new Mouse();
        f1.fly();
        Flyable f2 = new Hen();
        f2.fly();
    }
}

// 父类：动物
class Animal{

}

// 接口：可飞行的(翅膀)
// 接口通常提取的是一个动作
interface Flyable{
    void fly();
}

// 子类：猫
// Flyable是一个接口，一个让猫飞行的接口
// 翅膀插在了猫身上，给与了它飞翔的能力
class Cat extends Animal implements Flyable{
    public void fly(){
        System.out.println("我是一只飞猫！！");
    }
}

class Hen extends Animal implements Flyable{
    public void fly(){
        System.out.println("我是一只飞鸡！！！");
    }
}

class Mouse implements Flyable{
    public void fly(){
        System.out.println("我是一只飞鼠！！");
    }
}


