package src;

public class Test {

    public static void main(String[] args) {

        //创建对象
        //怎么查看访问的是哪个属性，查看访问的是哪个方法?
        //按ctrl键，鼠标移动到查看的元素上,出现下划线的时候开始单击。
        //另外，在一个类当中元素过多，想快速查看，在当前类中使用ctrl + F12快捷键，
        // 然后输入要查找的元素名称，该名称不一定输入全名称

        Account act1 = new Account();
        System.out.println("账号：" + act1.getActno());
        System.out.println("余额：" + act1.getBalance());

        Account act2 = new Account("Jack");
        System.out.println("账号：" + act2.getActno());
        System.out.println("余额：" + act2.getBalance());

        Account act3 = new Account(500.0);
        System.out.println("账号：" + act3.getActno());
        System.out.println("余额：" + act3.getBalance());

        Account act4= new Account("Jack",114514.0);
        System.out.println("账号：" + act4.getActno());
        System.out.println("余额：" + act4.getBalance());


        //给对象属性赋值
    }
}
