public class Demo{
	public static void main (String[] args){
		System.out.println("Hello World!");
		for(int a = 1;a <= 9;a++){
			for(int b = 1;b <= a;b++){
				System.out.print(b+"*"+a+"="+(a*b));
				System.out.print("	");
			}
			System.out.println("");
		}
		System.out.println("====================================================");
		//*****************************************************
		//					求100以内的质数;
		//*****************************************************
		for(int a = 2;a <= 100; a++){	//控制要求的质数范围2-100
			boolean x = true;	//设一个布尔变量；每次循环被重新定义为true
			for(int b = 2;b < a;b++){	//设除数，恒小于a
				if(a % b == 0){		//若该数被除数整除，则不为质数
					x = false;		//修改布尔变量，阻止下一个if循环
					break;			//停止for循环，已经被整除，没有继续循环的必要
					}
				}
			if(x){					//若布尔值没被改变，则为质数，进行输出
				System.out.print(a);//若被改变，则不为质数，不被输出
				System.out.print("	");
				}
			}
		}
	}