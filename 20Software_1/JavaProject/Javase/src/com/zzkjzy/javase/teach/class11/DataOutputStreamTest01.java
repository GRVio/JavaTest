package com.zzkjzy.javase.teach.class11;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 数据流
 * 写入时会保存数据格式
 * 不是普通文本文件（记事本打不开，会乱码）
 */
public class DataOutputStreamTest01 {
    public static void main(String[] args) {
        DataOutputStream outPut = null;
        try {
            // 创建数据流
            outPut = new DataOutputStream(new FileOutputStream("data"));
            // 写入
            int a = 100;
            outPut.writeInt(a);
            // 记得刷新
            outPut.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (outPut != null) {
                try {
                    outPut.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
