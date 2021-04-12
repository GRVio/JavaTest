package com.zzkjzy.javase.teach.class11;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * IO流
 */
public class Demo {
    public static void main(String[] args) {

        FileOutputStream fos  = null;
        try {
            fos = new FileOutputStream("temp");
            fos.write('a');
            // 刷新
            fos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
