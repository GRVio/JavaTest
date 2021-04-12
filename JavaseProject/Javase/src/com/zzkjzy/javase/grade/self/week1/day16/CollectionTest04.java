package com.zzkjzy.javase.grade.self.week1.day16;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 深入Collection集合的contains方法
 *      contains：判断集合中是否包含某个对象o
 */
public class CollectionTest04 {
    public static void main(String[] args) {

        Collection c = new ArrayList();

        // 向集合中存储元素
        String a1 = new String("sad");
        c.add(a1);

        String a2 = new String("qwe");
        c.add(a2);

        System.out.println(c.size());// 2

        // 两者内存地址并不相同，且s没有存入进ArrayList集合中，但结果却为true
        // 因为底层调用了equals方法
        String s = new String("sad");
        System.out.println(c.contains(s));// true

    }
}
