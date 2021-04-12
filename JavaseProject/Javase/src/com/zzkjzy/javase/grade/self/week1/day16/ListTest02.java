package com.zzkjzy.javase.grade.self.week1.day16;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

/**
 * ArrayList集合的初始化容量和扩容
 *      1、默认初始化容量为10（底层创建了一个长度为0的数组，在添加第一个元素的时候，初始化容量为10）
 *      2、底层集合是一个Object[]数组。
 *      3、构造方法：
 *          new ArrayList();
 *          new ArrayList(20);
 *      4、ArrayList集合的扩容：
 *          原容量的1.5倍。
 *          ArrayList集合底层是数组，怎么优化？
 *              优化过程同数组一样：减少扩容次数，预估计容量。
 */
public class ListTest02 {
    public static void main(String[] args) {

        // 创建默认长度的集合对象
        // size返回的是集合中的元素数量
        List list1 = new ArrayList();
        System.out.println(list1.size());// 0

        List list2 = new ArrayList(20);
        System.out.println(list2.size());// 0

        System.out.println("**********************************");
        
        // 创建一个集合对象
        Collection c = new HashSet();
        c.add(123);
        c.add(485);
        c.add(1);
        c.add(54);
        c.add(3644);

        // 使用构造方法将其转换为ArrayList集合
        List list = new ArrayList(c);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
