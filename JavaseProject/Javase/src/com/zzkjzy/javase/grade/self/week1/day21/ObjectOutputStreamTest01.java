package com.zzkjzy.javase.grade.self.week1.day21;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 * 序列化和反序列化
 */
public class ObjectOutputStreamTest01 {
    public static void main(String[] args) throws Exception{

        // 创建对象
        People p = new People("Jack",18);
        // 创建ObjectOutputStream流，构造方法传入一个OutputStream
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person"));
        // 出现异常：java.io.NotSerializableException
        // People类没有实现Serializable接口
        oos.writeObject(p);
        // 刷新
        oos.flush();
        // 关闭
        oos.close();
    }
}
