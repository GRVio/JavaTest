//package com.zzkjzy.javase.grade.self.week1.day20.homework02;
//
//import java.io.*;
//import java.util.ArrayList;
//import java.util.Scanner;
//
///**
// * 作业：目录拷贝。
// * 提示：
// *      1、需要用到File、FileInputStream、FileOutputStream
// *      2、可能需要用到
// */
//public class DirCopy {
//    // 需要拷贝的文件夹
//    static String startDir;
//    static String endDir;
//
//    // 拷贝方法
//    public static void copy(){
//        while (true) {
//            // 输入需要拷贝的路径
//            System.out.print("请输入需要拷贝的路径：");
//            Scanner scanner = new Scanner(System.in);
//            startDir = scanner.next();
//            // 创建对应路径的file
//            File startFile = new File(startDir);
//            // 如果文件夹不存在，直接退出
//            if (!startFile.exists()) {
//                System.out.println("目录错误或该文件夹不存在！");
//                break;
//            } else {
//                // 输入需要拷贝到的路径
//                System.out.println("请输入需要拷贝到的路径：");
//                Scanner scanner1 = new Scanner(System.in);
//                // 创建对应流
//                endDir = scanner1.next();
//                File endFile = new File(endDir);
//
//                // 开始复制
//                // 创建目的文件夹
//                if (!endFile.exists()){
//                    endFile.mkdir();
//                }
//
//                // 创建拷贝需要的数组、流
//                byte[] bytes = new byte[1024 * 1024 *5]; // 5MB
//                FileInputStream startStream = null;
//                FileOutputStream endStream = null;
//                // 遍历出所有的file文件
//                for (File file : getFile(startFile)){
//                    //try {
//                    //    startStream = new FileInputStream(file);
//                    //} catch (FileNotFoundException e) {
//                    //    e.printStackTrace();
//                    //} finally {
//                    //    if (startStream != null) {
//                    //        try {
//                    //
//                    //            // 关闭流
//                    //            startStream.close();
//                    //        } catch (IOException e) {
//                    //            e.printStackTrace();
//                    //        }
//                    //    }
//                    //}
//                    try {
//                        file.createNewFile();
//
//                    } catch (IOException e) {
//                        e.printStackTrace();
//                    }
//                }
//                break;
//            }
//        }
//    }
//
//    /**
//     * 获取file中所有的文件
//     * @param startFile 需要复制的起始file
//     * @return          返回一个file集合
//     */
//    public static ArrayList<File> getFile(File startFile){
//        File[] files = startFile.listFiles();
//        ArrayList<File> fileArrayList = new ArrayList<>();
//
//        for (File f : files){
//            if (f.isFile()){
//                fileArrayList.add(f);
//            }else if (f.isDirectory()){
//                getFile(f);
//            }
//        }
//        return fileArrayList;
//    }
//}
