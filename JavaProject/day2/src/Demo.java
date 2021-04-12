//第一章结束，开新篇敲第二章代码
public class Demo {

    public static void main(String[] xst) {
        /**
         * 标识符由字母、数字、下划线、美元符组成，但不能以数字开头,例：
        */
        int username;
        char user_name;
        char $user;
        char _user;
        int x = 0, y;
        y = x + 3;
        System.out.println(y);
    /*
    数据类型：数值型{整数类型：byte,short,int,long
                  浮点类型：float,double}
            字符型：char
            布尔型：boolean
     */
        /**
         * byte:取值范围 -2^7~2^7-1
         * short:取值范围 -2^15~2^15-1
         * int:取值范围 -2^31~2^31-1
         * long:取值范围 -2^63~2^63-1
         * 若为“long”赋值时，数值超出了int的取值范围，需在数值后加L（不限大小写），例：
         * long = 220000000000L  超出了int的取值范围，必须加L
         */
        float f = 13.4f; //为单精度(float)变量赋值时，数值后必须加f(不限大小写)
        double d = 156.1; //双精度不作要求
        char c = 'a'; //为char变量赋值时，需用单引号括起来
        char ch = 89; //也可为其赋一个数字(0~65535)
        boolean flag = true; //"t"不能大写，false同理
        flag = false; //更改变量，无需声明
        byte b = 3; //声明一个byte变量
        int o = b; //将byte类型转化为int类型，无需声明
        /**
         * 注：此处不声明是因为int取值范围大于byte，
         * 其他数值类型同理，
         * 如需下级转换，需要进行声明
         * 例：
         */
        int q = 9;
        byte by = (byte) q; //q前面即为声明
        //下级转换会造成数据丢失，如：
        int in = 45654;
        byte wiqh = (byte) in;
        System.out.println(wiqh); //原因是转化为二进制后，保留字符减少，导致数据丢失。
        //一个byte的变量在运算过程中会自动提升为int类型，例：
        byte a123 = 3;
        byte b123 = 4;
        byte c123 = (byte) (a123 + b123); //此时需强制转换，并添加括号
        /**
         * 与python不同，Java的变量被赋值之后会一直存在于"变量的作用域里"
         * 例如：
         * {  a = 1  }，则在括号内，a = 1有效，若在括号外引用则报错
         */
        /**
         * 运算符
         * *+/-按数学法则计算
         * %--取模(取余数)
         * ++  自增  例： a++ --> a+1
         * 且当"++"在a前面时，先计算自增，然后进行计算，
         * 若"++"在a后面。则先进行计算再进行自增运算
         * 自减("--")同理，例：
         */
        int Asdf = 1, Bsdf = 3, Csdf;
        Csdf = Bsdf + Asdf++;
        System.out.println(Asdf);
        System.out.println(Bsdf);
        System.out.println(Csdf);
        /**
         * 另，两个整数进行除法运算时，
         * 无论结果如何，取整数，舍弃小数部分
         * 若有小数参与运算，结果也为一个小数。
         * 在进行  %  运算时，输出结果的符号与  %  左边数字的符号相同
         * 与右边符号无关
         * 例： （-5）%3=-2    5%（-3）=2
         */
//2020/11/19 以上
    }
}

