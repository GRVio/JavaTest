package com.zzkjzy.javase.grade.self.week1.day2;

/**
 * 求100以内的质数和
 *      使用for循环和if语句找出100以内的全部质数
 *      第二个if语句将结果加起来并输出
 * 关于优化：
 *      考虑怎么只输出一个最终结果而不是将每个结果都输出
 */
public class day2 {

    public static void main(String[] args){

        int Result = 0;

        for(int a = 2; a <= 100; a++){

            // 设一个布尔变量；每次循环被重新定义为true
            boolean x = true;

            // 设除数，恒小于a
            for(int b = 2; b < a; b++){

                if(a % b == 0){
                    x = false;
                    break;
                }
            }

            if(x){

                Result = Result + a;
                System.out.println(Result);
                System.out.println("    ");

            }
        }
    }
}
