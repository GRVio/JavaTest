public class Text{
	//方法重载与封装
	public static void main(String[] args) {
		//复习："q."调用对应class
		//"p"，class中的方法
		//即使不在同一个文件中也可以调用
		//有class文件即可，不需要java文件
		q.p("qwe");
		q.p(123);
		System.out.println("*******");
		//求1+2+3+...+a的和
		int a = 6;
		int asd = sum(a);
		System.out.println(asd);
	}//105   3.38
	public static int sum(int a){
		//当a=1时，返回1
		if (a == 1){
			return 1;
		}
		//当a!=1时，返回a的值，并再次调用sum方法将两者的和一并返回
		//此处再次调用方法时，程序停止，再次执行第二遍sum方法，直至方法结束
		return a + sum(a-1);
		}
}
/*class q{
	public static void p(byte a){
		System.out.println(a);
	}
	public static void p(short a){
		System.out.println(a);
	}
	public static void p(char a){
		System.out.println(a);
	}
	public static void p(String a){
		System.out.println(a);
	}
	public static void p(long a){
		System.out.println(a);
	}
	public static void p(int a){
		System.out.println(a);
	}
	public static void p(double a){
		System.out.println(a);
	}
	public static void p(float a){
		System.out.println(a);
	}
}*/