package com.zzkjzy.javase.grade.self.week1.day18;

import java.util.Hashtable;
import java.util.Map;

/**
 * HashTable集合的key可以为null吗
 *      不行，key和value都不能为null
 *      HashMap可以
 * HashTable集合都带有synchronized：线程安全的
 * 线程安全有其他的方案，这个HashTable对线程安全的处理导致效率较低，因此使用较少
 *
 * HashTable底部也是一个哈希表数据结构
 * 初始化容量为11，默认加载因子为0.75f
 * 扩容：原容量2倍+1
 */
public class HashTableTest {
    public static void main(String[] args) {

        Map map = new Hashtable();

        // HashTable的key和value都不能为null
//        map.put(null,100);
        map.put(100,null);
        System.out.println(map.size());
    }
}
