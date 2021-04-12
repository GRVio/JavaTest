package com.zzkjzy.javase.grade.self.week1.day19;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * java.io.FileInputStream
 *      1、字节输入流。万能的，任何类型的文件都可以使用这个流来读取
 *      2、以字节的方式来完成输入的动作（从硬盘向内存中输入）
 */
public class FileInputStreamTest01 {
    public static void main(String[] args) {

        // 关闭流在finally语句块中关闭，由于作用域的原因，要将fis放在try外面。
        FileInputStream fis = null;
        // 这个类抛出了异常，需要解决
        try {
            // 这里使用了绝对路径，当然也可以使用相对路径。
            // 创建字节流输入对象
            // 文件路径：D:\JavaseProject\Javase\src\com\zzkjzy\javase\grade\self\week1\day19\temp
            // IDEA会自动将"\"转换成"\\"，因为一个斜杠代表转义功能
            //FileInputStream fis = new FileInputStream("D:\\JavaseProject\\Javase" +
            //        "\\src\\com\\zzkjzy\\javase\\grade\\self\\week1\\day19\\temp");
            // 使用以下格式来写路径也是可以的。而且这个斜杠使用的范围更广。
            // "\\"这种斜杠只能在Windows中使用，而"/"这个斜杠可以在win、Linux、macOS中使用
            fis = new FileInputStream("D:/JavaseProject/Javase" +
                    "/src/com/zzkjzy/javase/grade/self/week1/day19/temp");

            // Data：数据 Date：日期
            // 会抛出异常，在catch底下继续catch就行。
            // 返回的是ASCII码
            while (true){
                int readData = fis.read();
                System.out.println(readData);
                if (readData == -1){
                    break;
                }
            }

            // 对不同的异常分别处理，“细粒化”，方便定位错误代码。
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 在finally语句中确保流一定关闭
            // 在流不为空的时候关闭，空的时候没必要关，同样也为了避免空指针异常。
            // 快捷键ifn+回车
            if (fis != null) {
                // close也会抛出异常
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
