package com.zzkjzy.javase.grade.self.week1.day17;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 泛型
 */
public class GenericTest {
    public static void main(String[] args) {

        // 不使用泛型
        //// 创建集合
        //List list = new ArrayList();
        //
        //// 创建对象
        //Cat cat = new Cat();
        //Bird bird = new Bird();
        //
        //// 添加元素
        //list.add(cat);
        //list.add(bird);
        //
        //// 遍历集合，并使cat走猫步，bird飞翔
        //Iterator iterator = list.iterator();
        //while (iterator.hasNext()){
        //
        //    Object o =iterator.next();
        //
        //    if (o instanceof Cat){
        //        Cat c = (Cat)o;
        //        c.move();
        //    }else if (o instanceof Bird){
        //        Bird b = (Bird)o;
        //        b.move();
        //    }else{
        //        System.out.println("Error!");
        //    }
        //}

        // 使用泛型
        List<Animal> list = new ArrayList<Animal>();

        // 只能储存Animal类型及其子类型的数据
        //list.add(123);

        // 创建对象
        Cat cat = new Cat();
        Bird bird = new Bird();
        list.add(cat);
        list.add(bird);

        // 获取迭代器
        // 迭代器也支持泛型，使用泛型后返回值为指定类型
        // 不再需要强制类型转换
        Iterator<Animal> iterator = list.iterator();
        while (iterator.hasNext()){
            Animal animal = iterator.next();
            animal.move();
        }
    }
}

class Animal{
    public void move(){
        System.out.println("Animal is moving!");
    }
}

class Cat extends Animal{
    public void move(){
        System.out.println("猫在走猫步！");
    }
}

class Bird extends Animal{
    public void move(){
        System.out.println("鸟儿在飞翔！");
    }
}
