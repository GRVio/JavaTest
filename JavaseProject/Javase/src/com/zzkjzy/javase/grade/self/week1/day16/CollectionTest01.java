package com.zzkjzy.javase.grade.self.week1.day16;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Collection中的常用方法：
 *      1、Collection中可以存放什么元素？
 *          没有使用“泛型”之前，Collection中可以储存Object类的所有子类型
 *          使用了“泛型”之后，Collection中只能储存某个具体类型
 *
 *      2、Collection中的常用方法：
 *          boolean add(Object e)       想集合中添加元素
 *          int size()                  获取集合中元素的个数
 *          void clear()                清空集合
 *          boolean contains(Object o)  判断某个元素是否在集合当中
 *          boolean remove(Object o)    删除集合中的某个元素
 *          boolean isEmpty()           判断集合中元素个数是否为0
 *          Object[] toArray()          将集合转化为Object数组  作为了解，使用不多
 *
 */
public class CollectionTest01 {
    public static void main(String[] args) {

        // 创建一个集合对象？
        // Collection c = new Collection();// 接口不能new对象

        // 多态
        Collection c = new ArrayList();
        // 测试Collection接口中的方法
        // add方法只能传入一个Object
        c.add(100);// 自动装箱，实际上是 Integer x = new Integer(100);
        c.add(3.14);// 自动装箱
        c.add(true);// 自动装箱
        c.add(new Object());

        // size() 方法
        System.out.println("集合中元素的个数为：" + c.size());

        // clear()方法
        c.clear();
        System.out.println("集合中元素的个数为：" + c.size());

        // 添加元素
        c.add("hello");
        c.add("world");
        c.add("no man's sky");

        // contains()方法
        System.out.println(c.contains("hello"));// true
        System.out.println(c.contains("fuck"));// false
        System.out.println(c.size());// 3

        // remove()方法
        c.remove("no man's sky");
        System.out.println(c.size());// 2

        // isEmpty()方法
        System.out.println(c.isEmpty());// false

        // 转换为数组
        Object[] a = c.toArray();
        // 遍历
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

    }
}
