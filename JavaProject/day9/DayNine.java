public class DayNine {
    public static void main(String[] arg){
        //接受用户键盘输入
        //第一步，创建键盘扫描器对象
        java.util.Scanner s = new java.util.Scanner(System.in);
        //第二步，调用Scanner对象的next()方法，开始接受用户键盘输入
        //程序会执行到这里停下来，等待用户的输入
        //此处变量值为userInoutContent,而不是后面的s.next
        String userInputContent = s.next();
        //输出
        System.out.println("您输入了：" + userInputContent);
        java.util.Scanner qwe = new java.util.Scanner(System.in);
        int age = qwe.nextInt();
        if (age <= 10){
            System.out.println("小孩子");
        } else {
            System.out.println("大孩子");
        }
    }
}