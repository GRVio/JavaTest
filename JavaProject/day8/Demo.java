public class Demo{
    public static void main(String[] args){
        int a = 94;
        if(a>=90){
            System.out.println("A");
        } else if (a >= 80){
            System.out.println("B");
        } else {
            System.out.println("c");
        }
        System.out.println("----------------------------------");
        //另一种成绩表达思路
        //通过更改变量值，而不是更改输出字符串
        String a1 = "该考生的考试等级为";
        String b1 = "E等级";
        int c1 = 4;
        if (c1 < 0 || c1 > 100){
            System.out.println("对不起，您输入的成绩有误！");
        } else if (c1 >= 90){
            b1 = "A等级";
            System.out.println(a1 + b1);
        } else if (c1 >= 80){
            b1 = "B等级";
            System.out.println(a1 + b1);
        } else {
            System.out.println(a1 + b1);
        }
        //接受用户键盘输入
        //第一步，创建键盘扫描器对象
        java.util.Scanner s = new java.util.Scanner(System.in);
        //第二步，调用Scanner对象的next()方法，开始接受用户键盘输入
        //程序会执行到这里停下来，等待用户的输入
        //此处变量值为userInoutContent,而不是后面的s.next
        //String,为用户输入值的类型，可以换成int、double....
        String userInputContent = s.next();
        //至此，用户输入部分结束
        //用户为变量赋完值之后，我们可以直接拿来用
        System.out.println("您输入了：" + userInputContent);
        //实战：
        //根据用户输入的年龄，判断年龄区间
        //注意不要漏写 new
        java.util.Scanner qwe = new java.util.Scanner(System.in);
        //提示信息
        //此处为了不换行，去掉了ln
        System.out.print("请输入您的年龄");
        //注意输入非String型的值时，next后加东西
        int age = qwe.nextInt();
        if (age <= 10){
            System.out.println("小孩子");
        } else {
            System.out.println("大孩子");
        }
    }
}
