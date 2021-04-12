package com.zzkjzy.javase.teach.class5;

import java.util.Scanner;

/**
 * 课本p50，【案例2-3】
 *  目的：购买商品，计算总花销，并询问是否继续购买
 *
 *  本代码需要修改的地方：
 *      直接调用了对象的属性，需要修改为set方法
 *      但因相关代码改动较多，故保留。
 *
 * @author yunzheng.li
 * @date 2021/3/23
 */
public class Supermarket {
    public static void main(String[] args) {
        // 创建对象
        YaShua y = new YaShua();
        MaoJin m = new MaoJin();
        Cup c = new Cup();
        Scanner scanner = new Scanner(System.in);

        // 开始
        // a控制循环
        int a = 1;
        System.out.print("是否需要购买商品？");
        String buyNext = scanner.next();
        if (buyNext.equals("Y")) {
            while (a == 1) {
                // 输入商品编号
                System.out.print("请输入您要购买的商品编号");
                int id = scanner.nextInt();
                // 换行
                System.out.println();
                // 输入购买的数量
                System.out.print("请输入您需要购买的数量：");
                int num = scanner.nextInt();
                switch (id){
                    case 1:
                        System.out.println("您购买了"+num+"个"+ y.name);
                        y.count += num;
                        break;
                    case 2:
                        System.out.println("您购买了"+num+"个"+ m.name);
                        m.count += num;
                        break;
                    case 3:
                        System.out.println("您购买了"+num+"个"+ c.name);
                        c.count += num;
                        break;
                    default:
                        System.out.println("该商品不存在！");
                }
                System.out.println("您是否要继续购买？");
                String buyNext2 = scanner.next();
                if (buyNext2.equals("N")){
                    a = 0;
                }
            }
            System.out.println("您购买了" + y.count + "个" + y.name);
            System.out.println("您购买了" + m.count + "个" + m.name);
            System.out.println("您购买了" + c.count + "个" + c.name);
            System.out.println("您的总花费为：" + (y.count*y.price + m.count*m.price + c.count*c.price) + "元");
        }
        else if (buyNext.equals("N")){
            System.out.println("期待您下次光临");
        }
    }
}
