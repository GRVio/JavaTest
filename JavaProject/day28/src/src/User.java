package src;

/**
 * 关于java类中的构造方法:
 *      1.构造方法又被称为构造函数/构造器/Constructor
 *      2、构造方法语法结构:
 *          [修饰符列表]构造方法名(形式参数列表) {
 *              构造方法体;
 *          }
 *      3、回顾普通方法的语法结构:
 *          [修饰符列表]返回值类型方法名(形式参数列表) {
 *              方法体;
 *      4、对于构造方法来说，“返回值类型"不需要指定，并且也不能写void,
 *      只要写上void,那么这个方法就成为普通方法了。
 *      5、对于构造方法来说，构造方法的方法名必须和类名保持一致。
 *      6、构造方法的作用?
 *      构造方法存在的意义是，通过构造方法的调用，可以创建对象。
 *      7、构造方法应该怎么调用?
 *      普通方法是这样调用的:方法修饰符中有static的时候:类名.方法名(实参列表)、方法修饰符列表中没有static的时候:引用.方法名(实参列表)
 *      new构造方法名(实参列表)
 *      8、构造方法调用执行之后,有返回值吗?
 *      每一个构造方法实际上执行结束之后都有返回值,但是这个"return值;"这样的语句不需要写。构造方法结束的时候java程自动返回值。
 *      并且返回值类型是构造方法所在类的类型。由于构造方法的返回值类型就是类本身，所以返回值类型不需要编写。
 *      9、注释快捷键：Ctrl+/ 多行注释：Ctrl+Shift+/
 *      10、当一个类中没有定义任何构造方法的话,系统默认给该类提供一个无参数的构造方法,这个构造方法被称为缺省构造器。
 *      11、当一个类显示的将构造方法定义出来了,那么系统则不再默认为这个类提供缺省构造器。建议开发中手动的为当前类提供无参数构造方法。因为无参数构造方法太常用了
 *      12、构造方法君持重载机制。在-一个类当中编写多个构造方法，这多个构造方法显然已经构成方法重载机制。
 *
 */
public class User {

    //创建没有参数的构造方法
    public User(){
        System.out.println("It's a Constructor");
    }
    //创建有参数的构造方法
    public User(int a){
        System.out.println("这是一个带有int参数的构造方法");
    }
    public User(String b){
        System.out.println("这是一个带有String参数的构造方法");
    }
    public User(int c,String d){
        System.out.println("这是一个带有int和String参数的构造方法");
    }
}