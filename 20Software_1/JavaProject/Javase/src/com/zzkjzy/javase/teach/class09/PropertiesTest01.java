package com.zzkjzy.javase.teach.class09;

import java.util.Map;
import java.util.Properties;

/**
 * Properties集合：
 *      只需要掌握Properties的相关方法即可
 *      Properties是一个Map集合，集成HashTable
 *      Properties的key和value都为String类型。
 *      Properties被称为属性类对象。
 * 常用方法：
 *      setProperty(String key,String value)
 *      getProperty(String key)
 *
 */
public class PropertiesTest01 {
    public static void main(String[] args) {
        // 它只能储存String，因此不需要定义泛型。
        Properties properties = new Properties();
    }
}
