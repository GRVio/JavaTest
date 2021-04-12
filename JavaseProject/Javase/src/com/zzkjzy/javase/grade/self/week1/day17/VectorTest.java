package com.zzkjzy.javase.grade.self.week1.day17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

/**
 * Vector集合测试
 */
public class VectorTest {
    public static void main(String[] args) {

        // 创建Vector集合
        List list = new Vector();

        // 添加元素
        // 有序可重复
        // 扩容时，容量为原容量的2倍
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        list.add(11);

        // 循环集合
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // 使用集合工具类将非线程安全的ArrayList转为线程安全的Vector
        // 非线程安全的
        List list1 = new ArrayList();

        // 变成线程安全的
        Collections.synchronizedList(list1);// 线程安全的

        // 线程安全的
        list1.add(1);
        list1.add(2);
        list1.add(3);

    }
}
