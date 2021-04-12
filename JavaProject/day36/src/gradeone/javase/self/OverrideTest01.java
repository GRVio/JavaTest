package gradeone.javase.self;

/**
 * 关于方法覆盖：
 *      1、方法覆盖又被称为方法重写，英文单词：override【官方的】/overwrite
 *
 *      2、什么时候使用方法重写？
 *          当父类中的方法已经无法满足子类的业务需求，
 *          子类有必要将父类继承过来的方法重新进行编写，
 *          这个编写方法的过程被称为方法重写/方法覆盖。
 *        2.1、为什么不放弃继承直接编写？
 *            ？废话，难道要因为一个方法不能用放弃其他所有方法？？
 *            其他不用修改的方法再自己写一遍？1w个方法也写？？
 *
 *      3、什么时候满足方法重写？【方法重写格式】
 *          -方法重写发生在具有继承关系的父类和子类之间
 *          -返回值相同，方法名相同，参数列表相同【所有东西一模一样，建议直接复制】
 *          -访问权限不能更低，只能更高【访问权限：public、protected、private....】（此处由高到低排序）
 *              -父类若为private，子类可以写public，父类若为public，子类只能写public
 *          -抛出异常不能更多，可以更少【以后讲】
 *
 *      4、建议方法重写时复制粘贴，不要编写。编写容易出错，导致某个地方不同，不能覆盖【CV大法好】
 *          快捷键 Ctrl + O
 *
 *      5、注意：
 *          私有方法不能继承，所以不存在覆盖
 *          构造方法不能继承，所以不存在覆盖
 *          静态方法不存在覆盖【讲完多态解释】
 *
 */
public class OverrideTest01 {

    public static void main(String[] args) {

        Animal a = new Animal();
        a.doSome();

        Bird b = new Bird();
        b.doSome();

        Cat c = new Cat();
        c.doSome();

        YingWu y = new YingWu();
        y.doSome();

    }
}
