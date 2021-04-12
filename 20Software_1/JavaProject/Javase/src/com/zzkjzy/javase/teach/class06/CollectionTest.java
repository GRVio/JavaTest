package com.zzkjzy.javase.teach.class06;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/**
 * 迭代器
 */
public class CollectionTest {
    public static void main(String[] args) {

        // ArrayList——有序可重复
        Collection c = new ArrayList();

        // 添加元素
        c.add(1);
        c.add(2);
        c.add(3);
        c.add(1);
        Iterator i = c.iterator();

        // 遍历集合
        // 取出的类型仍为Integer
        // 为什么存入是Integer？-自动装箱
        while (i.hasNext()){
            System.out.println(i.next());
        }

        System.out.println("*************************************");

        // HashSet——无序不可重复
        // 存取顺序不一定相同
        // 相同数值不能反复储存，即使存了也存不进去
        Collection c2 = new HashSet();

        // 添加元素
        c2.add(10);
        c2.add(20);
        c2.add(30);
        c2.add(40);
        c2.add(20);
        c2.add(10);

        // 遍历集合
        Iterator i2 = c2.iterator();
        while (i2.hasNext()){
            System.out.println(i2.next());
        }
    }
}
