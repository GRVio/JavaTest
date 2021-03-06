package gradeonr.javase.self;

/**
 *关于java语言当中的继承:
 *      1、继承是面向对象三大特征之一,三大特征分别是:封装、继承、多态
 *      2、继承基本"的作用是:代码复用。但是继承最“重要”的作用是:有了继承才有了以后"方法的覆盖"”和“多态机制”。
 *      3、继承语法格式:
 *          [修饰符列表] class 类名extends父类名(){
 *              类体=属性+方法
 *          }
 *       4、java语言当中的继承只支持单继承，一个类不能同时继承很多类，只能继承-个类。在C+ +中支持多继承。
 *      5、关于继承中的一些术语:
 *          B类继承A类，其中:
 *              A类称为:父类、基类、超类、superclass
 *              B类称为:子类、派生类、subclass
 *      6、在java语言当中子类继承父类都继承哪些数据呢?
 *          -私有的不支持继承
 *          -构造方法不支持继承
 *          其它数据都可以被继承
 *      7、虽然java语言当中只支持单继承，但是一个类也可以间接继承其它类，例如:
 *               C extends B {
 *               }
 *               B extends A{
 *               }
 *               A extends T{
 *               }
 *         c直接继承B类，但是C类间接继承T A类。
 */
public class ExtendsTest {

    public static void main(String[] args) {

        CreditAccount act = new CreditAccount();
        // 卡号
        act.setActNo(001);
        // 余额
        act.setBalance(-114514.0);
        // 信用度
        act.setCredit(100);

        System.out.println(act.getActNo() + "," + act.getBalance() + "," + act.getCredit());
    }
}
