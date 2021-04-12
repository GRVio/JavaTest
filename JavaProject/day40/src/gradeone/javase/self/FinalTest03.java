package gradeone.javase.self;

public class FinalTest03 {

    public static void main(String[] args) {

        Chinese c = new Chinese();
        System.out.println(c.GUO_JI);
        System.out.println(Math.PAI);
    }
}

//π
class Math{

    public static final double PAI = 3.1415926;
}

// 中国人
class Chinese{
// 国籍
// 需求:每一个中国人的国籍都是中国,而且国籍不会发生改变，为了防止国籍被修改，建议加final修饰。
// final修饰的实例变量是不可变的，这种变量一般和static联合使用,被称为"常量"
// 常量的定义语法格式:
//      public static final类型常量名=值;
// java规范中要求所有常量的名字全部大写，每个单词之间使用下划线连接

    public static final String GUO_JI = "中国";
}
