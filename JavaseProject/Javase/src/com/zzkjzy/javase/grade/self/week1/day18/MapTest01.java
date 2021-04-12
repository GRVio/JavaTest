package com.zzkjzy.javase.grade.self.week1.day18;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Map集合：
 *  Map接口中的方法：
 *      V put(K key, V value)               向Map集合中添加键值对
 *      V get(Object key)                   通过key获取value
 *      void clear()                        清空Map集合
 *      boolean containsKey(Object key)     判断Map中是否包含某个key
 *      boolean containsValue(Object value) 判断Map中是否包含某个value
 *      boolean isEmpty()                   判断Map集合中的元素是否为0
 *      Set<K> keySet()                     获取Map集合中所有的key（所有的键是一个Set集合）
 *      Collection<V> values()              获取Map集合中所有的value，返回一个Collection集合
 *      V remove(Object key)                通过key删除键值对
 *      int size()                          获取Map集合中键值对的个数
 *
 *      Set<Map.Entry<K,V>> entrySet()      将Map集合转换成Set集合
 *                                          这里使用了泛型,<Map.Entry>这是一个类型，一个静态内部类
 *                                          即，返回的set集合中元素的类型为Map.Entry
 */
public class MapTest01 {
    public static void main(String[] args) {

        // 创建一个以Integer为key，String为value的集合
        Map<Integer,String> map = new HashMap<>();

        // 添加元素
        map.put(1,"hello");
        map.put(5,"cat");
        map.put(3,"world!");

        // 通过key获取value
        String s1 = map.get(1);
        System.out.println(s1);

        // 获取键值对的数量
        System.out.println("键值对的数量" + map.size());

        // 通过key删除键值对
        map.remove(5);
        System.out.println("键值对的数量" + map.size());

        // 判断是否包含某个key
        // 判断是否包含某个value
        // contains方法底层调用的都是equals进行比对的，自定义类需要重写equals
        System.out.println(map.containsKey(1));// true
        System.out.println(map.containsValue("cat"));// false

        // 获取所有的value
        Collection<String> str = map.values();
        for (String s : str){
            System.out.println(s);
        }

        // 清空Map集合
        map.clear();
        System.out.println("键值对的数量" + map.size());

        // 判断是否为空
        System.out.println(map.isEmpty());


    }
}
