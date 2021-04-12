public class Demo{
	public static void main (String[] args){
		 System.out.println("a");
		 //为long赋值时注意取值范围
		 //在未声明时，所有数值被当成int(-2147483648  ~  2147483647)处理
		 //所以在声明long类型时，尽量在最后加大写L(防止小写l与1混淆)
		 long a = 2222222222L;
		 System.out.println(a);
		 long b = 100L;
		 //无论超不超出取值范围
		 //只要是下级转换，就必须使用强制转换。
		 //注：损失精度之后，后果可能会很严重
		 int x = (int) b;
		 System.out.println(x);
		 byte by = 127;
		 byte by1 = 128;
		 System.out.println(by);
		 System.out.println(by1);
	}
}