package gradeone.javase.self05;

/**
 * 方法什么时候定义为静态的方法？
 *      -方法描述的是动作，当所有的对象执行这个动作的时候，最终产生影响是一样的
 *      那么这个动作已经不再属于某一个对象动作了
 *      可以将这个动作提升为类级别的动作，模板级别的动作。
 * 静态方法中无法直接访问实例变量和实例方法。
 */
public class StaticTest {

    int i = 10;

    public void doSome(){

    }
    public static void main(String[] args) {

        //System.out.println(i);
        //doSome();
        StaticTest st = new StaticTest();
        System.out.println(st.i);
        st.doSome();
        MathUtil.sumInt(123,456);
        MathUtil.divide(120,20);
    }
}
