package com.zzkjzy.javase.grade.self.week1.day18;

import java.util.HashSet;
import java.util.Set;

/**
 * HashSet集合:
 *      无序不可重复
 *      无序：
 */
public class HashSetTest01 {
    public static void main(String[] args) {

        // 创建一个HashSet集合
        Set<String> s = new HashSet<>();

        // 添加元素
        s.add("Demo5");
        s.add("Demo4");
        s.add("Demo3");
        s.add("Demo2");
        s.add("Demo1");
        s.add("Demo1");
        s.add("Demo1");

        // 遍历
        for (String s1 : s){
            System.out.println(s1);
        }
    }
}
