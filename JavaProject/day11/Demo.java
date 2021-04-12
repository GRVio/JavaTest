public class Demo{
	public static void main(String[] args){
		//switch 只能跟int String类型的值
		//byte short char也可以，但会自动转换为int/String
		int a = 1;
		int b = 4;
		//switch语句
		//default,相当于else
		switch(a){
			case 0:
			System.out.println("123");
			break;
			case 1:
			System.out.println("456");
			break;
			case 2:
			System.out.println("789");
			break;
			default :
			System.out.println("QAQ");
		}
		System.out.println("-----------------------------------");
		//case合并，满足任何一个case即可输出
		switch(a){
			case 1: case 2: case 3:
		System.out.println("741");
		break;
		}
		System.out.println("-----------------------------------");
		//case穿透，case后不加break，下一个case将不会进行条件判断，直接输出
		//除非遇到break，switch语句结束
		switch(a){
			case 1:
			System.out.println("321");
			case 2:
			System.out.println("654");
			break;
			case 3:
			System.out.println("987");
		}
		System.out.println("-----------------------------------");
		switch(a){
			case 4:case 5:case 1:
			System.out.println("abc");
	
			default :
			System.out.println("Error");
		}

		//简单计算器
		java.util.Scanner s = new java.util.Scanner(System.in);
		int num1 = s.nextInt();
		int num2 = s.nextInt();
		String str = s.next();
		System.out.println("欢迎使用简单运算器！");
		System.out.println("请输入第一个数字！");
		
	}
}