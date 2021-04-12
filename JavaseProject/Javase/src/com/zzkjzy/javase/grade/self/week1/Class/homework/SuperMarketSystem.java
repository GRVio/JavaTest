package com.zzkjzy.javase.grade.self.week1.Class.homework;

import java.util.Scanner;

/**
 * 商品入库作业：
 *      输入两种手机的库存；
 *      输出手机参数、库存总量及总金额
 *
 *      1、调用了Scanner方法
 *      2、写了两种手机的类并赋了初始值，可以通过调用有参构造赋值
 *      3、编写了计算库存中某种手机总价值的方法
 */
public class SuperMarketSystem {

    public static void main(String[] args) {

        // 小米手机
        XiaoMiPhone m = new XiaoMiPhone();
        System.out.println("品牌型号" + m.name);
        System.out.println("尺寸" + m.size);
        System.out.println("价格" + m.price);
        System.out.println("配置" + m.configuration);
        System.out.print("请输入小米手机的库存：");
        Scanner scannerM = new Scanner(System.in);
        int numM = scannerM.nextInt();
        double sumPrinceM = sumPrice(numM,m.price);
        System.out.println("库存中小米手机的总金额为：" + sumPrice(numM,m.price));

        System.out.println("=============================================================");

        // 华为手机
        HuaWeiPhone h = new HuaWeiPhone();
        System.out.println("品牌型号" + h.name);
        System.out.println("尺寸" + h.size);
        System.out.println("价格" + h.price);
        System.out.println("配置" + h.configuration);
        System.out.print("请输入华为手机的库存：");
        Scanner scannerH = new Scanner(System.in);
        int numH = scannerH.nextInt();
        double sumPrinceH = sumPrice(numH,h.price);
        System.out.println("库存中华为手机的总金额为：" + sumPrinceH);

        // 库存清单
        // 表头
        System.out.println("===========================库存清单===========================");
        System.out.println("品牌型号       尺寸       价格       配置       库存数量       总价");

        // 小米手机
        System.out.println(m.name+"         "+m.size+"      "+m.price
                +"     "+m.configuration+"       "+numM+"       "+numM+sumPrinceM);
        // 华为手机
        System.out.println(h.name+"   "+h.size+"     "+h.price
                +"     "+h.configuration+"       "+numH+"       "+numH+sumPrinceH);

        System.out.println("=============================================================");
        System.out.println("总库存：" + (numH+numM));
        System.out.println("库存总价：" + (sumPrinceH+sumPrinceM));

    }

    /**
     * 计算库存中某种手机总价值
     * @param num       手机库存数
     * @param price     手机单价
     * @return          库存中的手机总价值
     */
    public static double sumPrice(int num, double price) {
        return num * price;
    }
}
