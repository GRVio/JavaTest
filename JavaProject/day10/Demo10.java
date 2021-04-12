public class Demo10{
	public static void main (String[] args){
		//九九乘法表
		int a = 1;
		int b = 1;
		while (a < 10){
			while (b <= a ){
				System.out.print(b + "*" + a + "=" + (b*a));
				b++;
				System.out.print("	");
			}
			System.out.println("	");
			b = 1;a++;
		}
	}
}