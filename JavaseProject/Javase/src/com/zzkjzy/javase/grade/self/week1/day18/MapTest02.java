package com.zzkjzy.javase.grade.self.week1.day18;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Map集合的遍历
 */
public class MapTest02 {
    public static void main(String[] args) {

        // 获取所有的key，通过遍历key来获取value
        Map<Integer,String> map = new HashMap<>();
        // 添加元素
        map.put(1,"zhangSan");
        map.put(2,"liSi");
        map.put(3,"wangWu");
        // 遍历Map集合
        // 先获取所有的key，所有的key是一个set集合
        //Set<Integer> keys = map.keySet();
        //// 遍历key，通过key获取value
        //Iterator<Integer> iterator = keys.iterator();
        //while (iterator.hasNext()){
        //    Integer key = iterator.next();
        //    String value = map.get(key);
        ////    System.out.println(key + "="+  value);
        //}
        //
        //// 使用foreach进行遍历
        //for (Integer key : keys){
        //    System.out.println(key + "=" + map.get(key));
        //}

        // 第二种方法：Set<Map.Entry<K,V>> entrySet()
        // 将Map集合直接全部转换为Set集合
        // Set集合中的类型为Map.Entry
        Set<Map.Entry<Integer,String>> set = map.entrySet();
        //// 获取迭代器
        //Iterator<Map.Entry<Integer,String>> it = set.iterator();
        //while (it.hasNext()){
        //    Map.Entry<Integer,String> node = it.next();
        //    Integer key = node.getKey();
        //    String value = node.getValue();
        //    System.out.println(key + "=" + value);
        //}

        // 使用foreach进行遍历
        for (Map.Entry<Integer,String> node : set){
            //System.out.println(node);// 这样也可以出结果，但取出的为Map.Entry类型
            Integer key = node.getKey();
            String value = node.getValue();
            System.out.println(key + "=" + value);
        }
    }
}
