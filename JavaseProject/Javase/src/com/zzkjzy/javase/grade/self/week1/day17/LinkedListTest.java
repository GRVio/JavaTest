package com.zzkjzy.javase.grade.self.week1.day17;

import java.util.LinkedList;
import java.util.List;

/**
 * LinkedList集合测试
 */
public class LinkedListTest {
    public static void main(String[] args) {

        // 创建一个list集合
        List list = new LinkedList();

        // 添加元素并用循环遍历
        // 有序可重复
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

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

    }
}
