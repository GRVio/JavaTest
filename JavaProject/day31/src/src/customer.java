package src;

/**
 * 关于java语言中的this关键字
 *      1、this是一个关键字
 *      2、this是一个引用，是一个变量，变量中保存了内存地址指向它本身
 *      3、每一个对象都有一个this
 *      4、this出现在”实例方法“当中，this指向正在执行这个动作的对象。
 *      5、this在多数情况下可以省略不写
 *  如何判断需不需要加static关键字
 *      例：顾客进行购物的行为
 *          购物是一个动作，这个动作不是凭空生成的，需要有对象参与
 *          有对象参与的行为，即为“对象级别的”行为
 *      重点：没有static的变量称为“实例变量”
 *      重点：没有static的方法称为“实例方法”
 *      所以，若一个 变量/方法 是“对象级别的” 即需要对象参与
 *      不要加static关键字
 *      实例变量必须采用“引用.”进行调用
 */
public class customer {

    //姓名【在堆内存中存储，必须先创建对象，用引用.进行调用】
    String name;

    //构造方法
    public customer(){

    }
    //购物
    public void shopping(){
        System.out.println(this.name + "在购物");
    }
}
