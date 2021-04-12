

public class dmeo {
    //成员变量，此处static不可省略
    static int x = 167;
    static int y;

    /**
     * 此变量为成员变量
     * 解释一下，成员变量可以在编写任意使用，但不可更改数值。在类体内声明
     * 在程序内编写的变量成为局部变量，但优先级高，相当于地头蛇，数据可更改
     * 成员变量可以声明后不赋值，系统会默认赋值，详见27行代码。
     * 数据类型                      默认值
     * ---------------------------------------------------------------
     * byte short int long          0
     * float double                 0.0
     * boolean                      false(true为1,false为0)
     * char                         \u0000
     * ---------------------------------------------------------------
     * 一切数据默认值都向0看齐
     */

    static public void main(String[] sad) {
        int 你好 = 123;
        System.out.println(你好);
        //Java中标识符可以用中文或日文，因为Java支持Unicode字符集
        System.out.println('a');
        //同时为多个变量赋值
        int a, b, c;
        a = b = c = 100;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        //int x = 50;
        System.out.println(x);
        System.out.println(y);
        //一个中文字为2字节，char赋值正好为2字节
        //虽然char可以储存2字节，但仍不能为其赋值为"ab"
        //char类型必须用单引号,双引号为字符串
        char d;
        d = 'y';
        System.out.println(d);
        char ch = '你';
        System.out.println(ch);
        //以下将复习char类型（根据视频38起）
        //转义字符"\"
        //首先，一个普通的n字符
        char a1 = 'n';
        System.out.println(a1);
        //添加转义字符后    "\n"视为一个字符，"换行符"，属于char类型的数据
        char a2 = '\n';
        System.out.println(a2);
        //tips:输出时可以直接写print，"ln"具有换行功能
        //print表示输出，println表示输出后换行
        System.out.print("abc");
        System.out.println("def");
        //接上，\n为换行,\t为"制表符"
        //与Tab效果相同，占8个字符，相当于4个空格
        //但空格与Tab并不相等，主要体现在Python上  = =
        System.out.println("Hello"+'\t'+"World");
        //输出一个反斜杠
        //反斜杠会改变后面的字符性质，特殊意义的字符会被转为普通字符
        //所以如果想输出一个反斜杠，需输入"\\"
        //这样第二个反斜杠会被第一个反斜杠转化为普通字符，从而达到输出"\"的效果
        //结论：想输出任意一个特殊字符，须在前加反斜杠
        char a3 = '\\';
        System.out.println(a3);
        //输出一个带双引号的HelloWorld：
        System.out.println("\"HelloWorld!\"");
        //Unicode编码，基本无了，写来玩玩
        char q = '\u559c';
        char w = '\u6b22';
        char e = '\u4f60';
        String r = "\u559c\u6b22\u4f60";
        System.out.print(q);
        System.out.print(w);
        System.out.println(e);
        System.out.println(r);
    }
}
