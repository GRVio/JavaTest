public class Demo{
	//重申：写程序多用方法！
	//阶乘，5*4*3*2*1
	public static void main(String[] args) {
		int x = 5;
		int result = q(x);
		System.out.println(result);
	}
	public static int q(int a){
		//不用递归：
		/*int b = 1;
		for(int n = a;n >= 1;n--){
			b *= n;
		}
		return b;*/
		//使用递归
		//a=0时，返回1，因为0的阶乘为1
		if (a == 0){
			return 1;
		}
		//a!=1时，再次调用方法，并将结果与a相乘
		return a * q(a-1);
	}
}