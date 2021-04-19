package com.zzkjzy.javase.teach.class12;

import java.io.FileInputStream;
import java.util.Properties;

/**
 * IO + Properties的联合应用。
 * 用到了一个非常好设计理念：
 *      经常改变的数据，放在文件里，用Java程序去动态的读取这个数据。
 *      以后数据的内容发生改变，也不需要重新编译Java文件/重启服务器
 *      就可以拿到改变之后的数据。
 *
 *      类似于以上机制的文件被称为配置文件。
 *      并且当配置文件中的内容格式为：
 *      key1=value1
 *      key2=value2
 *      时，这个文件被称为属性配置文件。
 *      在Java中属性配置文件建议以.properties为结尾（文件后缀名）
 *      其中Properties是专门为储存属性配置文件的一个类。
 */
public class IoPropertiesTest01 {
    public static void main(String[] args) throws Exception{

        // 使用IO流将硬盘中的文件读取到Properties集合当中
        // Properties集合：key和value都是String

        // 创建一个输入流
        FileInputStream fis = new FileInputStream("Javase/src/com/zzkyzy/javase/teach/class12/userinfo.properties");

        // 创建Properties集合
        Properties p = new Properties();

        // 输入到集合中
        // 直接调用load方法，传入一个流
        // 会自动将流中的文件传入到这个集合当中
        // 等号左边为key，等号右边为value
        p.load(fis);

        // 输出
        String uid = p.getProperty("uid");
        System.out.println(uid);
        String password = p.getProperty("password");
        System.out.println(password);

        // 关闭流
        fis.close();
    }
}
