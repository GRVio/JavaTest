public class Demo{
	public static void main(String[] args){
		//有关自增：++/--与=平级，运算时从左向右进行运算
		int a = 54;
		System.out.println(a);
		//注：a++虽然在输出时会输出a的值，但仍然会继续运算 = a + 1.
		System.out.println(a++);
		System.out.println(a);
		int b = 418;
		System.out.println(--b);
		/*
		<		小于
		>		大于
		<=		小于等于
		>=		大于等于
		==		等于
		!=		不等于
		关系运算符输出结果为布尔值
		*/
		System.out.println(a < b);
		System.out.println(a <= b);
		System.out.println(a > b);
		System.out.println(a >= b);
		System.out.println(a == b);
		System.out.println(a != b);
		byte c = 55;
		System.out.println(a == c);
		System.out.println(a);
		System.out.println(c);
		System.out.println(b > a & b > c);
		System.out.println(b == a && b >c);
		System.out.println(b > c && b ==a);
		System.out.println("----------------------------------------");
	if (b > c && b == a){
		System.out.println("true");
	} else {
		System.out.println("false");
	}
	/*
	&		与【并且】（两边算子都为true，结果才为true）
	|		或【或者】（两边算子有一个结果为true，结果即为true）
	!		非（取反，单目运算符，false为true,true为false）
	^		异或（两边算子不一样，结果为true）

	&&		短路与
	||		短路或
	*/
	System.out.println("++++++++++++++++++++++++++++++++++");
	System.out.println(5 > 2 & 5 < 7);//true
	System.out.println(4 < 2 | 8 > 4);//true
	System.out.println(4 < 2 & 8 > 4);//false
	System.out.println(!false);
	System.out.println(!true);
	}
}