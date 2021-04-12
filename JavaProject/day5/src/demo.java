public class demo {
    public static void main(String[] args) {
        //if语句及else、else if的运用，如下：
        int x = 62;
        //以成绩为例
        //考虑到数值会大于100的情况，先写出Error
        if (x > 100) {
            System.out.println("ERROR");
        } else if (x == 100) {
            System.out.println("NB");
        } else if (x >= 90) {
            System.out.println("好孩子");
        } else if (x > 60) {
            System.out.println("及格万岁");
        } else if (x == 60) {
            System.out.println("多一分浪费");
        } else {
            System.out.println("艹");
        }
        //for循环   有点阴间，先用注释解释一下结构
        /*
         * for(a;b;c){
         * d}
         * a=初始化命令,无论如何都将执行
         * b=循环条件
         * c=操作表达式//别记
         * d=循环体//别记
         * 顺序-a-b(条件满足)-d-c
         * 首先执行a命令
         * 然后执行b命令
         * 若结果为true,则执行d,若为false,则直接结束循环
         * 执行d后，执行c
         * 循环执行b
         * */
        int b = 4;
        for (int a = 0; a <= 200; a++) {
            b += a;
        }
        System.out.println(b);
    }
}
//2020/11/22
