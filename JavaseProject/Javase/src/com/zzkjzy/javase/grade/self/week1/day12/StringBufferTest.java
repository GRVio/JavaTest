package com.zzkjzy.javase.grade.self.week1.day12;

/**
 * 重点：
 *  如何优化StringBuffer的性能？
 *      在创建StringBuffer的时候定一个初始化容量
 *      减少底层的扩容次数。提高效率。
 */
public class StringBufferTest {
    public static void main(String[] args) {

        // 创建一个初始容量为16的byte数组   字符串缓冲区对象
        StringBuffer stringBuffer = new StringBuffer();

        // 调用方法进行字符串拼接
        stringBuffer.append("qwe");
        stringBuffer.append(123);
        stringBuffer.append("asd");
        stringBuffer.append(true);
        System.out.println(stringBuffer);
    }
}
