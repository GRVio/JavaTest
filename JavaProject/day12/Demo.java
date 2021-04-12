public class Demo{
	public static void main (String[] args ){
		//for循环---视频
		//for(括号内东西都可以不写，但必须有分号)
		//for(初始表达式；布尔表达式；更新表达式){java语句}
		for (int a = 1;a <= 10;a++){
			System.out.println(a);
		}
		int b = 0;
		//求100以内的奇数和
		for (int a = 1;a <= 100;a++){
			if (a % 2 !=0){
			System.out.println(a);
			b += a;
			System.out.println("sum ="+b);
			}
		}
		//改进版
		//c的定义在循环外，跳出循环依旧输出。
		//循环会改变c的变量，实现一次完成输出结果
		int c = 0;
		for (int a = 1;a <= 100; a++){
			if (a % 2 != 0){
				c += a;
			}
		}
		System.out.println("c ="+c);
	}
}