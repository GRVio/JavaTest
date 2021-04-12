/*
	关于return语句
		*return语句一旦执行，所在的方法结束
		*在同一作用域中return后不能接任何语句，因为执行不到，编译报错。
*/
public class Demo{

	public static int a(){
	/*
		int a = 10;
			if(a > 3){
				return 1;
			} else {
				return 0;
			}
		换一种写法：
	*/
		//与上一个比较删去了else，因为如果if中return执行不到，方法则不会结束
		//而后会继续执行java语句，没必要写else
	/*	
		int a = 10;
		if(a > 3){
			return 1;
			//此处不可写代码，因为无论return是否执行，此处都不会被访问
			//System.out.println("123");
		}
		//此处不会报错，因为不在return后面
		System.out.println("123");
		return 0;
	*/
		//妙到家里的三目运算符，忘记请翻阅笔记
		return 10 > 3 ? 1 : 0;

	}
	public static void main(String[] args){
		//直接输出方法的返回值
		System.out.println(a());
	}

}