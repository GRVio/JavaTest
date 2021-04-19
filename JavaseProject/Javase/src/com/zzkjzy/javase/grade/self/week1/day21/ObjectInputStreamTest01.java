package com.zzkjzy.javase.grade.self.week1.day21;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 * 反序列化
 */
public class ObjectInputStreamTest01 {
    public static void main(String[] args) throws Exception {

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person"));
        // 返回值为一个Object
        Object obj = ois.readObject();
        System.out.println(obj);
        // 记得关闭流。
        ois.close();
    }
}
