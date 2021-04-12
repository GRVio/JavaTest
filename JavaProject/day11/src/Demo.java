public class Demo {
    public static void main(String[] args) {
        System.out.println("欢迎使用简单运算器！");
        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.println("请输入第一个数字！");
        int num1 = s.nextInt();
        System.out.println("请输入运算符，仅限+ - * /");
        String str = s.next();
        System.out.println("请输入第二个数字！");
        int num2 = s.nextInt();
        switch (str) {
            case "+":
                System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
                break;
            case "-":
                System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
                break;
            case "*":
                System.out.println(num1 + "*" + num2 + "=" + (num1 * num2));
                break;
            case "/":
                System.out.println(num1 + "/" + num2 + "=" + (num1 / num2));
                break;
            default :
                System.out.println("ERROR!");
        }
    }
}
