package com.zzkjzy.javase.teach.class12;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 数据输出流
 *  读取时，要按照写入的顺序去读，不然数值会改变
 */
public class DataInputStreamTest01 {
    public static void main(String[] args) {

        DataInputStream dis = null;
        try {
            dis = new DataInputStream(new FileInputStream("data"));

            int readInt = dis.readInt();
            System.out.println(readInt);

            byte readByte = dis.readByte();
            System.out.println(readByte);

            long readLong = dis.readLong();
            System.out.println(readLong);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (dis != null) {
                try {
                    dis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
