package com.zzkjzy.javase.grade.self.week1.day18;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Map集合的遍历
 *      分别采用了两种方式进行遍历
 *      1、通过获取keySet，并遍历key来获取value。// 耦合性较高？
 *      2、调用entrySet()方法，直接获取key、value。这种方式效率较高，适合大数据量。
 */
public class MapTest {
    public static void main(String[] args) {

        // 创建map集合
        Map<Integer,String> map = new HashMap<>();
        // 添加元素
        map.put(1,"zhangsan");
        map.put(2,"lisi");
        map.put(3,"wangwu");
        // 遍历集合：
        // 第一种方式：遍历key获取value
        Set<Integer> keys = map.keySet();
        for (Integer key : keys){
            String value = map.get(key);
            System.out.println(key + "=" + value);
        }
        // 第二种方式：调用entrySet()方法
        Set<Map.Entry<Integer,String>> entrySet = map.entrySet();
        for (Map.Entry<Integer,String> m : entrySet){

            Integer key = m.getKey();
            String value = m.getValue();
            System.out.println(key + "=" + value);
        }
    }
}
