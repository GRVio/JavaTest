public class Demo{
	public static void main(String[] args){
		//break语句，结束当前循环
		for(int a = 1;a <= 10;a++){
			System.out.println(a);
			if(a == 7){
				break;
			}
		}
		System.out.println("========================================");
		//break只能结束离他最近的一个循环
		for(int a = 1;a <= 10;a++){
			for(int b = 1;b < 10;b++){
				System.out.print(b);
				if (b==6){
					break;
				}
			}
			System.out.println("	");
		}
		System.out.println("**************************************");
		//break的定向打击
		//给for循环命名为A
		A:for(int a = 1;a <= 10;a++){
			B:for(int b = 1;b < 10;b++){
				System.out.print(b);
				//满足条件打破A循环
				if (b==6){
					break A;
				}
			}
		}
		System.out.println("");
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
		//continue语句
		//同Python,停止当前循环，直接进行下一次循环
		//continue也可以定向打击，continue A
		// ========================================================
		boolean a1 = true;
		for (int a = 2; a <= 100;a++){
			for (int b = 2;b < a;b++){
				if (a % b == 0){
					a1 = false;
				}
				if (a1){
					System.out.println(a);
					break;
				}
			}
		}
	}
}