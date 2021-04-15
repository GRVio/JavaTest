package com.zzkjzy.javase.grade.self.week1.day20;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * File的方法测试
 */
public class FileTest {
    public static void main(String[] args) throws IOException {

        File file = new File("D:/JavaseProject/Javase/file");

        // 判断File是否存在
        boolean b = file.exists();
        System.out.println(b);
        // 当file不存在时，创建一个file文件
        file.createNewFile();
        // 当file不存在时，创建一个file目录
        file.mkdir();
        // 当file不存在时，创建一个多重file目录
        File fileT = new File("D:/JavaseProject/file/a/b/c/d/e/f/g");
        fileT.mkdirs();
        // 获取文件的父路径  String
        System.out.println(file.getParent());
        // 获取文件的父路径  File
        System.out.println(file.getParentFile());
        // 获取绝对路径 String
        System.out.println(file.getAbsolutePath());
        // 获取文件名
        System.out.println(fileT.getName());
        // 判断是否为一个目录
        System.out.println(file.isDirectory());
        // 判断是否为一个文件
        System.out.println(file.isFile());
        // 获取最后一次修改时间，返回值为1970至今的毫秒数
        Date date = new Date(file.lastModified());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        String time = sdf.format(date);
        System.out.println(time);
        // 获取文件大小(字节数)
        System.out.println(file.length());
        // 获取当前目录下的所有子文件
        File[] files = fileT.listFiles();
        for (File file1 : files){
            System.out.println(file1.getName());
        }
    }
}
