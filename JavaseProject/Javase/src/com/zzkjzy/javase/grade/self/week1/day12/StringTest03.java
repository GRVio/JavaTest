package com.zzkjzy.javase.grade.self.week1.day12;


/**
 * String类当中的方法:
 *
 */
public class StringTest03 {
    public static void main(String[] args) {

        // String.charAt(int index)     掌握
        // 返回字符串中的某个字符
        String s1 = "你好";
        char result = s1.charAt(1);
        System.out.println(s1.charAt(0));
        System.out.println("======================================");

        // String.compareTo(String)     了解
        // 比较两个字符串中第一个不同的字符在字典中的位置
        // 用前面的位置-后面的位置，返回差值，若相同则返回0
        String s2 = "这是一个字符串";
        String s3 = "这是一个字符串";
        int a = s2.compareTo(s3);
        System.out.println(s2.compareTo(s3));       // 前后一致 = 0
        System.out.println(s2.compareTo(s1));       // 前大后小 = 正数
        System.out.println(s1.compareTo(s2));       // 前小后大 = 负数
        System.out.println("======================================");

        // String.contains(String)      掌握
        // 判断前字符串是否包含后字符串
        String s4 = "Hello World!";
        String s5 = "World";
        boolean bool = s4.contains(s5);
        System.out.println(s4.contains(s5));
        System.out.println("======================================");

        // String.endsWith(String)       掌握
        // 判断当前字符串是否以某个字符串结尾
        String s6 = "begin,mid,end";
        String s7 = "end";
        boolean bool2 = s6.endsWith(s7);
        System.out.println(s6.endsWith(s7));
        System.out.println("======================================");

        // String.equalsIgnoreCase(String)  掌握
        // 比较两个字符串是否相等，且忽略大小写
        boolean bool3 = "ABC".equalsIgnoreCase("abc");
        System.out.println("ABC".equalsIgnoreCase("abc"));
        System.out.println("======================================");

        // String.getBytes()    掌握
        // 将字符串转化为byte数组
        byte[] bytes = "asdwqe".getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.print(bytes[i] + "  ");
        }
        System.out.println();
        System.out.println("======================================");

        // String.indexOf(String)   掌握
        // 判断子字符串第一次出现在当前字符串中的下标
        int a1 = "qwe".indexOf("we");
        System.out.println("fqeadasdfqwrf13rqeadsaASSasd".indexOf("asd"));
        System.out.println("======================================");

        // Boolean  isEmpty  掌握
        // 判断字符串是否为空，空不是null，而是空字符串
        System.out.println("".isEmpty());
        System.out.println("======================================");


        // int  lastIndexOf 掌握
        // 返回子字符串最后一次出现在该字符串中的索引
        System.out.println("qweasdzxcqwe".lastIndexOf("qwe"));
        System.out.println("======================================");

        // length()
        // 返回字符串长度

            // replace(CharSequence target, CharSequence replacement)   掌握
        // 返回新字符串，并使用新字符串替换掉旧字符串
        // charSequence:    String的父类型接口
        System.out.println("123qwe456asd".replace("456","789"));
        System.out.println("======================================");

        // spilt
        // 返回字符串数组，拆分字符串
        String[] s = "5612-564132-2165".split("-");
        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i] + "  ");
        }
        System.out.println();
        System.out.println("======================================");

        // startsWith(String)
        // 返回值为Boolean，判断字符串是否以某个字符串开始
        System.out.println("qwe2156das".startsWith("qwe"));
        System.out.println("======================================");

        // substring(begin index)
        // 返回值为字符串，参数为起始下标，截取以起始下标为开头的字符串
        System.out.println("qwertyuiop".substring(4));
        System.out.println("======================================");

        // substring(begin index,end index)
        // 同上，但多了一个结束下标，不再举例
        // 注意，包含开始下标，但不包含结束下标

        // toCharArray()
        // 返回值为Char数组，将字符串转换为char数组
        char[] chars = "这是一个字符串".toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i] + "  ");
        }
        System.out.println();
        System.out.println("======================================");

        // toLowerCase()
        // 将字符串转换成小写
        System.out.println("FUYSADugFdauUGFYU".toLowerCase());
        System.out.println("======================================");

        // toUpperCase()
        // 全部转为大写
        System.out.println("dasdAAaDWA".toUpperCase());
        System.out.println("======================================");

        // trim
        // 去除字符串前后空白
        System.out.println("   hello world!    ".trim());
        System.out.println("======================================");

        // String中只有一个方法是静态的（Static）
        // 这个方法是valueOf
        // 作用是将“非字符串”转换成“字符串”
        String s8 = String.valueOf(true);
        System.out.println(s8);
        System.out.println("======================================");
        // 为什么在输出引用的时候回调用toString()方法？
        // 因为所有的输出都是转化成字符串输出，并调用valueOf()方法，而valueOf()方法在底层又调用toString()方法。
        // 本质上System.out.println这个方法，在输出任何数据的时候都是先转换成字符串再输出

        
    }
}

