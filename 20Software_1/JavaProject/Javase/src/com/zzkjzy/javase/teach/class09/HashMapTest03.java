package com.zzkjzy.javase.teach.class09;

import java.util.HashMap;
import java.util.Map;

/**
 * HashMap集合中可以是key部分为null吗
 *      可以，但HashMap的key只能有一个，null值重复会覆盖。
 */
public class HashMapTest03 {
    public static void main(String[] args) {

        Map map = new HashMap();

        // HashMap集合允许key为null
        map.put(null,null);
        System.out.println(map.size());

        // key重复时value会覆盖，null也一样。
        map.put(null,100);
        System.out.println(map.size());

        // 通过key获取value
        System.out.println(map.get(null));
    }
}
