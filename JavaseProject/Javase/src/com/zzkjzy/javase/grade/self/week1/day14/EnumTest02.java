package com.zzkjzy.javase.grade.self.week1.day14;

/**
 * 使用枚举来优化代码：
 *  此处返回值只有两个，还是使用boolean类型的返回值最好
 *  但返回值为两个以上时，建议使用枚举
 */
public class EnumTest02 {
    public static void main(String[] args) {

        System.out.println(divide(10,2));
    }

    public static Result divide(int a,int b){
        try {
            int c = a /b;
            return Result.SUCCESS;
        }catch (Exception e){
            return Result.FAIL;
        }
    }
}

enum Result{
    SUCCESS,FAIL
}
