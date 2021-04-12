package com.zzkjzy.javase.grade.self.week1.day2;

/**
 * 通过以下代码得出的结论：
 *      super 不是引用。super也不保存地址，super也不指向任何对象。
 *      super 只是代表当前对象内部的那一块父类型特征。
 */

public class superTest05 {

    public static void main(String[] args){
        superTest05 st = new superTest05();
        st.doSome();//superTest05@4554617c
        // this 和 super不能使用在静态方法里。
        // System.out.println(this)
    }
    public void doSome(){

        // System.out.println(super);
        System.out.println(this);
    }
}
