package com.zzkjzy.javase.grade.self.week1.day18;

import java.util.Set;
import java.util.TreeSet;

/**
 * TreeSet集合
 *      1、无序不可重复
 *      但存入的元素可以按照大小自动排序，我们称为可排序集合
 */
public class TreeSetTest {
    public static void main(String[] args) {

        // 创建TreeSet集合
        Set<String> stringSet = new TreeSet<>();

        // 添加元素
        // 自动排序
        stringSet.add("Q");
        stringSet.add("B");
        stringSet.add("V");
        stringSet.add("D");
        stringSet.add("E");
        stringSet.add("G");
        stringSet.add("G");

        // 遍历
        for (String s : stringSet){
            System.out.println(s);
        }

        TreeSet<Integer> integerTreeSet = new TreeSet<>();

        integerTreeSet.add(60);
        integerTreeSet.add(95);
        integerTreeSet.add(77);
        integerTreeSet.add(77);
        integerTreeSet.add(60);
        integerTreeSet.add(2);
        integerTreeSet.add(20);
        integerTreeSet.add(64);
        integerTreeSet.add(9);
        integerTreeSet.add(53);

        for (Integer i : integerTreeSet){
            System.out.println(i);
        }
    }
}
