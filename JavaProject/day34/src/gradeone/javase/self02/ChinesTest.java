package gradeone.javase.self02;

public class ChinesTest {

    public static void main(String[] args) {

        //使用方法二后依然成功输出
        //注意调用country时的格式
        Chinese zhangSan = new Chinese("1","张三");
        System.out.println(zhangSan.id + "," + zhangSan.name + "," + Chinese.country);

        Chinese liSi = new Chinese("2","李四");
        System.out.println(liSi.id + "," + liSi.name + "," + Chinese.country);
        //注意以下几点
        //所有静态变量都可以使用“类名.”，也可以使用“引用.”，但建议使用前者
        //采用后者，即使引用为null，也不会出现空指针异常，因为在调用时不需要引用参与
        System.out.println(Chinese.country);
        System.out.println(zhangSan.country);
        zhangSan = null;
        System.out.println(zhangSan.country);
    }
}
