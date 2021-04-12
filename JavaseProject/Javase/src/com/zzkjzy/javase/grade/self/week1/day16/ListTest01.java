package com.zzkjzy.javase.grade.self.week1.day16;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * List中的特有方法：
 *  只列出常用方法：
 *
 *  void add(int index, Object element)
 *  Object get(int index)
 *  int indexOf(Object o)
 *  int lastIndexOf(Object o)
 *  Object remove(int index)
 *  Object set(int index, Object element)
 *
 */
public class ListTest01 {
    public static void main(String[] args) {

        // 创建集合对象
        List myList = new ArrayList();

        // 添加元素
        myList.add("no");
        myList.add("man's");
        myList.add("hello");
        myList.add("world");

        // 向指定下标添加元素
        // 不建议使用，效率较低
        myList.add(2,"sky");

        // 获取迭代器
        Iterator i = myList.iterator();

        while (i.hasNext()){
            System.out.println(i.next());
        }

        // 根据下标获取元素
        // 因为有下标，因此可以通过下标遍历List元素
        System.out.println(myList.get(0));

        // 获取指定元素第一次出现的索引
        System.out.println(myList.indexOf("sky"));
        // 获取指定元素最后一次出现的索引
        System.out.println(myList.lastIndexOf("hello"));

        System.out.println("*****************************************");

        // 删除指定下标位置的元素
        System.out.println(myList.size());
        myList.remove(myList.size()-1);
        System.out.println(myList.size());

        // 修改指定位置的元素
        myList.set(0,"have");

        // 通过下标遍历List
        for (int j = 0; j < myList.size(); j++) {
            System.out.println(myList.get(j));
        }
    }
}
