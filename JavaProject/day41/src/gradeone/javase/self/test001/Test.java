package gradeone.javase.self.test001;

/**
 * 访问控制权限修饰符:
 *      1、访问控制权限修饰符来控制元素的访问范围
 *
 *      2、访问控制权限修饰符包括:
 *           public         表示公开的,在任何位置都可以访问
 *           protected      受保护的,在同包、子类中可以访问
 *           缺省            只能在同包中访问
 *           private        表示私有的,只能在本类中访问
 *      3、访问控制权限修饰符可以修饰类、变量、方法...
 *
 *      4、当某个数据只希望在子类中使用，使用protected修饰。
 *
 *      5、修饰符的范围：
 *          private<缺省<protected<public
 */
public class Test {

    public static void main(String[] args) {

        User u = new User();
        System.out.println(u.a);
        System.out.println(u.b);
    }
}
