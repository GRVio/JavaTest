package com.zzkjzy.javase.grade.self.week1.day17;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 自动类型推断（钻石表达式）
 */
public class GenericTest02 {
    public static void main(String[] args) {

        // 自动类型推断
        List<Animal> list = new ArrayList<>();

        // 泛型，此处报错
        // list.add(123);
        list.add(new Animal());
        list.add(new Cat());

        // 遍历
        Iterator<Animal> iterator = list.iterator();
        while (iterator.hasNext()){
            Animal animal = iterator.next();
            animal.move();
        }


    }
}
