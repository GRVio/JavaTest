package com.zzkjzy.javase.grade.self.week1.day18;

/**
 * HashMap集合
 *      1、HashMap集合底层是哈希表/散列表的数据结构
 *      2、哈希表是一个怎样的数据结构呢？
 *          哈希表是数组和单项链表的结合体
 *          数据：在查询方面效率很高，随机增删方面效率很低
 *          单向链表：在查询方面效率很低，在随机增删方面效率很高
 *          哈希表将两者融合在一起，充分发挥各自的优点。
 *      3、HashMap底层实际上就是一个数组(一维数组)
 *          HashMap中有一个静态内部类：HashMap.Node<K,V>
 *          Node中有四个属性：
 *          final int hash;     // 哈希值(哈希值是key的hashCode()方法执行的结果。hash值可以通过哈希函数/算法，将内存地址转换为数组的下标)
 *          final K key;        // 储存到Map中的key
 *          V value;            // 储存到Map中的value
 *          Node<K,V> next;     // 下一个节点的内存地址
 *        哈希表/散列表：一维数组，这个数组中的每个元素是一个单向链表。是一个数组和链表的结合体。
 *      4、需要掌握的是
 *      map.put(K,V)
 *      v = map.get(K)
 *      以上两个方法的实现原理。
 */
public class HashMapTest01 {
    
}
