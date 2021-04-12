package com.zzkjzy.javase.grade.self.week1.day16;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 关于集合遍历/迭代专题
 */
public class CollectionTest02 {
    public static void main(String[] args) {

        Collection c = new ArrayList();

        // 添加元素
        c.add(123);
        c.add("hello");
        c.add("world");
        c.add(true);

        // 对集合进行迭代
        // 获取迭代器对象Iterator
        Iterator a = c.iterator();
        // 使用迭代器进行遍历
        /*
        以下两个方法都是迭代器中的方法
        boolean hasNext()       判断是否仍有元素可以迭代
        Object next()           返回迭代下一个元素
        */
        // 重复操作使用循环
        // 单一条件判断使用while
        while (a.hasNext()){
            System.out.println(a.next());
        }
    }
}
