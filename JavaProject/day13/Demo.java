public class Demo{
	public static void main(String[] args){
		//for循环写九九乘法表，失败
		/*for(int a = 1;a < 10;a++){
			for(int b = 1;b < 10;b++){
				System.out.print(a+"*"+b+"="+(a*b));
				System.out.print("	");
			}
			System.out.println("	");
		}*/
		//尝试2
		for(int a = 1;a < 10;a++){ 						//外层循环9次--a为行号
			for(int b = 1;b <= a;b++){					//内层循环9次--b为列号
				System.out.print(b+"*"+a+"="+(a*b));	//b在后，代码好理解，b在前输出好看
				System.out.print("	");
			}
			System.out.println("	");
		}
		//成功，
		//总结：思路不对，列号不能大于行号，而不是要小于10
		//不能说内循环多少次由自己决定，而应该由i决定
		//i=1，第一行，循环1次，i=2，第二行，循环两次..第i行，循环i次
		System.out.println("============================================");
		//找出100以内的质数
		for(int a = 1;a <= 100;a++){
			if(a != 1){
				for(int b = 2;b < a;b++){
					if (a % b == 0);
				}
			}
		}
	}
}