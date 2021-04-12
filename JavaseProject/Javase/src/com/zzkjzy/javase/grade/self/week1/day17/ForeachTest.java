package com.zzkjzy.javase.grade.self.week1.day17;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 增强for循环（foreach）
 */
public class ForeachTest {
    public static void main(String[] args) {
        
        // 创建一个数组
        int[] array = {12,84,45,68,64,21,35,69};
        // 使用普通for循环该数组
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        // 使用增强for循环该数组
        for (int i : array){
            System.out.println(i);
        }

        // 创建List集合
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world!");
        list.add("cat");

        // 使用迭代器进行遍历：
        Iterator<String> its = list.iterator();
        while (its.hasNext()){
            String s = its.next();
            System.out.println(s);
        }

        // 使用下标进行遍历：
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // 使用foreach进行遍历：
        // 因为泛型用的是String，因此这里为String s
        for (String s : list){
            System.out.println(s);
        }

    }
}
