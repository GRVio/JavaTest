package gradeone.javase.self;

/**
 * 多态在实际开发中的作用   -以主人喂养宠物为例
 *      1、分析：主人喂养宠物这个场景实现需要进行类型的抽象
 *          - 主人【类】
 *          - 主人可以喂养宠物，所以主人有喂养这个动作
 *          - 宠物【类】
 *          - 宠物可以吃东西，所以宠物有吃东西这个动作
 *
 *      2、面向对象编程的核心：定义好类，然后将类实例化为对象，给一个环境驱使一下，让各个对象之间协作起来形成一个系统
 *
 *      3、多态的作用是什么？
 */
public class Test {

    public static void main(String[] args) {
        // 创建主人对象
        Master zhangSan = new Master();
        // 创建猫对象
        Cat tom = new Cat();
        // 主人喂养猫
        zhangSan.feed(tom);
        // zhangSan.feed(new Cat());
        // 创建狗对象
        Dog erHa = new Dog();
        // 主人喂养狗
        zhangSan.feed(erHa);
        // zhangSan.feed(new Dog());
    }
}
